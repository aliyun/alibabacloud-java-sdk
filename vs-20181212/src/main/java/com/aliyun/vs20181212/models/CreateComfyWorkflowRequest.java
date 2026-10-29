// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyWorkflowRequest extends TeaModel {
    /**
     * <p>The description of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a workflow for image-to-video</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample workflow for image-to-video</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workflow JSON.</p>
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
