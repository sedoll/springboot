package com.chunjae.test03.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
public class UserInfo implements UserDetails {
    private static final long serialVersionUID = 1L;
    //사용자 id
    private String userId;

    //사용자 이름
    private String userName;

    //패스워드
    private String passwd;

    //이메일
    private String email;

    //전화번호
    private String tel;

    //가입일
    private String regdate;

    //회원포인트
    private int pt;

    //사용여부
    private String useYn;

    //권한 list
    public List<UserAuthority> authorities;

    //권한
    public String authority;

    //권한 이름
    public String authorityNm;

    //권한 문자열
    public String auth;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return passwd;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
