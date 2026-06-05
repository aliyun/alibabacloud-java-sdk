// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-26cd567b35c04a0a90f017388207b232</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;2&quot;:{&quot;text&quot;:&quot;masterpiece, best quality, beautiful cat, sunny day&quot;},&quot;3&quot;:{&quot;text&quot;:&quot;low quality, worst quality, blurry, watermark, text, signature&quot;}}</p>
     */
    @NameInMap("UserParameters")
    public String userParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static CreateComfyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyTaskRequest self = new CreateComfyTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateComfyTaskRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public CreateComfyTaskRequest setUserParameters(String userParameters) {
        this.userParameters = userParameters;
        return this;
    }
    public String getUserParameters() {
        return this.userParameters;
    }

    public CreateComfyTaskRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
