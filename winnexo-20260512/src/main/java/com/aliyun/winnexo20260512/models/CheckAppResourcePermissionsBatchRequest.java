// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionsBatchRequest extends TeaModel {
    /**
     * <p>检查项</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("checks")
    public java.util.List<CheckAppResourcePermissionsBatchRequestChecks> checks;

    /**
     * <p>资源所属租户 ID；省略为调用人当前租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>目标平台用户 ID</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("targetUserId")
    public Long targetUserId;

    /**
     * <p>目标用户所属租户；跨租户目标必填</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("targetUserTenantId")
    public String targetUserTenantId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CheckAppResourcePermissionsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionsBatchRequest self = new CheckAppResourcePermissionsBatchRequest();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionsBatchRequest setChecks(java.util.List<CheckAppResourcePermissionsBatchRequestChecks> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<CheckAppResourcePermissionsBatchRequestChecks> getChecks() {
        return this.checks;
    }

    public CheckAppResourcePermissionsBatchRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public CheckAppResourcePermissionsBatchRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public CheckAppResourcePermissionsBatchRequest setTargetUserTenantId(String targetUserTenantId) {
        this.targetUserTenantId = targetUserTenantId;
        return this;
    }
    public String getTargetUserTenantId() {
        return this.targetUserTenantId;
    }

    public CheckAppResourcePermissionsBatchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class CheckAppResourcePermissionsBatchRequestChecks extends TeaModel {
        /**
         * <p>目标权限点</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        @NameInMap("permission")
        public String permission;

        /**
         * <p>首段为 APP 应用键的点分资源键</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>固定为 APP_RESOURCE</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static CheckAppResourcePermissionsBatchRequestChecks build(java.util.Map<String, ?> map) throws Exception {
            CheckAppResourcePermissionsBatchRequestChecks self = new CheckAppResourcePermissionsBatchRequestChecks();
            return TeaModel.build(map, self);
        }

        public CheckAppResourcePermissionsBatchRequestChecks setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CheckAppResourcePermissionsBatchRequestChecks setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public CheckAppResourcePermissionsBatchRequestChecks setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
