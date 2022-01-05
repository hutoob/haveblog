package com.example.haveblog.common.dto;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName LoginDto.java
 * @Description TODO
 * @createTime 2022年01月04日 11:42:00
 */
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
}
