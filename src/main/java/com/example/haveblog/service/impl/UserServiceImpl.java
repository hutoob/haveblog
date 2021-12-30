package com.example.haveblog.service.impl;

import com.example.haveblog.entity.User;
import com.example.haveblog.mapper.UserMapper;
import com.example.haveblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HaveBlog
 * @since 2021-12-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
