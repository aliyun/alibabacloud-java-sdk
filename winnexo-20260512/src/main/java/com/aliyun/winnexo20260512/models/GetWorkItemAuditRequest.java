// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemAuditRequest extends TeaModel {
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

    public static GetWorkItemAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemAuditRequest self = new GetWorkItemAuditRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkItemAuditRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetWorkItemAuditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetWorkItemAuditRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
