package com.chunjae.test03.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class UserAuthority implements GrantedAuthority {
    private static final long serialVersionUID = 1L;

    private String authority;
    private String authorityNm;

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
