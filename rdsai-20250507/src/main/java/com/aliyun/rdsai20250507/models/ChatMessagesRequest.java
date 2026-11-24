// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesRequest extends TeaModel {
    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The event output mode. Valid values: inline and separate. Default value: inline. When set to inline, tool invoke events, child node events, and document events are unified into the answer field of the event where event = message. When set to separate, tool invoke events, child node events, and document events have their own respective events.</p>
     * 
     * <strong>example:</strong>
     * <p>inline</p>
     */
    @NameInMap("EventMode")
    public String eventMode;

    /**
     * <p>The list of attachments included in the current conversation round. References uploaded files by using UploadFileId.</p>
     */
    @NameInMap("Files")
    public java.util.List<ChatMessagesRequestFiles> files;

    /**
     * <p>The task input.</p>
     */
    @NameInMap("Inputs")
    public ChatMessagesRequestInputs inputs;

    /**
     * <p>The parent message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The query content.</p>
     * 
     * <strong>example:</strong>
     * <p>Disk usage of instance rm-bp14as9914vd3****, and whether it needs to be scaled up</p>
     */
    @NameInMap("Query")
    public String query;

    public static ChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesRequest self = new ChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ChatMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatMessagesRequest setEventMode(String eventMode) {
        this.eventMode = eventMode;
        return this;
    }
    public String getEventMode() {
        return this.eventMode;
    }

    public ChatMessagesRequest setFiles(java.util.List<ChatMessagesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ChatMessagesRequestFiles> getFiles() {
        return this.files;
    }

    public ChatMessagesRequest setInputs(ChatMessagesRequestInputs inputs) {
        this.inputs = inputs;
        return this;
    }
    public ChatMessagesRequestInputs getInputs() {
        return this.inputs;
    }

    public ChatMessagesRequest setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
        return this;
    }
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    public ChatMessagesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public static class ChatMessagesRequestFiles extends TeaModel {
        /**
         * <p>The file transfer method. Set this parameter to local_file and provide the UploadFileId when referencing an uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>local_file</p>
         */
        @NameInMap("TransferMethod")
        public String transferMethod;

        /**
         * <p>The attachment type. A value of image indicates an image. The actual supported types are determined by the file upload configuration of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The identifier of the uploaded file. The ContextDB management agent can use the UploadFileId returned by the knowledge base of the current workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        @NameInMap("UploadFileId")
        public String uploadFileId;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/BirthCertification_0.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/BirthCertification_0.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ChatMessagesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            ChatMessagesRequestFiles self = new ChatMessagesRequestFiles();
            return TeaModel.build(map, self);
        }

        public ChatMessagesRequestFiles setTransferMethod(String transferMethod) {
            this.transferMethod = transferMethod;
            return this;
        }
        public String getTransferMethod() {
            return this.transferMethod;
        }

        public ChatMessagesRequestFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatMessagesRequestFiles setUploadFileId(String uploadFileId) {
            this.uploadFileId = uploadFileId;
            return this;
        }
        public String getUploadFileId() {
            return this.uploadFileId;
        }

        public ChatMessagesRequestFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChatMessagesRequestInputs extends TeaModel {
        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>Specifies whether to enable the deep thinking mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableThinking")
        public String enableThinking;

        /**
         * <p>The IM flow ID. Used to bind messages to a registered IM channel when a conversation is initiated through an IM channel.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-xxxxxxxxxx</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The conversation language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-max</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tool approval call ID for resuming execution. Pass this parameter after the console completes all decisions for the current approval round to continue the interrupted ChatMessage loop. Do not pass this parameter for normal conversations.</p>
         * 
         * <strong>example:</strong>
         * <p>call-example</p>
         */
        @NameInMap("ResumeCallId")
        public String resumeCallId;

        /**
         * <p>The thinking depth.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ThinkEffort")
        public String thinkEffort;

        /**
         * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>Specifies the tool approval mode for the current conversation. Valid values: read_only (read-only, rejects write tools), manual (write tools require manual approval), and auto (automatically determined by the approval sub-agent; escalated to manual approval when needs_human is returned). If specified, updates the approval mode of the current conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("ToolApprovalMode")
        public String toolApprovalMode;

        /**
         * <p>The ContextDB workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ChatMessagesRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            ChatMessagesRequestInputs self = new ChatMessagesRequestInputs();
            return TeaModel.build(map, self);
        }

        public ChatMessagesRequestInputs setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ChatMessagesRequestInputs setEnableThinking(String enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public String getEnableThinking() {
            return this.enableThinking;
        }

        public ChatMessagesRequestInputs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ChatMessagesRequestInputs setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ChatMessagesRequestInputs setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ChatMessagesRequestInputs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ChatMessagesRequestInputs setResumeCallId(String resumeCallId) {
            this.resumeCallId = resumeCallId;
            return this;
        }
        public String getResumeCallId() {
            return this.resumeCallId;
        }

        public ChatMessagesRequestInputs setThinkEffort(String thinkEffort) {
            this.thinkEffort = thinkEffort;
            return this;
        }
        public String getThinkEffort() {
            return this.thinkEffort;
        }

        public ChatMessagesRequestInputs setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ChatMessagesRequestInputs setToolApprovalMode(String toolApprovalMode) {
            this.toolApprovalMode = toolApprovalMode;
            return this;
        }
        public String getToolApprovalMode() {
            return this.toolApprovalMode;
        }

        public ChatMessagesRequestInputs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
