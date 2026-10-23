// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourcePermissionRecordsRequest extends TeaModel {
    /**
     * <p>The grantee ID filter.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("granteeId")
    public String granteeId;

    /**
     * <p>The tenant ID filter for cross-tenant users.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("granteeTenantId")
    public String granteeTenantId;

    /**
     * <p>The grantee type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("granteeType")
    public String granteeType;

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
     * <p>The permission filter.</p>
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
     * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The resource type. Set this parameter to APP_RESOURCE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_RESOURCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAppResourcePermissionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourcePermissionRecordsRequest self = new ListAppResourcePermissionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppResourcePermissionRecordsRequest setGranteeId(String granteeId) {
        this.granteeId = granteeId;
        return this;
    }
    public String getGranteeId() {
        return this.granteeId;
    }

    public ListAppResourcePermissionRecordsRequest setGranteeTenantId(String granteeTenantId) {
        this.granteeTenantId = granteeTenantId;
        return this;
    }
    public String getGranteeTenantId() {
        return this.granteeTenantId;
    }

    public ListAppResourcePermissionRecordsRequest setGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }
    public String getGranteeType() {
        return this.granteeType;
    }

    public ListAppResourcePermissionRecordsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAppResourcePermissionRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppResourcePermissionRecordsRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public ListAppResourcePermissionRecordsRequest setResourceKeyPrefix(String resourceKeyPrefix) {
        this.resourceKeyPrefix = resourceKeyPrefix;
        return this;
    }
    public String getResourceKeyPrefix() {
        return this.resourceKeyPrefix;
    }

    public ListAppResourcePermissionRecordsRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public ListAppResourcePermissionRecordsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAppResourcePermissionRecordsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
