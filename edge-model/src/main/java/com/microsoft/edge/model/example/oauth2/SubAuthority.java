package com.microsoft.edge.model.example.oauth2;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 二级权限
 */
@Data
public class SubAuthority implements Serializable {
    private Integer id;

    private Integer authorityId;

    private String authority;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}