// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ImportWorkflowTemplateRequest extends TeaModel {
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
     * <p>可移植模板 JSON（stepId/sortOrder 可省略）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("template")
    public java.util.Map<String, ?> template;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ImportWorkflowTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowTemplateRequest self = new ImportWorkflowTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowTemplateRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ImportWorkflowTemplateRequest setTemplate(java.util.Map<String, ?> template) {
        this.template = template;
        return this;
    }
    public java.util.Map<String, ?> getTemplate() {
        return this.template;
    }

    public ImportWorkflowTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
