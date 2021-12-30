package com.example.haveblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName AccountProfile.java
 * @Description TODO
 * @createTime 2021年12月30日 11:08:00
 */
    @Data
    public class AccountProfile implements Serializable {
        private Long id;

        private String username;

        private String avatar;

        private String email;

    }
