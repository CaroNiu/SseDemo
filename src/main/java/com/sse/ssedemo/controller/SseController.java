package com.sse.ssedemo.controller;

import com.sse.ssedemo.util.SseEmitterUtil;
import com.sse.ssedemo.vo.OpenResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/req")
public class SseController {


    /**
     * 用于创建连接
     */
    @GetMapping("/connect/{userId}")
    public SseEmitter connect(@PathVariable String userId) {
        return SseEmitterUtil.connect(userId);
    }

    /**
     * 推送给所有人
     *
     * @param message
     * @return
     */
    @GetMapping("/push/{message}")
    public OpenResult push(@PathVariable(name = "message") String message) throws InterruptedException {
        //获取连接人数
        int userCount = SseEmitterUtil.getUserCount();
        //如果无在线人数，返回
        if(userCount<1){
            return OpenResult.fail(0,"无人在线！");
        }
        // 循环遍历字符串中的每个字符
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            Thread.sleep(500);
            SseEmitterUtil.batchSendMessage(String.valueOf(currentChar));
        }
        //结束推送换行符
        SseEmitterUtil.batchSendMessage("<br/>");
        return OpenResult.succ("推送消息成功");
    }

    /**
     * 发送给单个人
     *
     * @param message
     * @param userid
     * @return
     */
    @GetMapping("/push_one/{messsage}/{userid}")
    public OpenResult pushOne(@PathVariable(name = "message") String message, @PathVariable(name = "userid") String userid) {
        SseEmitterUtil.sendMessage(userid, message);
        return OpenResult.succ("推送消息给" + userid);
    }

    /**
     * 关闭连接
     */
    @GetMapping("/close/{userid}")
    public OpenResult close(@PathVariable("userid") String userid) {
        SseEmitterUtil.removeUser(userid);
        return OpenResult.succ("连接关闭");
    }
}
