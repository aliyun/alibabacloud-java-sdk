// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The completion time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>The full execution content.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The list of digital employee names.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleExecutionId</p>
     */
    @NameInMap("executionId")
    public String executionId;

    /**
     * <p>The list of output files.</p>
     */
    @NameInMap("files")
    public java.util.List<GetScheduledTaskExecutionDetailResponseBodyFiles> files;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The extended metadata.</p>
     */
    @NameInMap("metadata")
    public GetScheduledTaskExecutionDetailResponseBodyMetadata metadata;

    /**
     * <p>The structured output content.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("outputContent")
    public String outputContent;

    /**
     * <p>The push status of the execution result.</p>
     * 
     * <strong>example:</strong>
     * <p>succuss</p>
     */
    @NameInMap("pushResult")
    public String pushResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of associated skill codes.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCodes")
    public java.util.List<String> skillCodes;

    /**
     * <p>The start time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The execution status.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The execution result title.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample title</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The trigger information.</p>
     */
    @NameInMap("triggerInfo")
    public GetScheduledTaskExecutionDetailResponseBodyTriggerInfo triggerInfo;

    /**
     * <p>The trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    /**
     * <p>The visibility scope of the execution record, which is always equal to the visibility scope of the associated task. Valid values: PRIVATE, COLLABORATIVE, and PUBLIC. This field is empty for personal task executions.</p>
     * 
     * <strong>example:</strong>
     * <p>COLLABORATIVE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    public static GetScheduledTaskExecutionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionDetailResponseBody self = new GetScheduledTaskExecutionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScheduledTaskExecutionDetailResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public GetScheduledTaskExecutionDetailResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetScheduledTaskExecutionDetailResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetScheduledTaskExecutionDetailResponseBody setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetScheduledTaskExecutionDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetScheduledTaskExecutionDetailResponseBody setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public GetScheduledTaskExecutionDetailResponseBody setFiles(java.util.List<GetScheduledTaskExecutionDetailResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<GetScheduledTaskExecutionDetailResponseBodyFiles> getFiles() {
        return this.files;
    }

    public GetScheduledTaskExecutionDetailResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetScheduledTaskExecutionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledTaskExecutionDetailResponseBody setMetadata(GetScheduledTaskExecutionDetailResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public GetScheduledTaskExecutionDetailResponseBodyMetadata getMetadata() {
        return this.metadata;
    }

    public GetScheduledTaskExecutionDetailResponseBody setOutputContent(String outputContent) {
        this.outputContent = outputContent;
        return this;
    }
    public String getOutputContent() {
        return this.outputContent;
    }

    public GetScheduledTaskExecutionDetailResponseBody setPushResult(String pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public String getPushResult() {
        return this.pushResult;
    }

    public GetScheduledTaskExecutionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledTaskExecutionDetailResponseBody setSkillCodes(java.util.List<String> skillCodes) {
        this.skillCodes = skillCodes;
        return this;
    }
    public java.util.List<String> getSkillCodes() {
        return this.skillCodes;
    }

    public GetScheduledTaskExecutionDetailResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetScheduledTaskExecutionDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetScheduledTaskExecutionDetailResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetScheduledTaskExecutionDetailResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetScheduledTaskExecutionDetailResponseBody setTriggerInfo(GetScheduledTaskExecutionDetailResponseBodyTriggerInfo triggerInfo) {
        this.triggerInfo = triggerInfo;
        return this;
    }
    public GetScheduledTaskExecutionDetailResponseBodyTriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    public GetScheduledTaskExecutionDetailResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public GetScheduledTaskExecutionDetailResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public static class GetScheduledTaskExecutionDetailResponseBodyFiles extends TeaModel {
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The OSS URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
         */
        @NameInMap("path")
        public String path;

        public static GetScheduledTaskExecutionDetailResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskExecutionDetailResponseBodyFiles self = new GetScheduledTaskExecutionDetailResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskExecutionDetailResponseBodyFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskExecutionDetailResponseBodyFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetScheduledTaskExecutionDetailResponseBodyMetadata extends TeaModel {
        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The token usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("usage")
        public java.util.Map<String, ?> usage;

        public static GetScheduledTaskExecutionDetailResponseBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskExecutionDetailResponseBodyMetadata self = new GetScheduledTaskExecutionDetailResponseBodyMetadata();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskExecutionDetailResponseBodyMetadata setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetScheduledTaskExecutionDetailResponseBodyMetadata setUsage(java.util.Map<String, ?> usage) {
            this.usage = usage;
            return this;
        }
        public java.util.Map<String, ?> getUsage() {
            return this.usage;
        }

    }

    public static class GetScheduledTaskExecutionDetailResponseBodyTriggerInfo extends TeaModel {
        /**
         * <p>The user identifier that triggered the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>user_10001</p>
         */
        @NameInMap("triggeredBy")
        public String triggeredBy;

        public static GetScheduledTaskExecutionDetailResponseBodyTriggerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskExecutionDetailResponseBodyTriggerInfo self = new GetScheduledTaskExecutionDetailResponseBodyTriggerInfo();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskExecutionDetailResponseBodyTriggerInfo setTriggeredBy(String triggeredBy) {
            this.triggeredBy = triggeredBy;
            return this;
        }
        public String getTriggeredBy() {
            return this.triggeredBy;
        }

    }

}
