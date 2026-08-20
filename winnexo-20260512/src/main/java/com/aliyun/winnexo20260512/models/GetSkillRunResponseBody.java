// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRunResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The task creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The error code. This parameter is returned only when the status is Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error description. This parameter is returned only when the status is Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The task end time in ISO 8601 format. This parameter has a value only in desired states (Succeeded, Failed, or Cancelled).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <p>The execution log list. This parameter is returned only when IncludeLogs is set to true.</p>
     */
    @NameInMap("logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The progress percentage. This parameter is meaningful only when the status is Running.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progress")
    public Long progress;

    /**
     * <p>The progress description.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("progressMessage")
    public String progressMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The execution result. This parameter is returned only when the status is Succeeded. It contains a content list.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRunId</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The skill code.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>The task execution start time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The execution status. Valid values: Running, Succeeded, Failed, and Cancelled.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The LLM token usage statistics. This parameter is returned only when the status is Succeeded.</p>
     */
    @NameInMap("usage")
    public java.util.Map<String, ?> usage;

    public static GetSkillRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRunResponseBody self = new GetSkillRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillRunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillRunResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetSkillRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSkillRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSkillRunResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetSkillRunResponseBody setLogs(java.util.List<java.util.Map<String, ?>> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLogs() {
        return this.logs;
    }

    public GetSkillRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillRunResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetSkillRunResponseBody setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
        return this;
    }
    public String getProgressMessage() {
        return this.progressMessage;
    }

    public GetSkillRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillRunResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public GetSkillRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetSkillRunResponseBody setSkillCode(String skillCode) {
        this.skillCode = skillCode;
        return this;
    }
    public String getSkillCode() {
        return this.skillCode;
    }

    public GetSkillRunResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public GetSkillRunResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetSkillRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSkillRunResponseBody setUsage(java.util.Map<String, ?> usage) {
        this.usage = usage;
        return this;
    }
    public java.util.Map<String, ?> getUsage() {
        return this.usage;
    }

}
