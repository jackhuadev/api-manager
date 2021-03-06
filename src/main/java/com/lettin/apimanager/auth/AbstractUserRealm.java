package com.lettin.apimanager.auth;

import com.lettin.apimanager.entity.User;
import com.lettin.apimanager.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName AbstractUserRealm
 * @Description TODO
 * @Author zhanghuapei
 * @Date 2018/10/9 0009 14:59
 * @Version 1.0
 **/
public abstract class AbstractUserRealm extends AuthorizingRealm {

    // private static final Logger logger = LoggerFactory.getLogger(AbstractUserRealm.class);
    //
    // @Autowired
    // private UserMapper userRepository;
    // //获取用户组的权限信息
    // public abstract UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo);
    // //获取用户角色的权限信息
    // public abstract UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo);
    //
    // @Override
    // protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    //     String currentLoginName = (String) principals.getPrimaryPrincipal();
    //     HashSet<String> userRoles = new HashSet<>();
    //     HashSet<String> userPermissions = new HashSet<>();
    //     //dao
    //     User userInfo = userRepository.findByLoginName(currentLoginName);
    //     if (userInfo != null) {
    //         UserRolesAndPermissions groupContainer  = doGetGroupAuthorizationInfo(userInfo);
    //         UserRolesAndPermissions roleContainer = doGetRoleAuthorizationInfo(userInfo);
    //         userRoles.addAll(groupContainer.getUserRoles());
    //         userRoles.addAll(roleContainer.getUserRoles());
    //
    //         userPermissions.addAll(groupContainer.getUserPermissions());
    //         userPermissions.addAll(roleContainer.getUserPermissions());
    //     }else{
    //         throw new AuthorizationException();
    //     }
    //     SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
    //     authorizationInfo.addRoles(userRoles);
    //     authorizationInfo.addStringPermissions(userPermissions);
    //     logger.info("###【获取角色成功】[SessionId] => {}", SecurityUtils.getSubject().getSession().getId());
    //     return null;
    // }
    //
    // @Override
    // protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    //     //UsernamePasswordToken对象用来存放提交的登录信息
    //     UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
    //     //查出是否有此用户
    //     User user = userRepository.findByLoginName(token.getUsername());
    //     if (user != null) {
    //         // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
    //         return new SimpleAuthenticationInfo(user.getLoginName(), user.getPassword(), getName());
    //     }
    //     return null;
    // }
    //
    // protected class UserRolesAndPermissions {
    //     Set<String> userRoles;
    //     Set<String> userPermissions;
    //
    //     public UserRolesAndPermissions(Set<String> userRoles, Set<String> userPermissions) {
    //         this.userRoles = userRoles;
    //         this.userPermissions = userPermissions;
    //     }
    //
    //     public Set<String> getUserRoles() {
    //         return userRoles;
    //     }
    //
    //     public Set<String> getUserPermissions() {
    //         return userPermissions;
    //     }
    // }
}
