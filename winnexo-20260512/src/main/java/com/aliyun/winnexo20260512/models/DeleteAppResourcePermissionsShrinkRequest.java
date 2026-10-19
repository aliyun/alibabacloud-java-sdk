// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsShrinkRequest extends TeaModel {
    /**
     * <p>撤权范围</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public String itemsShrink;

    /**
     * <p>资源所属租户 ID；省略为调用人当前租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
