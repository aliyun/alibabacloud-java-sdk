// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAuthRolesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<ListAuthRolesResponseBodyRoles> roles;

    public static ListAuthRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRolesResponseBody self = new ListAuthRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthRolesResponseBody setRoles(java.util.List<ListAuthRolesResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<ListAuthRolesResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public static class ListAuthRolesResponseBodyRolesToken extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public String expiration;

        public static ListAuthRolesResponseBodyRolesToken build(java.util.Map<String, ?> map) throws Exception {
            ListAuthRolesResponseBodyRolesToken self = new ListAuthRolesResponseBodyRolesToken();
            return TeaModel.build(map, self);
        }

        public ListAuthRolesResponseBodyRolesToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public ListAuthRolesResponseBodyRolesToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAuthRolesResponseBodyRolesToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public ListAuthRolesResponseBodyRolesToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

    }

    public static class ListAuthRolesResponseBodyRoles extends TeaModel {
        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleARN")
        public String roleARN;

        @NameInMap("IsEnabled")
        public String isEnabled;

        @NameInMap("Token")
        public ListAuthRolesResponseBodyRolesToken token;

        @NameInMap("RoleType")
        public String roleType;

        public static ListAuthRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListAuthRolesResponseBodyRoles self = new ListAuthRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListAuthRolesResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListAuthRolesResponseBodyRoles setRoleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }
        public String getRoleARN() {
            return this.roleARN;
        }

        public ListAuthRolesResponseBodyRoles setIsEnabled(String isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public String getIsEnabled() {
            return this.isEnabled;
        }

        public ListAuthRolesResponseBodyRoles setToken(ListAuthRolesResponseBodyRolesToken token) {
            this.token = token;
            return this;
        }
        public ListAuthRolesResponseBodyRolesToken getToken() {
            return this.token;
        }

        public ListAuthRolesResponseBodyRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
