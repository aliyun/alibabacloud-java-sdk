// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemRunSummariesRequest extends TeaModel {
    /**
     * <p>协作空间ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>可选节点key；传入后只返回该节点当前轮次的总结</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeKey")
    public String nodeKey;

    /**
     * <p>租户ID；缺省使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>工作项ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_0123456789ab4cde</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static GetWorkItemRunSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemRunSummariesRequest self = new GetWorkItemRunSummariesRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkItemRunSummariesRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetWorkItemRunSummariesRequest setNodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
        return this;
    }
    public String getNodeKey() {
        return this.nodeKey;
    }

    public GetWorkItemRunSummariesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetWorkItemRunSummariesRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
