// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionsBatchShrinkRequest extends TeaModel {
    /**
     * <p>The check items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("checks")
    public String checksShrink;

    /**
     * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("resourceTenantId")
    public String resourceTenantId;

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
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CheckAppResourcePermissionsBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionsBatchShrinkRequest self = new CheckAppResourcePermissionsBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionsBatchShrinkRequest setChecksShrink(String checksShrink) {
        this.checksShrink = checksShrink;
        return this;
    }
    public String getChecksShrink() {
        return this.checksShrink;
    }

    public CheckAppResourcePermissionsBatchShrinkRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public CheckAppResourcePermissionsBatchShrinkRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public CheckAppResourcePermissionsBatchShrinkRequest setTargetUserTenantId(String targetUserTenantId) {
        this.targetUserTenantId = targetUserTenantId;
        return this;
    }
    public String getTargetUserTenantId() {
        return this.targetUserTenantId;
    }

    public CheckAppResourcePermissionsBatchShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
