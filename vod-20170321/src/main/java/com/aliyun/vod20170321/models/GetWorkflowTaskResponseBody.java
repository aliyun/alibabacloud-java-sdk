// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWorkflowTaskResponseBody extends TeaModel {
    /**
     * <p>The error code returned when transcoding fails.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when transcoding fails.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorMessage</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The time when the task was completed. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-19T02:28:22Z</p>
     */
    @NameInMap("FinishTimeUtc")
    public String finishTimeUtc;

    /**
     * <p>The time when the task was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-28T02:17:26Z</p>
     */
    @NameInMap("GmtCreateUtc")
    public String gmtCreateUtc;

    /**
     * <p>The node results of the workflow task. The value is in JSON format and varies based on the workflow configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("NodeResults")
    public String nodeResults;

    /**
     * <p>The output information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>63E8B7C7-4812-46*****AD-0FA56029AC86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of this review. This indicates the current manual review result. Valid values:</p>
     * <ul>
     * <li><strong>running</strong>: Running.</li>
     * <li><strong>stopped</strong>: Stopped.</li>
     * <li><strong>failed</strong>: Failed.</li>
     * <li><strong>partial-succeeded</strong>: Partially succeeded.</li>
     * <li><strong>succeeded</strong>: Succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID used to query the refresh status.</p>
     * 
     * <strong>example:</strong>
     * <p>70422****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The custom information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow ID. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflow Management</strong> to view the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>613efff3887ec34af685714cc461****</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static GetWorkflowTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTaskResponseBody self = new GetWorkflowTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkflowTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetWorkflowTaskResponseBody setFinishTimeUtc(String finishTimeUtc) {
        this.finishTimeUtc = finishTimeUtc;
        return this;
    }
    public String getFinishTimeUtc() {
        return this.finishTimeUtc;
    }

    public GetWorkflowTaskResponseBody setGmtCreateUtc(String gmtCreateUtc) {
        this.gmtCreateUtc = gmtCreateUtc;
        return this;
    }
    public String getGmtCreateUtc() {
        return this.gmtCreateUtc;
    }

    public GetWorkflowTaskResponseBody setNodeResults(String nodeResults) {
        this.nodeResults = nodeResults;
        return this;
    }
    public String getNodeResults() {
        return this.nodeResults;
    }

    public GetWorkflowTaskResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public GetWorkflowTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkflowTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetWorkflowTaskResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWorkflowTaskResponseBody setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
