// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAuthRolesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8E2C1BB9-57C4-5051-9EF2-570ADC03A164</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>STS.NU************TT5LoC</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>E1h2n66Duo1D**********c79JVk59R6i</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>2021-03-19T19:14:42Z</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <strong>example:</strong>
         * <p>CAISggJ1q6Ft5B2yf***************aAaDf+bmceH2MNtNe9XtmTXJytadQ2T0RT8uOA+4kSypOPxSHjdjmnQjbdA/Q9MyNtTErQ/m45RNsg==</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static ListAuthRolesResponseBodyRolesToken build(java.util.Map<String, ?> map) throws Exception {
            ListAuthRolesResponseBodyRolesToken self = new ListAuthRolesResponseBodyRolesToken();
            return TeaModel.build(map, self);
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

        public ListAuthRolesResponseBodyRolesToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class ListAuthRolesResponseBodyRoles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEnabled")
        public String isEnabled;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::1557********904:role/aliyunodpspaidefaultrole</p>
         */
        @NameInMap("RoleARN")
        public String roleARN;

        /**
         * <strong>example:</strong>
         * <p>AliyunODPSPAIDefaultRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>PaiStudio。</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("Token")
        public ListAuthRolesResponseBodyRolesToken token;

        public static ListAuthRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListAuthRolesResponseBodyRoles self = new ListAuthRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListAuthRolesResponseBodyRoles setIsEnabled(String isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public String getIsEnabled() {
            return this.isEnabled;
        }

        public ListAuthRolesResponseBodyRoles setRoleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }
        public String getRoleARN() {
            return this.roleARN;
        }

        public ListAuthRolesResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListAuthRolesResponseBodyRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ListAuthRolesResponseBodyRoles setToken(ListAuthRolesResponseBodyRolesToken token) {
            this.token = token;
            return this;
        }
        public ListAuthRolesResponseBodyRolesToken getToken() {
            return this.token;
        }

    }

}
