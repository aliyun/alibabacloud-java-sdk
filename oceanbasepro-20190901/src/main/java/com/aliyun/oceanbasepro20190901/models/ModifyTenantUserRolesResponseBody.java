// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户中的数据库账号信息。
    @NameInMap("TenantUser")
    public ModifyTenantUserRolesResponseBodyTenantUser tenantUser;

    public static ModifyTenantUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserRolesResponseBody self = new ModifyTenantUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantUserRolesResponseBody setTenantUser(ModifyTenantUserRolesResponseBodyTenantUser tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public ModifyTenantUserRolesResponseBodyTenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static class ModifyTenantUserRolesResponseBodyTenantUserUserRole extends TeaModel {
        // 数据库(schema)名称
        @NameInMap("Database")
        public String database;

        // 是否授权成功。
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        // 拥有的角色。
        @NameInMap("Role")
        public String role;

        // 表的名称。
        @NameInMap("Table")
        public String table;

        public static ModifyTenantUserRolesResponseBodyTenantUserUserRole build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantUserRolesResponseBodyTenantUserUserRole self = new ModifyTenantUserRolesResponseBodyTenantUserUserRole();
            return TeaModel.build(map, self);
        }

        public ModifyTenantUserRolesResponseBodyTenantUserUserRole setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ModifyTenantUserRolesResponseBodyTenantUserUserRole setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public ModifyTenantUserRolesResponseBodyTenantUserUserRole setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyTenantUserRolesResponseBodyTenantUserUserRole setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class ModifyTenantUserRolesResponseBodyTenantUser extends TeaModel {
        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 账号名称。
        @NameInMap("UserName")
        public String userName;

        // 账号类型。 Admin：超级账户 Normal：普通账户
        @NameInMap("UserRole")
        public java.util.List<ModifyTenantUserRolesResponseBodyTenantUserUserRole> userRole;

        public static ModifyTenantUserRolesResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantUserRolesResponseBodyTenantUser self = new ModifyTenantUserRolesResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public ModifyTenantUserRolesResponseBodyTenantUser setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyTenantUserRolesResponseBodyTenantUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ModifyTenantUserRolesResponseBodyTenantUser setUserRole(java.util.List<ModifyTenantUserRolesResponseBodyTenantUserUserRole> userRole) {
            this.userRole = userRole;
            return this;
        }
        public java.util.List<ModifyTenantUserRolesResponseBodyTenantUserUserRole> getUserRole() {
            return this.userRole;
        }

    }

}
