// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsShrinkRequest extends TeaModel {
    /**
     * <p>批量授权项</p>
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

    public static RegisterAppResourcePermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAppResourcePermissionsShrinkRequest self = new RegisterAppResourcePermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAppResourcePermissionsShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public RegisterAppResourcePermissionsShrinkRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public RegisterAppResourcePermissionsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
