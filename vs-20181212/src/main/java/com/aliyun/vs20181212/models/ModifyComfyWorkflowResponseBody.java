// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyComfyWorkflowResponseBody extends TeaModel {
    /**
     * <p>The error code. If the activity status is Fail, a specific error code is returned. If the activity status is Success, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-07T02:27:06Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The workflow description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an image-to-video workflow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The message. If the status is Failed, this parameter contains the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>conn failed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>Image-to-video workflow example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The update time of the task. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-07T02:27:06Z</p>
     */
    @NameInMap("UpdatedTime")
    public String updatedTime;

    /**
     * <p>The workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static ModifyComfyWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyComfyWorkflowResponseBody self = new ModifyComfyWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyComfyWorkflowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyComfyWorkflowResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public ModifyComfyWorkflowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyComfyWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyComfyWorkflowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyComfyWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyComfyWorkflowResponseBody setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public ModifyComfyWorkflowResponseBody setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
