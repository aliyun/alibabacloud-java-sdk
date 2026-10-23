// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The scope of the permissions to be revoked.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public String itemsShrink;

    /**
     * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static DeleteAppResourcePermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourcePermissionsShrinkRequest self = new DeleteAppResourcePermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourcePermissionsShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public DeleteAppResourcePermissionsShrinkRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public DeleteAppResourcePermissionsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
