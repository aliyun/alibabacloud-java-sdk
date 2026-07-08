// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyComfyWorkflowRequest extends TeaModel {
    /**
     * <p>The new workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个图生视频的工作流</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the workflow to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_3de1eb6e-1dfe-45aa-8f88-2269d0a30f53</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    /**
     * <p>The new workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>图生视频工作流示例</p>
     */
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
