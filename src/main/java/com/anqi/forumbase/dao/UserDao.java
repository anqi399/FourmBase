package com.anqi.forumbase.dao;

import com.anqi.forumbase.pojo.UserPojo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<UserPojo> {

}
