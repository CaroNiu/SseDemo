package com.sse.ssedemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sse.ssedemo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author niuheng
 * @date 2023年11月27日 17:38
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
