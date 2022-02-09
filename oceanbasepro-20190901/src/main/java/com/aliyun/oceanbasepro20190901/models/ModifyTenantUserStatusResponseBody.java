// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserStatusResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 租户中的数据库账号信息
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
        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 账号名称。
        @NameInMap("UserName")
        public String userName;

        // 数据库账号的状态。 - LOCKED：锁定 - ONLINE：解锁
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
