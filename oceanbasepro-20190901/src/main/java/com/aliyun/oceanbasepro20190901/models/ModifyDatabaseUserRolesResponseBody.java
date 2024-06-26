// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("TenantUser")
    public ModifyDatabaseUserRolesResponseBodyTenantUser tenantUser;

    public static ModifyDatabaseUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseUserRolesResponseBody self = new ModifyDatabaseUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDatabaseUserRolesResponseBody setTenantUser(ModifyDatabaseUserRolesResponseBodyTenantUser tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public ModifyDatabaseUserRolesResponseBodyTenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static class ModifyDatabaseUserRolesResponseBodyTenantUserUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>user_pay_ro</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ModifyDatabaseUserRolesResponseBodyTenantUserUsers build(java.util.Map<String, ?> map) throws Exception {
            ModifyDatabaseUserRolesResponseBodyTenantUserUsers self = new ModifyDatabaseUserRolesResponseBodyTenantUserUsers();
            return TeaModel.build(map, self);
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUserUsers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUserUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ModifyDatabaseUserRolesResponseBodyTenantUser extends TeaModel {
        /**
         * <p>Example 1</p>
         * 
         * <strong>example:</strong>
         * <p>sms_pre</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>t33h8y08k****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Users")
        public java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> users;

        public static ModifyDatabaseUserRolesResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyDatabaseUserRolesResponseBodyTenantUser self = new ModifyDatabaseUserRolesResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setUsers(java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> getUsers() {
            return this.users;
        }

    }

}
