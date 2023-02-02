// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of database accounts in the tenant.</p>
     */
    @NameInMap("TenantUser")
    public java.util.List<ModifyTenantUserStatusResponseBodyTenantUser> tenantUser;

    public static ModifyTenantUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserStatusResponseBody self = new ModifyTenantUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantUserStatusResponseBody setTenantUser(java.util.List<ModifyTenantUserStatusResponseBodyTenantUser> tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public java.util.List<ModifyTenantUserStatusResponseBodyTenantUser> getTenantUser() {
        return this.tenantUser;
    }

    public static class ModifyTenantUserStatusResponseBodyTenantUser extends TeaModel {
        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The status of the database account. Valid values:   </p>
         * <p>- LOCKED: The account is locked. </p>
         * <p>- ONLINE: The account is unlocked.</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        public static ModifyTenantUserStatusResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantUserStatusResponseBodyTenantUser self = new ModifyTenantUserStatusResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public ModifyTenantUserStatusResponseBodyTenantUser setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyTenantUserStatusResponseBodyTenantUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ModifyTenantUserStatusResponseBodyTenantUser setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

    }

}
