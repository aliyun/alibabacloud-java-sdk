// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourcePermissionRecordsShrinkRequest extends TeaModel {
    /**
     * <p>The tenant filter for cross-tenant users.</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("granteeId")
    public String granteeId;

    /**
     * <p>The permission filter.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("granteeTenantId")
    public String granteeTenantId;

    /**
     * <p>The principal ID filter.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("granteeType")
    public String granteeType;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The principal type filter.</p>
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
    public String permissionsShrink;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app.demo</p>
     */
    @NameInMap("resourceKeyPrefix")
    public String resourceKeyPrefix;

    /**
     * <p>The resource tenant ID. This parameter is fixed to APP_RESOURCE.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The application key or its subpath.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_RESOURCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The ID of the tenant to which the resource belongs. If omitted, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAppResourcePermissionRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourcePermissionRecordsShrinkRequest self = new ListAppResourcePermissionRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppResourcePermissionRecordsShrinkRequest setGranteeId(String granteeId) {
        this.granteeId = granteeId;
        return this;
    }
    public String getGranteeId() {
        return this.granteeId;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setGranteeTenantId(String granteeTenantId) {
        this.granteeTenantId = granteeTenantId;
        return this;
    }
    public String getGranteeTenantId() {
        return this.granteeTenantId;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }
    public String getGranteeType() {
        return this.granteeType;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setResourceKeyPrefix(String resourceKeyPrefix) {
        this.resourceKeyPrefix = resourceKeyPrefix;
        return this;
    }
    public String getResourceKeyPrefix() {
        return this.resourceKeyPrefix;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAppResourcePermissionRecordsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
