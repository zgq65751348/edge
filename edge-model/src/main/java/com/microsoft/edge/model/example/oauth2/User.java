package com.microsoft.edge.model.example.oauth2;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * @author 
 * 用户表
 */
@Data
@Builder
public class User implements Serializable {
    private Long id;

    private String username;

    private String password;

    private Boolean accountExpired;

    private Boolean accountLocked;

    private Boolean credentialsExpired;

    private Boolean enabled;

    private Long phone;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}