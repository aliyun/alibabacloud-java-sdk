// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionsBatchShrinkRequest extends TeaModel {
    /**
     * <p>检查项</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("checks")
    public String checksShrink;

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
