// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMmAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多模态xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BindingConfig")
    public CreateMmAppRequestBindingConfig bindingConfig;

    @NameInMap("ConversationConfig")
    public CreateMmAppRequestConversationConfig conversationConfig;

    @NameInMap("ModelConfig")
    public CreateMmAppRequestModelConfig modelConfig;

    /**
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMmAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmAppRequest self = new CreateMmAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMmAppRequest setBindingConfig(CreateMmAppRequestBindingConfig bindingConfig) {
        this.bindingConfig = bindingConfig;
        return this;
    }
    public CreateMmAppRequestBindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    public CreateMmAppRequest setConversationConfig(CreateMmAppRequestConversationConfig conversationConfig) {
        this.conversationConfig = conversationConfig;
        return this;
    }
    public CreateMmAppRequestConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    public CreateMmAppRequest setModelConfig(CreateMmAppRequestModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public CreateMmAppRequestModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public CreateMmAppRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateMmAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateMmAppRequestBindingConfigCommandsTools extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54645646</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        public static CreateMmAppRequestBindingConfigCommandsTools build(java.util.Map<String, ?> map) throws Exception {
            CreateMmAppRequestBindingConfigCommandsTools self = new CreateMmAppRequestBindingConfigCommandsTools();
            return TeaModel.build(map, self);
        }

        public CreateMmAppRequestBindingConfigCommandsTools setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

    }

    public static class CreateMmAppRequestBindingConfigCommands extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3686786786</p>
         */
        @NameInMap("DomainCode")
        public String domainCode;

        @NameInMap("Tools")
        public java.util.List<CreateMmAppRequestBindingConfigCommandsTools> tools;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateMmAppRequestBindingConfigCommands build(java.util.Map<String, ?> map) throws Exception {
            CreateMmAppRequestBindingConfigCommands self = new CreateMmAppRequestBindingConfigCommands();
            return TeaModel.build(map, self);
        }

        public CreateMmAppRequestBindingConfigCommands setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public CreateMmAppRequestBindingConfigCommands setTools(java.util.List<CreateMmAppRequestBindingConfigCommandsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateMmAppRequestBindingConfigCommandsTools> getTools() {
            return this.tools;
        }

        public CreateMmAppRequestBindingConfigCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMmAppRequestBindingConfig extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<CreateMmAppRequestBindingConfigCommands> commands;

        public static CreateMmAppRequestBindingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMmAppRequestBindingConfig self = new CreateMmAppRequestBindingConfig();
            return TeaModel.build(map, self);
        }

        public CreateMmAppRequestBindingConfig setCommands(java.util.List<CreateMmAppRequestBindingConfigCommands> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<CreateMmAppRequestBindingConfigCommands> getCommands() {
            return this.commands;
        }

    }

    public static class CreateMmAppRequestConversationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AsrModel")
        public String asrModel;

        @NameInMap("OpenAsr")
        public Boolean openAsr;

        @NameInMap("OpenTts")
        public Boolean openTts;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TtsModel")
        public String ttsModel;

        public static CreateMmAppRequestConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMmAppRequestConversationConfig self = new CreateMmAppRequestConversationConfig();
            return TeaModel.build(map, self);
        }

        public CreateMmAppRequestConversationConfig setAsrModel(String asrModel) {
            this.asrModel = asrModel;
            return this;
        }
        public String getAsrModel() {
            return this.asrModel;
        }

        public CreateMmAppRequestConversationConfig setOpenAsr(Boolean openAsr) {
            this.openAsr = openAsr;
            return this;
        }
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        public CreateMmAppRequestConversationConfig setOpenTts(Boolean openTts) {
            this.openTts = openTts;
            return this;
        }
        public Boolean getOpenTts() {
            return this.openTts;
        }

        public CreateMmAppRequestConversationConfig setTtsModel(String ttsModel) {
            this.ttsModel = ttsModel;
            return this;
        }
        public String getTtsModel() {
            return this.ttsModel;
        }

    }

    public static class CreateMmAppRequestModelConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HistoryLimit")
        public Integer historyLimit;

        /**
         * <strong>example:</strong>
         * <p>MMH</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("OpenWebSearch")
        public Boolean openWebSearch;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TextModal")
        public String textModal;

        public static CreateMmAppRequestModelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMmAppRequestModelConfig self = new CreateMmAppRequestModelConfig();
            return TeaModel.build(map, self);
        }

        public CreateMmAppRequestModelConfig setHistoryLimit(Integer historyLimit) {
            this.historyLimit = historyLimit;
            return this;
        }
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        public CreateMmAppRequestModelConfig setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public CreateMmAppRequestModelConfig setOpenWebSearch(Boolean openWebSearch) {
            this.openWebSearch = openWebSearch;
            return this;
        }
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        public CreateMmAppRequestModelConfig setTextModal(String textModal) {
            this.textModal = textModal;
            return this;
        }
        public String getTextModal() {
            return this.textModal;
        }

    }

}
