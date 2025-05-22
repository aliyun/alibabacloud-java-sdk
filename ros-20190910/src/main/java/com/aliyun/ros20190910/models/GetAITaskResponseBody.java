// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetAITaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to complete this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the AI task.</p>
     * <ul>
     * <li>PENDING</li>
     * <li>WAITING</li>
     * <li>RUNNING</li>
     * <li>SUCCESS</li>
     * <li>FAILURE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAILURE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The reason why the AI task is in the state.</p>
     * 
     * <strong>example:</strong>
     * <p>Handler execution unexpected failure</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the AI task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-asasas*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The outputs of the AI task. The outputs include the template.</p>
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;Result&quot;: {
     *     &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     * }</p>
     */
    @NameInMap("TaskOutput")
    public java.util.Map<String, ?> taskOutput;

    /**
     * <p>The type of the AI task.</p>
     * <ul>
     * <li>GenerateTemplate: The AI task is used to generate a template.</li>
     * <li>FixTemplate: The AI task is used to fix a template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GenerateTemplate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetAITaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAITaskResponseBody self = new GetAITaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAITaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAITaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAITaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAITaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAITaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAITaskResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetAITaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetAITaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAITaskResponseBody setTaskOutput(java.util.Map<String, ?> taskOutput) {
        this.taskOutput = taskOutput;
        return this;
    }
    public java.util.Map<String, ?> getTaskOutput() {
        return this.taskOutput;
    }

    public GetAITaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
