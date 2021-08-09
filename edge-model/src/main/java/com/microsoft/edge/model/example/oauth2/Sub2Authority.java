package com.microsoft.edge.model.example.oauth2;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 三级权限
 */
@Data
public class Sub2Authority implements Serializable {
    private Integer id;

    private Integer subAuthorityId;

    private String authority;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}