// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRunResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>任务创建时间，ISO8601</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>错误码，仅 Failed 时返回</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>错误描述，仅 Failed 时返回</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>任务结束时间，ISO8601；仅终态（Succeeded/Failed/Cancelled）有值</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    @NameInMap("logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>进度百分比（仅 Running 时有意义）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("progress")
    public Long progress;

    /**
     * <p>进度描述</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("progressMessage")
    public String progressMessage;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    /**
     * <p>异步任务 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRunId</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>技能编码</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>技能名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>任务开始执行时间，ISO8601</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>执行状态：Running / Succeeded / Failed / Cancelled</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

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
