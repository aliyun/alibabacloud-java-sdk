// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyComfyWorkflowRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_3de1eb6e-1dfe-45aa-8f88-2269d0a30f53</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("WorkflowName")
    public String workflowName;

    public static ModifyComfyWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyComfyWorkflowRequest self = new ModifyComfyWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyComfyWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyComfyWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public ModifyComfyWorkflowRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
