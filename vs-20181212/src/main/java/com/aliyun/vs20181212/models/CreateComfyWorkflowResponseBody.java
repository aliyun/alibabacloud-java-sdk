// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyWorkflowResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned message. If <code>Status</code> is <code>Failed</code>, this parameter provides the reason for the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>conn failed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A list of missing nodes.</p>
     */
    @NameInMap("MissingNodes")
    public java.util.List<String> missingNodes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workflow status.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5c</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static CreateComfyWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyWorkflowResponseBody self = new CreateComfyWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComfyWorkflowResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateComfyWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComfyWorkflowResponseBody setMissingNodes(java.util.List<String> missingNodes) {
        this.missingNodes = missingNodes;
        return this;
    }
    public java.util.List<String> getMissingNodes() {
        return this.missingNodes;
    }

    public CreateComfyWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComfyWorkflowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateComfyWorkflowResponseBody setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
