package com.example.haveblog.util;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName ShiroUtil.java
 * @Description TODO
 * @createTime 2022年01月04日 13:05:00
 */

import com.example.haveblog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    public static AccountProfile getProfile(){

        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
