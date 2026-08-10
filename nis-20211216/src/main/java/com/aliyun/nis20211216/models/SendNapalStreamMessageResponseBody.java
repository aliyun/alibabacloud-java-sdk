// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class SendNapalStreamMessageResponseBody extends TeaModel {
    /**
     * <p>This field is mutually exclusive with Task, TaskStatusUpdate, and TaskArtifactUpdate. When this field is returned, no task is created, and the stream closes after sending one Message. This API does not currently return this type. This field is reserved for protocol compatibility only.</p>
     */
    @NameInMap("Message")
    public SendNapalStreamMessageResponseBodyMessage message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("Task")
    public SendNapalStreamMessageResponseBodyTask task;

    /**
     * <p>The task artifact update object.</p>
     */
    @NameInMap("TaskArtifactUpdate")
    public SendNapalStreamMessageResponseBodyTaskArtifactUpdate taskArtifactUpdate;

    /**
     * <p>The task status update object.</p>
     */
    @NameInMap("TaskStatusUpdate")
    public SendNapalStreamMessageResponseBodyTaskStatusUpdate taskStatusUpdate;

    public static SendNapalStreamMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendNapalStreamMessageResponseBody self = new SendNapalStreamMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendNapalStreamMessageResponseBody setMessage(SendNapalStreamMessageResponseBodyMessage message) {
        this.message = message;
        return this;
    }
    public SendNapalStreamMessageResponseBodyMessage getMessage() {
        return this.message;
    }

    public SendNapalStreamMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendNapalStreamMessageResponseBody setTask(SendNapalStreamMessageResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public SendNapalStreamMessageResponseBodyTask getTask() {
        return this.task;
    }

    public SendNapalStreamMessageResponseBody setTaskArtifactUpdate(SendNapalStreamMessageResponseBodyTaskArtifactUpdate taskArtifactUpdate) {
        this.taskArtifactUpdate = taskArtifactUpdate;
        return this;
    }
    public SendNapalStreamMessageResponseBodyTaskArtifactUpdate getTaskArtifactUpdate() {
        return this.taskArtifactUpdate;
    }

    public SendNapalStreamMessageResponseBody setTaskStatusUpdate(SendNapalStreamMessageResponseBodyTaskStatusUpdate taskStatusUpdate) {
        this.taskStatusUpdate = taskStatusUpdate;
        return this;
    }
    public SendNapalStreamMessageResponseBodyTaskStatusUpdate getTaskStatusUpdate() {
        return this.taskStatusUpdate;
    }

    public static class SendNapalStreamMessageResponseBodyMessageParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>The current instance is running normally</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyMessageParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyMessageParts self = new SendNapalStreamMessageResponseBodyMessageParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyMessageParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyMessageParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyMessageParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyMessageParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyMessageParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyMessageParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyMessage extends TeaModel {
        /**
         * <p>The session context ID.</p>
         * 
         * <strong>example:</strong>
         * <p>context-07b0**bcc2</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("Extensions")
        public java.util.List<String> extensions;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>message-fd6e**9949</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The list of message content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyMessageParts> parts;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("ReferenceTaskIds")
        public java.util.List<String> referenceTaskIds;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Reserved field. A directly returned Message does not create a task, so this field is empty. This API does not currently return a top-level Message.</p>
         * 
         * <strong>example:</strong>
         * <p>task-reserved</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SendNapalStreamMessageResponseBodyMessage build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyMessage self = new SendNapalStreamMessageResponseBodyMessage();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyMessage setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageResponseBodyMessage setExtensions(java.util.List<String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        public SendNapalStreamMessageResponseBodyMessage setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendNapalStreamMessageResponseBodyMessage setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyMessage setParts(java.util.List<SendNapalStreamMessageResponseBodyMessageParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyMessageParts> getParts() {
            return this.parts;
        }

        public SendNapalStreamMessageResponseBodyMessage setReferenceTaskIds(java.util.List<String> referenceTaskIds) {
            this.referenceTaskIds = referenceTaskIds;
            return this;
        }
        public java.util.List<String> getReferenceTaskIds() {
            return this.referenceTaskIds;
        }

        public SendNapalStreamMessageResponseBodyMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SendNapalStreamMessageResponseBodyMessage setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskArtifactsParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The report text fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnostic results</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyTaskArtifactsParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskArtifactsParts self = new SendNapalStreamMessageResponseBodyTaskArtifactsParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactsParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskArtifacts extends TeaModel {
        /**
         * <p>The unique identifier of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <p>The description of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance health inspection results</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("Extensions")
        public java.util.List<String> extensions;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The name of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Inspection report</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactsParts> parts;

        public static SendNapalStreamMessageResponseBodyTaskArtifacts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskArtifacts self = new SendNapalStreamMessageResponseBodyTaskArtifacts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setExtensions(java.util.List<String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifacts setParts(java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactsParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactsParts> getParts() {
            return this.parts;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskHistoryParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnose this instance ngw-xxx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyTaskHistoryParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskHistoryParts self = new SendNapalStreamMessageResponseBodyTaskHistoryParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyTaskHistoryParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskHistory extends TeaModel {
        /**
         * <p>The session context ID.</p>
         * 
         * <strong>example:</strong>
         * <p>context-07b0**bcc2</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("Extensions")
        public java.util.List<String> extensions;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>message-fd6e**9949</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The list of message content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskHistoryParts> parts;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("ReferenceTaskIds")
        public java.util.List<String> referenceTaskIds;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38cZ**MAVKu</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SendNapalStreamMessageResponseBodyTaskHistory build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskHistory self = new SendNapalStreamMessageResponseBodyTaskHistory();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setExtensions(java.util.List<String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setParts(java.util.List<SendNapalStreamMessageResponseBodyTaskHistoryParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskHistoryParts> getParts() {
            return this.parts;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setReferenceTaskIds(java.util.List<String> referenceTaskIds) {
            this.referenceTaskIds = referenceTaskIds;
            return this;
        }
        public java.util.List<String> getReferenceTaskIds() {
            return this.referenceTaskIds;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SendNapalStreamMessageResponseBodyTaskHistory setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusMessageParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The text content. The natural language instruction entered by the user, such as a diagnostic request or question consultation.</p>
         * 
         * <strong>example:</strong>
         * <p>The current instance is running normally</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyTaskStatusMessageParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusMessageParts self = new SendNapalStreamMessageResponseBodyTaskStatusMessageParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessageParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusMessage extends TeaModel {
        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>message-fd6e**9949</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The list of message content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskStatusMessageParts> parts;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("Role")
        public String role;

        public static SendNapalStreamMessageResponseBodyTaskStatusMessage build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusMessage self = new SendNapalStreamMessageResponseBodyTaskStatusMessage();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessage setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessage setParts(java.util.List<SendNapalStreamMessageResponseBodyTaskStatusMessageParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskStatusMessageParts> getParts() {
            return this.parts;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatus extends TeaModel {
        /**
         * <p>The message object defined by the A2A protocol. It contains the sender role, one or more content parts, and optional session and task context. When returned as a top-level field, it indicates a direct reply from the agent and is mutually exclusive with Task, TaskStatusUpdate, and TaskArtifactUpdate. The stream closes immediately after this message is returned. When returned as Status.Message, it represents a descriptive message associated with the task status. This API does not currently return a top-level Message. This field is reserved for protocol compatibility only.</p>
         */
        @NameInMap("Message")
        public SendNapalStreamMessageResponseBodyTaskStatusMessage message;

        /**
         * <p>The task state. Valid values:</p>
         * <ul>
         * <li>TASK_STATE_SUBMITTED: The task has been submitted.</li>
         * <li>TASK_STATE_WORKING: The task is being executed.</li>
         * <li>TASK_STATE_COMPLETED: The task has been completed.</li>
         * <li>TASK_STATE_FAILED: The task has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TASK_STATE_SUBMITTED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status timestamp in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T06:08:10Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static SendNapalStreamMessageResponseBodyTaskStatus build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatus self = new SendNapalStreamMessageResponseBodyTaskStatus();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatus setMessage(SendNapalStreamMessageResponseBodyTaskStatusMessage message) {
            this.message = message;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatusMessage getMessage() {
            return this.message;
        }

        public SendNapalStreamMessageResponseBodyTaskStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SendNapalStreamMessageResponseBodyTaskStatus setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTask extends TeaModel {
        /**
         * <p>The list of task artifacts.</p>
         */
        @NameInMap("Artifacts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifacts> artifacts;

        /**
         * <p>The session context ID. Used to maintain context continuity in multi-turn conversations.</p>
         * 
         * <strong>example:</strong>
         * <p>context-07b0**bcc2</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>The list of historical messages.</p>
         */
        @NameInMap("History")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskHistory> history;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38cZ**MAVKu</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The extended metadata, used to pass additional context information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;usage&quot;:&quot;{totalTokens=327672}&quot;}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The task status object.</p>
         */
        @NameInMap("Status")
        public SendNapalStreamMessageResponseBodyTaskStatus status;

        public static SendNapalStreamMessageResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTask self = new SendNapalStreamMessageResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTask setArtifacts(java.util.List<SendNapalStreamMessageResponseBodyTaskArtifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifacts> getArtifacts() {
            return this.artifacts;
        }

        public SendNapalStreamMessageResponseBodyTask setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageResponseBodyTask setHistory(java.util.List<SendNapalStreamMessageResponseBodyTaskHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskHistory> getHistory() {
            return this.history;
        }

        public SendNapalStreamMessageResponseBodyTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendNapalStreamMessageResponseBodyTask setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyTask setStatus(SendNapalStreamMessageResponseBodyTaskStatus status) {
            this.status = status;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatus getStatus() {
            return this.status;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The report text fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance status is normal</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts self = new SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact extends TeaModel {
        /**
         * <p>The unique identifier of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <p>The description of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Detailed inspection report</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         */
        @NameInMap("Extensions")
        public java.util.List<String> extensions;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The name of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>Inspection report</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts> parts;

        public static SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact self = new SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setExtensions(java.util.List<String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.List<String> getExtensions() {
            return this.extensions;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact setParts(java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifactParts> getParts() {
            return this.parts;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskArtifactUpdate extends TeaModel {
        /**
         * <p>Indicates whether the content is appended. A value of <code>true</code> indicates that the current Text is appended to the end of the existing report content. A value of <code>false</code> indicates that the existing content is overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Append")
        public Boolean append;

        /**
         * <p>The artifact object.</p>
         */
        @NameInMap("Artifact")
        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact artifact;

        /**
         * <p>The session context ID.</p>
         * 
         * <strong>example:</strong>
         * <p>context-07b0**bcc2</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>Indicates whether this is the last chunk. A value of <code>true</code> indicates that the report content has been fully pushed and no more events will follow.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LastChunk")
        public Boolean lastChunk;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38cZ**MAVKu</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SendNapalStreamMessageResponseBodyTaskArtifactUpdate build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskArtifactUpdate self = new SendNapalStreamMessageResponseBodyTaskArtifactUpdate();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdate setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdate setArtifact(SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskArtifactUpdateArtifact getArtifact() {
            return this.artifact;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdate setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdate setLastChunk(Boolean lastChunk) {
            this.lastChunk = lastChunk;
            return this;
        }
        public Boolean getLastChunk() {
            return this.lastChunk;
        }

        public SendNapalStreamMessageResponseBodyTaskArtifactUpdate setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep extends TeaModel {
        /**
         * <p>The execution duration of the step. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>203</p>
         */
        @NameInMap("CostTime")
        public Long costTime;

        /**
         * <p>The unique identifier of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>30688</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the step encountered an error during execution.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsError")
        public Boolean isError;

        /**
         * <p>The step name.</p>
         * 
         * <strong>example:</strong>
         * <p>load_skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The input parameters of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;skill_id&quot;:&quot;239&quot;}</p>
         */
        @NameInMap("Params")
        public Object params;

        /**
         * <p>The execution result of the step.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public Object result;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The content displayed on the frontend.</p>
         * 
         * <strong>example:</strong>
         * <p>load_skill</p>
         */
        @NameInMap("UiContent")
        public String uiContent;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep self = new SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setIsError(Boolean isError) {
            this.isError = isError;
            return this;
        }
        public Boolean getIsError() {
            return this.isError;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep setUiContent(String uiContent) {
            this.uiContent = uiContent;
            return this;
        }
        public String getUiContent() {
            return this.uiContent;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata extends TeaModel {
        /**
         * <p>The step execution information.</p>
         */
        @NameInMap("Step")
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep step;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata self = new SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata setStep(SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep step) {
            this.step = step;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadataStep getStep() {
            return this.step;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts extends TeaModel {
        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>reserved.bin</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cmVzZXJ2ZWQ=</p>
         */
        @NameInMap("Raw")
        public String raw;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>Query traffic</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Reserved field. This parameter is not returned by the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reserved.bin">https://example.com/reserved.bin</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts self = new SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage extends TeaModel {
        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>message-fd6e**9949</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The list of message content parts.</p>
         */
        @NameInMap("Parts")
        public java.util.List<SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts> parts;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage self = new SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage setParts(java.util.List<SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessageParts> getParts() {
            return this.parts;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus extends TeaModel {
        /**
         * <p>The message body object.</p>
         */
        @NameInMap("Message")
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage message;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>TASK_STATE_WORKING: The task is running.</li>
         * <li>TASK_STATE_COMPLETED: The task is completed.</li>
         * <li>TASK_STATE_FAILED: The task has failed.</li>
         * <li>TASK_STATE_CANCELED: The task is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TASK_STATE_WORKING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status timestamp in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T06:08:30Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus self = new SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus setMessage(SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage message) {
            this.message = message;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatusMessage getMessage() {
            return this.message;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class SendNapalStreamMessageResponseBodyTaskStatusUpdate extends TeaModel {
        /**
         * <p>The session context ID.</p>
         * 
         * <strong>example:</strong>
         * <p>context-07b0**bcc2</p>
         */
        @NameInMap("ContextId")
        public String contextId;

        /**
         * <p>Indicates whether this is a final event. A value of true indicates that the task has ended (completed or failed) and no more events will be pushed after this.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Final")
        public Boolean _final;

        /**
         * <p>The metadata object that contains step execution information.</p>
         */
        @NameInMap("Metadata")
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata metadata;

        /**
         * <p>The task status object.</p>
         */
        @NameInMap("Status")
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38cZ**MAVKu</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SendNapalStreamMessageResponseBodyTaskStatusUpdate build(java.util.Map<String, ?> map) throws Exception {
            SendNapalStreamMessageResponseBodyTaskStatusUpdate self = new SendNapalStreamMessageResponseBodyTaskStatusUpdate();
            return TeaModel.build(map, self);
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdate setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdate set_final(Boolean _final) {
            this._final = _final;
            return this;
        }
        public Boolean get_final() {
            return this._final;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdate setMetadata(SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateMetadata getMetadata() {
            return this.metadata;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdate setStatus(SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus status) {
            this.status = status;
            return this;
        }
        public SendNapalStreamMessageResponseBodyTaskStatusUpdateStatus getStatus() {
            return this.status;
        }

        public SendNapalStreamMessageResponseBodyTaskStatusUpdate setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
