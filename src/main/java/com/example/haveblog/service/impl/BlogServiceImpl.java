package com.example.haveblog.service.impl;

import com.example.haveblog.entity.Blog;
import com.example.haveblog.mapper.BlogMapper;
import com.example.haveblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
