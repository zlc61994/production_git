//package com.production.AuthController;
//
//import com.production.domain.User;
//import com.production.service.AuthService;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.SimpleAuthenticationInfo;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class CustomRealm extends AuthorizingRealm {
//
//    @Autowired
//    AuthService authService;
//    public String getName(){
//        return "CustomRealm";
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//
//        String username = (String) authenticationToken.getPrincipal();
//        User user = authService.findUserByUsername(username);
//
//        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
//
//    }
//
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
////        User primaryPrincipal = (User) principalCollection.getPrimaryPrincipal();
////        String id = String.valueOf(primaryPrincipal.getId());
////        List<SysPermission> permissions = authService.findPermissionsByUserId(id);
////        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
////        for (SysPermission permission:permissions){
////            simpleAuthorizationInfo.addStringPermission(permission.getPercode());
////        }
//        return null;
//    }
//}
