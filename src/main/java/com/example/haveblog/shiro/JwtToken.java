package com.example.haveblog.shiro;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName JwtToken.java
 * @Description TODO
 * @createTime 2021年12月29日 17:29:00
 */
import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
