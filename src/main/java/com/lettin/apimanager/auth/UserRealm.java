package com.lettin.apimanager.auth;

import com.lettin.apimanager.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UserRealm
 * @Description TODO
 * @Author zhanghuapei
 * @Date 2018/10/9 0009 16:04
 * @Version 1.0
 **/
// @Component
// @MapperScan("com.lettin.apimanager.mapper")
public class UserRealm extends AbstractUserRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }

    // @Override
    // public UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo) {
    //     Set<String> userRoles = new HashSet<>();
    //     Set<String> userPermissions = new HashSet<>();
    //     //TODO 获取当前用户下拥有的所有角色列表,及权限
    //     return new UserRolesAndPermissions(userRoles, userPermissions);
    // }
    //
    // @Override
    // public UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo) {
    //     Set<String> userRoles = new HashSet<>();
    //     Set<String> userPermissions = new HashSet<>();
    //     //TODO 获取当前用户下拥有的所有角色列表,及权限
    //     return new UserRolesAndPermissions(userRoles, userPermissions);
    // }
}
