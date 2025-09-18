// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多模态应用xxxxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BindingConfig")
    public UpdateMmAppRequestBindingConfig bindingConfig;

    @NameInMap("ConversationConfig")
    public UpdateMmAppRequestConversationConfig conversationConfig;

    @NameInMap("ModelConfig")
    public UpdateMmAppRequestModelConfig modelConfig;

    /**
     * <strong>example:</strong>
     * <p>提示词，不超过8000字符</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRequest self = new UpdateMmAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMmAppRequest setBindingConfig(UpdateMmAppRequestBindingConfig bindingConfig) {
        this.bindingConfig = bindingConfig;
        return this;
    }
    public UpdateMmAppRequestBindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    public UpdateMmAppRequest setConversationConfig(UpdateMmAppRequestConversationConfig conversationConfig) {
        this.conversationConfig = conversationConfig;
        return this;
    }
    public UpdateMmAppRequestConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    public UpdateMmAppRequest setModelConfig(UpdateMmAppRequestModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public UpdateMmAppRequestModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public UpdateMmAppRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateMmAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateMmAppRequestBindingConfigCommandsTools extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7293782043943</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        public static UpdateMmAppRequestBindingConfigCommandsTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRequestBindingConfigCommandsTools self = new UpdateMmAppRequestBindingConfigCommandsTools();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRequestBindingConfigCommandsTools setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

    }

    public static class UpdateMmAppRequestBindingConfigCommands extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>724366858658</p>
         */
        @NameInMap("DomainCode")
        public String domainCode;

        @NameInMap("Tools")
        public java.util.List<UpdateMmAppRequestBindingConfigCommandsTools> tools;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateMmAppRequestBindingConfigCommands build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRequestBindingConfigCommands self = new UpdateMmAppRequestBindingConfigCommands();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRequestBindingConfigCommands setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public UpdateMmAppRequestBindingConfigCommands setTools(java.util.List<UpdateMmAppRequestBindingConfigCommandsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateMmAppRequestBindingConfigCommandsTools> getTools() {
            return this.tools;
        }

        public UpdateMmAppRequestBindingConfigCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMmAppRequestBindingConfig extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<UpdateMmAppRequestBindingConfigCommands> commands;

        public static UpdateMmAppRequestBindingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRequestBindingConfig self = new UpdateMmAppRequestBindingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRequestBindingConfig setCommands(java.util.List<UpdateMmAppRequestBindingConfigCommands> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<UpdateMmAppRequestBindingConfigCommands> getCommands() {
            return this.commands;
        }

    }

    public static class UpdateMmAppRequestConversationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Paraformer</p>
         */
        @NameInMap("AsrModel")
        public String asrModel;

        @NameInMap("OpenAsr")
        public Boolean openAsr;

        @NameInMap("OpenTts")
        public Boolean openTts;

        /**
         * <strong>example:</strong>
         * <p>cosyvoice-v2</p>
         */
        @NameInMap("TtsModel")
        public String ttsModel;

        public static UpdateMmAppRequestConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRequestConversationConfig self = new UpdateMmAppRequestConversationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRequestConversationConfig setAsrModel(String asrModel) {
            this.asrModel = asrModel;
            return this;
        }
        public String getAsrModel() {
            return this.asrModel;
        }

        public UpdateMmAppRequestConversationConfig setOpenAsr(Boolean openAsr) {
            this.openAsr = openAsr;
            return this;
        }
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        public UpdateMmAppRequestConversationConfig setOpenTts(Boolean openTts) {
            this.openTts = openTts;
            return this;
        }
        public Boolean getOpenTts() {
            return this.openTts;
        }

        public UpdateMmAppRequestConversationConfig setTtsModel(String ttsModel) {
            this.ttsModel = ttsModel;
            return this;
        }
        public String getTtsModel() {
            return this.ttsModel;
        }

    }

    public static class UpdateMmAppRequestModelConfig extends TeaModel {
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
         * <p>qwen-mmh-high-speed</p>
         */
        @NameInMap("TextModal")
        public String textModal;

        public static UpdateMmAppRequestModelConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppRequestModelConfig self = new UpdateMmAppRequestModelConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppRequestModelConfig setHistoryLimit(Integer historyLimit) {
            this.historyLimit = historyLimit;
            return this;
        }
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        public UpdateMmAppRequestModelConfig setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public UpdateMmAppRequestModelConfig setOpenWebSearch(Boolean openWebSearch) {
            this.openWebSearch = openWebSearch;
            return this;
        }
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        public UpdateMmAppRequestModelConfig setTextModal(String textModal) {
            this.textModal = textModal;
            return this;
        }
        public String getTextModal() {
            return this.textModal;
        }

    }

}
