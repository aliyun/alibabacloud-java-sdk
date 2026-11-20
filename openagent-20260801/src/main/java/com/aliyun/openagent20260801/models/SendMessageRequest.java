// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <p>The list of attachments.</p>
     */
    @NameInMap("attachments")
    public java.util.List<SendMessageRequestAttachments> attachments;

    /**
     * <p>The MESSAGE commands. A skill command must include <code>payload.skillId</code>. A compact command must be sent separately without a body or attachments.</p>
     */
    @NameInMap("commands")
    public java.util.List<SendMessageRequestCommands> commands;

    /**
     * <p>The message text in MESSAGE mode. This parameter cannot be empty. The type parameter can be omitted in this mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Query the status of the sample resource without making changes</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The list of interrupt replies. This parameter is required when <code>type</code> is set to <code>RESUME</code>. You must reply to all pending interrupts at once. Each <code>interruptId</code> can appear only once.</p>
     */
    @NameInMap("resume")
    public java.util.List<SendMessageRequestResume> resume;

    /**
     * <p>The ID of the active run to resubscribe to. This parameter is required in RECONNECT mode.</p>
     * 
     * <strong>example:</strong>
     * <p>run_example_001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The request type. Valid values: <code>MESSAGE</code> (sends a message), <code>RESUME</code> (resumes a run), and <code>RECONNECT</code> (reconnects to a run). Default value: <code>MESSAGE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>MESSAGE</p>
     */
    @NameInMap("type")
    public String type;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setAttachments(java.util.List<SendMessageRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SendMessageRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public SendMessageRequest setCommands(java.util.List<SendMessageRequestCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<SendMessageRequestCommands> getCommands() {
        return this.commands;
    }

    public SendMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendMessageRequest setResume(java.util.List<SendMessageRequestResume> resume) {
        this.resume = resume;
        return this;
    }
    public java.util.List<SendMessageRequestResume> getResume() {
        return this.resume;
    }

    public SendMessageRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public SendMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class SendMessageRequestAttachments extends TeaModel {
        /**
         * <p>The file name extension.</p>
         * 
         * <strong>example:</strong>
         * <p>xlsx</p>
         */
        @NameInMap("fileExtension")
        public String fileExtension;

        /**
         * <p>The ID of the file after it is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>att_12345678</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <p>The original name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>File.xlsx</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <p>The workspace path.</p>
         * 
         * <strong>example:</strong>
         * <p>source/att_12345678.xlsx</p>
         */
        @NameInMap("workspacePath")
        public String workspacePath;

        public static SendMessageRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestAttachments self = new SendMessageRequestAttachments();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestAttachments setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }
        public String getFileExtension() {
            return this.fileExtension;
        }

        public SendMessageRequestAttachments setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public SendMessageRequestAttachments setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public SendMessageRequestAttachments setWorkspacePath(String workspacePath) {
            this.workspacePath = workspacePath;
            return this;
        }
        public String getWorkspacePath() {
            return this.workspacePath;
        }

    }

    public static class SendMessageRequestCommandsPayload extends TeaModel {
        /**
         * <p>The skill name snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>Intelligent analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore_example</p>
         */
        @NameInMap("skillId")
        public String skillId;

        public static SendMessageRequestCommandsPayload build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestCommandsPayload self = new SendMessageRequestCommandsPayload();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestCommandsPayload setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SendMessageRequestCommandsPayload setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

    }

    public static class SendMessageRequestCommands extends TeaModel {
        /**
         * <p>The parameter object corresponding to the command type. For a skill command, you must specify the skill to be executed by using <code>skillId</code>. The <code>name</code> parameter is optional and is used only to save a snapshot of the display name. It is not used for execution or authorization checks. For a compact command, omit this object.</p>
         */
        @NameInMap("payload")
        public SendMessageRequestCommandsPayload payload;

        /**
         * <p>The command type.</p>
         * 
         * <strong>example:</strong>
         * <p>skill</p>
         */
        @NameInMap("type")
        public String type;

        public static SendMessageRequestCommands build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestCommands self = new SendMessageRequestCommands();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestCommands setPayload(SendMessageRequestCommandsPayload payload) {
            this.payload = payload;
            return this;
        }
        public SendMessageRequestCommandsPayload getPayload() {
            return this.payload;
        }

        public SendMessageRequestCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SendMessageRequestResume extends TeaModel {
        /**
         * <p>The ID of the interrupt to be replied to. Obtain this value from <code>data.outcome.interrupts[].id</code> in the SSE <code>RUN_FINISHED</code> event or <code>data.outcome.interrupts[].id</code> in the <code>GetRun</code> response.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt_example_001</p>
         */
        @NameInMap("interruptId")
        public String interruptId;

        /**
         * <p>The interrupt processing result. This parameter is required when <code>status</code> is set to <code>resolved</code> and must conform to the <code>responseSchema</code> of the corresponding interrupt. Do not provide this parameter when <code>status</code> is set to <code>cancelled</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("payload")
        public Object payload;

        /**
         * <p>The reply method for the current interrupt. A value of <code>resolved</code> indicates that the answer, confirmation, or tool result required by the interrupt is submitted, and <code>payload</code> must be provided. A value of <code>cancelled</code> indicates that the interrupt is canceled, and <code>payload</code> is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("status")
        public String status;

        public static SendMessageRequestResume build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestResume self = new SendMessageRequestResume();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestResume setInterruptId(String interruptId) {
            this.interruptId = interruptId;
            return this;
        }
        public String getInterruptId() {
            return this.interruptId;
        }

        public SendMessageRequestResume setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
        public Object getPayload() {
            return this.payload;
        }

        public SendMessageRequestResume setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
