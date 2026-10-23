// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourceUserPermissionsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The permission points to filter.</p>
     */
    @NameInMap("permissions")
    public java.util.List<String> permissions;

    /**
     * <p>The application key or its subpath.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app.demo</p>
     */
    @NameInMap("resourceKeyPrefix")
    public String resourceKeyPrefix;

    /**
     * <p>The ID of the tenant to which the resource belongs. If you do not specify this parameter, the current tenant of the caller is used.</p>
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
     * <p>The tenant to which the target user belongs. This parameter is required for cross-tenant targets.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("targetUserTenantId")
    public String targetUserTenantId;

    /**
     * <p>The tenant ID. This is a common parameter. If you do not specify this parameter, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAppResourceUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourceUserPermissionsRequest self = new ListAppResourceUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppResourceUserPermissionsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAppResourceUserPermissionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppResourceUserPermissionsRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public ListAppResourceUserPermissionsRequest setResourceKeyPrefix(String resourceKeyPrefix) {
        this.resourceKeyPrefix = resourceKeyPrefix;
        return this;
    }
    public String getResourceKeyPrefix() {
        return this.resourceKeyPrefix;
    }

    public ListAppResourceUserPermissionsRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public ListAppResourceUserPermissionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAppResourceUserPermissionsRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public ListAppResourceUserPermissionsRequest setTargetUserTenantId(String targetUserTenantId) {
        this.targetUserTenantId = targetUserTenantId;
        return this;
    }
    public String getTargetUserTenantId() {
        return this.targetUserTenantId;
    }

    public ListAppResourceUserPermissionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
