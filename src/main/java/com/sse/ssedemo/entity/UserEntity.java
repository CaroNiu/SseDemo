package com.sse.ssedemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author niuheng
 * @date 2023年11月27日 17:38
 */
@Data
@TableName(value ="USER")
public class UserEntity {

    private String id;

    private String name;
}
