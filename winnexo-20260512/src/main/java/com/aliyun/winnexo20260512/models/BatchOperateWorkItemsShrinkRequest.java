// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchOperateWorkItemsShrinkRequest extends TeaModel {
    /**
     * <p>批量动作</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCHEDULE</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>幂等键</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("idempotencyKey")
    public String idempotencyKey;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>目标工作项 ID 列表（1~100 个）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("workItemIds")
    public String workItemIdsShrink;

    public static BatchOperateWorkItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateWorkItemsShrinkRequest self = new BatchOperateWorkItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchOperateWorkItemsShrinkRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public BatchOperateWorkItemsShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public BatchOperateWorkItemsShrinkRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public BatchOperateWorkItemsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchOperateWorkItemsShrinkRequest setWorkItemIdsShrink(String workItemIdsShrink) {
        this.workItemIdsShrink = workItemIdsShrink;
        return this;
    }
    public String getWorkItemIdsShrink() {
        return this.workItemIdsShrink;
    }

}
