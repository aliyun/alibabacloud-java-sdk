// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOperatorPermissionResponseBody extends TeaModel {
    // 授权信息
    @NameInMap("OperatorPermission")
    public java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermission> operatorPermission;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperatorPermissionResponseBody self = new ModifyOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOperatorPermissionResponseBody setOperatorPermission(java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermission> operatorPermission) {
        this.operatorPermission = operatorPermission;
        return this;
    }
    public java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermission> getOperatorPermission() {
        return this.operatorPermission;
    }

    public ModifyOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOperatorPermissionResponseBodyOperatorPermissionRoles extends TeaModel {
        // 具体权限
        @NameInMap("Role")
        public String role;

        // 状态
        @NameInMap("Status")
        public String status;

        public static ModifyOperatorPermissionResponseBodyOperatorPermissionRoles build(java.util.Map<String, ?> map) throws Exception {
            ModifyOperatorPermissionResponseBodyOperatorPermissionRoles self = new ModifyOperatorPermissionResponseBodyOperatorPermissionRoles();
            return TeaModel.build(map, self);
        }

        public ModifyOperatorPermissionResponseBodyOperatorPermissionRoles setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyOperatorPermissionResponseBodyOperatorPermissionRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyOperatorPermissionResponseBodyOperatorPermission extends TeaModel {
        // 有效时间
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // Oceanbase集群ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 权限列表
        @NameInMap("Roles")
        public java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermissionRoles> roles;

        public static ModifyOperatorPermissionResponseBodyOperatorPermission build(java.util.Map<String, ?> map) throws Exception {
            ModifyOperatorPermissionResponseBodyOperatorPermission self = new ModifyOperatorPermissionResponseBodyOperatorPermission();
            return TeaModel.build(map, self);
        }

        public ModifyOperatorPermissionResponseBodyOperatorPermission setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ModifyOperatorPermissionResponseBodyOperatorPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyOperatorPermissionResponseBodyOperatorPermission setRoles(java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermissionRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<ModifyOperatorPermissionResponseBodyOperatorPermissionRoles> getRoles() {
            return this.roles;
        }

    }

}
