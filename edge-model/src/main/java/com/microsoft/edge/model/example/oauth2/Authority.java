package com.microsoft.edge.model.example.oauth2;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 权限表
 */
@Data
public class Authority implements Serializable {
    private Integer id;

    private String authority;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}