package com.chunjae.test03.persistence;

import com.chunjae.test03.entity.UserAuthority;
import com.chunjae.test03.entity.UserInfo;

public interface UserMapper {
    //사용자 정보 조회
    UserInfo getUserInfo(String userId);

    //사용자 권한 조회
    UserAuthority getUserAuthorities(String userId);

    //사용자 등록
    public int insertUser(UserInfo userinfo);

    //사용자 권한 등록
    public int insertUserAuth(UserInfo userinfo);

    //사용자 중복체크
    int duplicateUserCheck(String userId);
}
