package com.microsoft.edge.model.example.oauth2;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户权限
 */
@Data
public class UserAuthority implements Serializable {
    private Integer id;

    private Long userId;

    private Integer sub2AuthorityId;

    private static final long serialVersionUID = 1L;
}