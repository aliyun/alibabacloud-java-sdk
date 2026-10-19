// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GenerateWorkflowTemplateDraftRequest extends TeaModel {
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
     * <p>上一轮草稿；提供时基于它迭代修改</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("previousDraft")
    public java.util.Map<String, ?> previousDraft;

    /**
     * <p>模板需求描述</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("requirement")
    public String requirement;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GenerateWorkflowTemplateDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWorkflowTemplateDraftRequest self = new GenerateWorkflowTemplateDraftRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWorkflowTemplateDraftRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GenerateWorkflowTemplateDraftRequest setPreviousDraft(java.util.Map<String, ?> previousDraft) {
        this.previousDraft = previousDraft;
        return this;
    }
    public java.util.Map<String, ?> getPreviousDraft() {
        return this.previousDraft;
    }

    public GenerateWorkflowTemplateDraftRequest setRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }
    public String getRequirement() {
        return this.requirement;
    }

    public GenerateWorkflowTemplateDraftRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
