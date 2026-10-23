// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionRequest extends TeaModel {
    /**
     * <p>The permission to check.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP/VIEW</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>The dot-separated resource key. The first segment is the APP application key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app.demo.resource_1</p>
     */
    @NameInMap("resourceKey")
    public String resourceKey;

    /**
     * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The resource type. Set the value to APP_RESOURCE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_RESOURCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The ID of the target platform user.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("targetUserId")
    public Long targetUserId;

    /**
     * <p>The ID of the tenant to which the target user belongs. This parameter is required for cross-tenant targets.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("targetUserTenantId")
    public String targetUserTenantId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CheckAppResourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionRequest self = new CheckAppResourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public CheckAppResourcePermissionRequest setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }
    public String getResourceKey() {
        return this.resourceKey;
    }

    public CheckAppResourcePermissionRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public CheckAppResourcePermissionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CheckAppResourcePermissionRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public CheckAppResourcePermissionRequest setTargetUserTenantId(String targetUserTenantId) {
        this.targetUserTenantId = targetUserTenantId;
        return this;
    }
    public String getTargetUserTenantId() {
        return this.targetUserTenantId;
    }

    public CheckAppResourcePermissionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
