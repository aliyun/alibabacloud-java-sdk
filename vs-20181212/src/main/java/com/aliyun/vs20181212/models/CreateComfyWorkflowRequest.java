// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyWorkflowRequest extends TeaModel {
    /**
     * <p>The workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个图生视频的工作流</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The workflow name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>图生视频的工作流示例</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The JSON definition of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Workflow")
    public String workflow;

    public static CreateComfyWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyWorkflowRequest self = new CreateComfyWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateComfyWorkflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateComfyWorkflowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComfyWorkflowRequest setWorkflow(String workflow) {
        this.workflow = workflow;
        return this;
    }
    public String getWorkflow() {
        return this.workflow;
    }

}
