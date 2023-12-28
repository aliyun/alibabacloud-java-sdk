// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of database accounts in the tenant.</p>
     */
    @NameInMap("TenantUser")
    public CreateTenantUserResponseBodyTenantUser tenantUser;

    public static CreateTenantUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserResponseBody self = new CreateTenantUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantUserResponseBody setTenantUser(CreateTenantUserResponseBodyTenantUser tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public CreateTenantUserResponseBodyTenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static class CreateTenantUserResponseBodyTenantUserRoles extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Role")
        public String role;

        public static CreateTenantUserResponseBodyTenantUserRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantUserResponseBodyTenantUserRoles self = new CreateTenantUserResponseBodyTenantUserRoles();
            return TeaModel.build(map, self);
        }

        public CreateTenantUserResponseBodyTenantUserRoles setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CreateTenantUserResponseBodyTenantUserRoles setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class CreateTenantUserResponseBodyTenantUser extends TeaModel {
        @NameInMap("Roles")
        public java.util.List<CreateTenantUserResponseBodyTenantUserRoles> roles;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserStatus")
        public String userStatus;

        @NameInMap("UserType")
        public String userType;

        public static CreateTenantUserResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantUserResponseBodyTenantUser self = new CreateTenantUserResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public CreateTenantUserResponseBodyTenantUser setRoles(java.util.List<CreateTenantUserResponseBodyTenantUserRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CreateTenantUserResponseBodyTenantUserRoles> getRoles() {
            return this.roles;
        }

        public CreateTenantUserResponseBodyTenantUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateTenantUserResponseBodyTenantUser setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

        public CreateTenantUserResponseBodyTenantUser setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
