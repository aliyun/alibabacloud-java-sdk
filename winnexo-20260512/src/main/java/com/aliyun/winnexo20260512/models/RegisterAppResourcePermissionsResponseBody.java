// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述；成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>新建或幂等命中的权限记录</p>
     */
    @NameInMap("records")
    public java.util.List<RegisterAppResourcePermissionsResponseBodyRecords> records;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RegisterAppResourcePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterAppResourcePermissionsResponseBody self = new RegisterAppResourcePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterAppResourcePermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterAppResourcePermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterAppResourcePermissionsResponseBody setRecords(java.util.List<RegisterAppResourcePermissionsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<RegisterAppResourcePermissionsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public RegisterAppResourcePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterAppResourcePermissionsResponseBodyRecords extends TeaModel {
        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>到期时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>授权人平台用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("grantedBy")
        public String grantedBy;

        /**
         * <p>主体 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

        /**
         * <p>主体名称</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("granteeName")
        public String granteeName;

        /**
         * <p>跨租户 USER 所属租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>主体类型</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>权限点</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        @NameInMap("permission")
        public String permission;

        /**
         * <p>权限记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("permissionId")
        public Long permissionId;

        /**
         * <p>资源键</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>资源类型</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static RegisterAppResourcePermissionsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            RegisterAppResourcePermissionsResponseBodyRecords self = new RegisterAppResourcePermissionsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setGrantedBy(String grantedBy) {
            this.grantedBy = grantedBy;
            return this;
        }
        public String getGrantedBy() {
            return this.grantedBy;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setGranteeName(String granteeName) {
            this.granteeName = granteeName;
            return this;
        }
        public String getGranteeName() {
            return this.granteeName;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setGranteeTenantId(String granteeTenantId) {
            this.granteeTenantId = granteeTenantId;
            return this;
        }
        public String getGranteeTenantId() {
            return this.granteeTenantId;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setGranteeType(String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public String getGranteeType() {
            return this.granteeType;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setPermissionId(Long permissionId) {
            this.permissionId = permissionId;
            return this;
        }
        public Long getPermissionId() {
            return this.permissionId;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public RegisterAppResourcePermissionsResponseBodyRecords setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
