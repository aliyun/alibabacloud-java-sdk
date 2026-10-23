// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The newly created or idempotently matched permission records.</p>
     */
    @NameInMap("records")
    public java.util.List<RegisterAppResourcePermissionsResponseBodyRecords> records;

    /**
     * <p>The request tracking ID.</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T23:59:59+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>The platform user ID of the grantor.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("grantedBy")
        public String grantedBy;

        /**
         * <p>The principal ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("granteeId")
        public String granteeId;

        /**
         * <p>The principal name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("granteeName")
        public String granteeName;

        /**
         * <p>The tenant to which the cross-tenant USER belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("granteeTenantId")
        public String granteeTenantId;

        /**
         * <p>The principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("granteeType")
        public String granteeType;

        /**
         * <p>The permission.</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        @NameInMap("permission")
        public String permission;

        /**
         * <p>The permission record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("permissionId")
        public Long permissionId;

        /**
         * <p>The resource key.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The update time.</p>
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
