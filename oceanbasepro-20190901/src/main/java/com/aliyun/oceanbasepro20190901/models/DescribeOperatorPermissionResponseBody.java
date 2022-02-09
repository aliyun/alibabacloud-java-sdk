// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOperatorPermissionResponseBody extends TeaModel {
    // 授权信息
    @NameInMap("OperatorPermission")
    public java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermission> operatorPermission;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorPermissionResponseBody self = new DescribeOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorPermissionResponseBody setOperatorPermission(java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermission> operatorPermission) {
        this.operatorPermission = operatorPermission;
        return this;
    }
    public java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermission> getOperatorPermission() {
        return this.operatorPermission;
    }

    public DescribeOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOperatorPermissionResponseBodyOperatorPermissionRoles extends TeaModel {
        // 具体权限
        @NameInMap("Role")
        public String role;

        // 状态
        @NameInMap("Status")
        public String status;

        public static DescribeOperatorPermissionResponseBodyOperatorPermissionRoles build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorPermissionResponseBodyOperatorPermissionRoles self = new DescribeOperatorPermissionResponseBodyOperatorPermissionRoles();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorPermissionResponseBodyOperatorPermissionRoles setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeOperatorPermissionResponseBodyOperatorPermissionRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeOperatorPermissionResponseBodyOperatorPermission extends TeaModel {
        // 到期时间
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // Oceanbase集群ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 权限列表
        @NameInMap("Roles")
        public java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermissionRoles> roles;

        public static DescribeOperatorPermissionResponseBodyOperatorPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorPermissionResponseBodyOperatorPermission self = new DescribeOperatorPermissionResponseBodyOperatorPermission();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorPermissionResponseBodyOperatorPermission setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeOperatorPermissionResponseBodyOperatorPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOperatorPermissionResponseBodyOperatorPermission setRoles(java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermissionRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<DescribeOperatorPermissionResponseBodyOperatorPermissionRoles> getRoles() {
            return this.roles;
        }

    }

}
