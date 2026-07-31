// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppAndBindingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BindingConfig")
    public UpdateMmAppAndBindingRequestBindingConfig bindingConfig;

    @NameInMap("ConversationConfig")
    public UpdateMmAppAndBindingRequestConversationConfig conversationConfig;

    @NameInMap("MemoryConfig")
    public UpdateMmAppAndBindingRequestMemoryConfig memoryConfig;

    @NameInMap("ModelConfig")
    public UpdateMmAppAndBindingRequestModelConfig modelConfig;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppAndBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppAndBindingRequest self = new UpdateMmAppAndBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppAndBindingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppAndBindingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMmAppAndBindingRequest setBindingConfig(UpdateMmAppAndBindingRequestBindingConfig bindingConfig) {
        this.bindingConfig = bindingConfig;
        return this;
    }
    public UpdateMmAppAndBindingRequestBindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    public UpdateMmAppAndBindingRequest setConversationConfig(UpdateMmAppAndBindingRequestConversationConfig conversationConfig) {
        this.conversationConfig = conversationConfig;
        return this;
    }
    public UpdateMmAppAndBindingRequestConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    public UpdateMmAppAndBindingRequest setMemoryConfig(UpdateMmAppAndBindingRequestMemoryConfig memoryConfig) {
        this.memoryConfig = memoryConfig;
        return this;
    }
    public UpdateMmAppAndBindingRequestMemoryConfig getMemoryConfig() {
        return this.memoryConfig;
    }

    public UpdateMmAppAndBindingRequest setModelConfig(UpdateMmAppAndBindingRequestModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public UpdateMmAppAndBindingRequestModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public UpdateMmAppAndBindingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateMmAppAndBindingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateMmAppAndBindingRequestBindingConfigAgents extends TeaModel {
        @NameInMap("AgentCode")
        public String agentCode;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("CentralConfig")
        public java.util.Map<String, ?> centralConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("IntentFewShotConfig")
        public java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> intentFewShotConfig;

        @NameInMap("OwnConfig")
        public java.util.Map<String, ?> ownConfig;

        public static UpdateMmAppAndBindingRequestBindingConfigAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigAgents self = new UpdateMmAppAndBindingRequestBindingConfigAgents();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setAgentCode(String agentCode) {
            this.agentCode = agentCode;
            return this;
        }
        public String getAgentCode() {
            return this.agentCode;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setCentralConfig(java.util.Map<String, ?> centralConfig) {
            this.centralConfig = centralConfig;
            return this;
        }
        public java.util.Map<String, ?> getCentralConfig() {
            return this.centralConfig;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setIntentFewShotConfig(java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> intentFewShotConfig) {
            this.intentFewShotConfig = intentFewShotConfig;
            return this;
        }
        public java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> getIntentFewShotConfig() {
            return this.intentFewShotConfig;
        }

        public UpdateMmAppAndBindingRequestBindingConfigAgents setOwnConfig(java.util.Map<String, ?> ownConfig) {
            this.ownConfig = ownConfig;
            return this;
        }
        public java.util.Map<String, ?> getOwnConfig() {
            return this.ownConfig;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples extends TeaModel {
        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        @NameInMap("Query")
        public String query;

        public static UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples self = new UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams extends TeaModel {
        @NameInMap("ParamDesc")
        public String paramDesc;

        @NameInMap("ParamExample")
        public String paramExample;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("Required")
        public Boolean required;

        public static UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams self = new UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams setParamExample(String paramExample) {
            this.paramExample = paramExample;
            return this;
        }
        public String getParamExample() {
            return this.paramExample;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigCommandsTools extends TeaModel {
        @NameInMap("ReplyMode")
        public String replyMode;

        @NameInMap("ToolDescription")
        public String toolDescription;

        @NameInMap("ToolExamples")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples> toolExamples;

        @NameInMap("ToolId")
        public String toolId;

        @NameInMap("ToolName")
        public String toolName;

        @NameInMap("ToolParams")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams> toolParams;

        public static UpdateMmAppAndBindingRequestBindingConfigCommandsTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigCommandsTools self = new UpdateMmAppAndBindingRequestBindingConfigCommandsTools();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setReplyMode(String replyMode) {
            this.replyMode = replyMode;
            return this;
        }
        public String getReplyMode() {
            return this.replyMode;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setToolDescription(String toolDescription) {
            this.toolDescription = toolDescription;
            return this;
        }
        public String getToolDescription() {
            return this.toolDescription;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setToolExamples(java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples> toolExamples) {
            this.toolExamples = toolExamples;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolExamples> getToolExamples() {
            return this.toolExamples;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommandsTools setToolParams(java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams> toolParams) {
            this.toolParams = toolParams;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsToolsToolParams> getToolParams() {
            return this.toolParams;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigCommands extends TeaModel {
        @NameInMap("DomainCode")
        public String domainCode;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Tools")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsTools> tools;

        @NameInMap("Type")
        public String type;

        public static UpdateMmAppAndBindingRequestBindingConfigCommands build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigCommands self = new UpdateMmAppAndBindingRequestBindingConfigCommands();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommands setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommands setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommands setTools(java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommandsTools> getTools() {
            return this.tools;
        }

        public UpdateMmAppAndBindingRequestBindingConfigCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigMcps extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ToolList")
        public java.util.List<String> toolList;

        @NameInMap("Type")
        public String type;

        public static UpdateMmAppAndBindingRequestBindingConfigMcps build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigMcps self = new UpdateMmAppAndBindingRequestBindingConfigMcps();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigMcps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateMmAppAndBindingRequestBindingConfigMcps setToolList(java.util.List<String> toolList) {
            this.toolList = toolList;
            return this;
        }
        public java.util.List<String> getToolList() {
            return this.toolList;
        }

        public UpdateMmAppAndBindingRequestBindingConfigMcps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigPlugins extends TeaModel {
        @NameInMap("PluginCode")
        public String pluginCode;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginType")
        public String pluginType;

        public static UpdateMmAppAndBindingRequestBindingConfigPlugins build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigPlugins self = new UpdateMmAppAndBindingRequestBindingConfigPlugins();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigPlugins setPluginCode(String pluginCode) {
            this.pluginCode = pluginCode;
            return this;
        }
        public String getPluginCode() {
            return this.pluginCode;
        }

        public UpdateMmAppAndBindingRequestBindingConfigPlugins setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public UpdateMmAppAndBindingRequestBindingConfigPlugins setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfigRagConfig extends TeaModel {
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        @NameInMap("KnowledgeBaseCodeList")
        public java.util.List<String> knowledgeBaseCodeList;

        @NameInMap("PromptStrategy")
        public String promptStrategy;

        @NameInMap("RankWeights")
        public java.util.Map<String, Double> rankWeights;

        @NameInMap("RetrieveMaxLength")
        public Integer retrieveMaxLength;

        @NameInMap("TopK")
        public Integer topK;

        public static UpdateMmAppAndBindingRequestBindingConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfigRagConfig self = new UpdateMmAppAndBindingRequestBindingConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setPromptStrategy(String promptStrategy) {
            this.promptStrategy = promptStrategy;
            return this;
        }
        public String getPromptStrategy() {
            return this.promptStrategy;
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setRankWeights(java.util.Map<String, Double> rankWeights) {
            this.rankWeights = rankWeights;
            return this;
        }
        public java.util.Map<String, Double> getRankWeights() {
            return this.rankWeights;
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setRetrieveMaxLength(Integer retrieveMaxLength) {
            this.retrieveMaxLength = retrieveMaxLength;
            return this;
        }
        public Integer getRetrieveMaxLength() {
            return this.retrieveMaxLength;
        }

        public UpdateMmAppAndBindingRequestBindingConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class UpdateMmAppAndBindingRequestBindingConfig extends TeaModel {
        @NameInMap("Agents")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigAgents> agents;

        @NameInMap("Commands")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommands> commands;

        @NameInMap("Mcps")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigMcps> mcps;

        @NameInMap("Plugins")
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigPlugins> plugins;

        @NameInMap("RagConfig")
        public UpdateMmAppAndBindingRequestBindingConfigRagConfig ragConfig;

        public static UpdateMmAppAndBindingRequestBindingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestBindingConfig self = new UpdateMmAppAndBindingRequestBindingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestBindingConfig setAgents(java.util.List<UpdateMmAppAndBindingRequestBindingConfigAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigAgents> getAgents() {
            return this.agents;
        }

        public UpdateMmAppAndBindingRequestBindingConfig setCommands(java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommands> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigCommands> getCommands() {
            return this.commands;
        }

        public UpdateMmAppAndBindingRequestBindingConfig setMcps(java.util.List<UpdateMmAppAndBindingRequestBindingConfigMcps> mcps) {
            this.mcps = mcps;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigMcps> getMcps() {
            return this.mcps;
        }

        public UpdateMmAppAndBindingRequestBindingConfig setPlugins(java.util.List<UpdateMmAppAndBindingRequestBindingConfigPlugins> plugins) {
            this.plugins = plugins;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestBindingConfigPlugins> getPlugins() {
            return this.plugins;
        }

        public UpdateMmAppAndBindingRequestBindingConfig setRagConfig(UpdateMmAppAndBindingRequestBindingConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public UpdateMmAppAndBindingRequestBindingConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

    }

    public static class UpdateMmAppAndBindingRequestConversationConfig extends TeaModel {
        @NameInMap("AsrModel")
        public String asrModel;

        @NameInMap("OpenAsr")
        public Boolean openAsr;

        @NameInMap("OpenTts")
        public Boolean openTts;

        @NameInMap("StopOrRejectFlag")
        public Boolean stopOrRejectFlag;

        @NameInMap("TtsModel")
        public String ttsModel;

        public static UpdateMmAppAndBindingRequestConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestConversationConfig self = new UpdateMmAppAndBindingRequestConversationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestConversationConfig setAsrModel(String asrModel) {
            this.asrModel = asrModel;
            return this;
        }
        public String getAsrModel() {
            return this.asrModel;
        }

        public UpdateMmAppAndBindingRequestConversationConfig setOpenAsr(Boolean openAsr) {
            this.openAsr = openAsr;
            return this;
        }
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        public UpdateMmAppAndBindingRequestConversationConfig setOpenTts(Boolean openTts) {
            this.openTts = openTts;
            return this;
        }
        public Boolean getOpenTts() {
            return this.openTts;
        }

        public UpdateMmAppAndBindingRequestConversationConfig setStopOrRejectFlag(Boolean stopOrRejectFlag) {
            this.stopOrRejectFlag = stopOrRejectFlag;
            return this;
        }
        public Boolean getStopOrRejectFlag() {
            return this.stopOrRejectFlag;
        }

        public UpdateMmAppAndBindingRequestConversationConfig setTtsModel(String ttsModel) {
            this.ttsModel = ttsModel;
            return this;
        }
        public String getTtsModel() {
            return this.ttsModel;
        }

    }

    public static class UpdateMmAppAndBindingRequestMemoryConfigAttributes extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        public static UpdateMmAppAndBindingRequestMemoryConfigAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestMemoryConfigAttributes self = new UpdateMmAppAndBindingRequestMemoryConfigAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestMemoryConfigAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdateMmAppAndBindingRequestMemoryConfigAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMmAppAndBindingRequestMemoryConfig extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<UpdateMmAppAndBindingRequestMemoryConfigAttributes> attributes;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        public static UpdateMmAppAndBindingRequestMemoryConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestMemoryConfig self = new UpdateMmAppAndBindingRequestMemoryConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestMemoryConfig setAttributes(java.util.List<UpdateMmAppAndBindingRequestMemoryConfigAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestMemoryConfigAttributes> getAttributes() {
            return this.attributes;
        }

        public UpdateMmAppAndBindingRequestMemoryConfig setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdateMmAppAndBindingRequestMemoryConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMmAppAndBindingRequestModelConfigUserPromptParams extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static UpdateMmAppAndBindingRequestModelConfigUserPromptParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestModelConfigUserPromptParams self = new UpdateMmAppAndBindingRequestModelConfigUserPromptParams();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestModelConfigUserPromptParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserPromptParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserPromptParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserPromptParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMmAppAndBindingRequestModelConfigUserQueryParams extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static UpdateMmAppAndBindingRequestModelConfigUserQueryParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestModelConfigUserQueryParams self = new UpdateMmAppAndBindingRequestModelConfigUserQueryParams();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestModelConfigUserQueryParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserQueryParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserQueryParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMmAppAndBindingRequestModelConfigUserQueryParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMmAppAndBindingRequestModelConfig extends TeaModel {
        @NameInMap("EnableIntentRecognize")
        public Boolean enableIntentRecognize;

        @NameInMap("EnableTransition")
        public Boolean enableTransition;

        @NameInMap("HistoryLimit")
        public Integer historyLimit;

        @NameInMap("IntentOnlySwitch")
        public Boolean intentOnlySwitch;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("OpenMemory")
        public Boolean openMemory;

        @NameInMap("OpenWebSearch")
        public Boolean openWebSearch;

        @NameInMap("SearchModel")
        public String searchModel;

        @NameInMap("SearchStrategy")
        public String searchStrategy;

        @NameInMap("TextModal")
        public String textModal;

        @NameInMap("UserPromptParams")
        public java.util.List<UpdateMmAppAndBindingRequestModelConfigUserPromptParams> userPromptParams;

        @NameInMap("userQueryParams")
        public java.util.List<UpdateMmAppAndBindingRequestModelConfigUserQueryParams> userQueryParams;

        public static UpdateMmAppAndBindingRequestModelConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppAndBindingRequestModelConfig self = new UpdateMmAppAndBindingRequestModelConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppAndBindingRequestModelConfig setEnableIntentRecognize(Boolean enableIntentRecognize) {
            this.enableIntentRecognize = enableIntentRecognize;
            return this;
        }
        public Boolean getEnableIntentRecognize() {
            return this.enableIntentRecognize;
        }

        public UpdateMmAppAndBindingRequestModelConfig setEnableTransition(Boolean enableTransition) {
            this.enableTransition = enableTransition;
            return this;
        }
        public Boolean getEnableTransition() {
            return this.enableTransition;
        }

        public UpdateMmAppAndBindingRequestModelConfig setHistoryLimit(Integer historyLimit) {
            this.historyLimit = historyLimit;
            return this;
        }
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        public UpdateMmAppAndBindingRequestModelConfig setIntentOnlySwitch(Boolean intentOnlySwitch) {
            this.intentOnlySwitch = intentOnlySwitch;
            return this;
        }
        public Boolean getIntentOnlySwitch() {
            return this.intentOnlySwitch;
        }

        public UpdateMmAppAndBindingRequestModelConfig setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public UpdateMmAppAndBindingRequestModelConfig setOpenMemory(Boolean openMemory) {
            this.openMemory = openMemory;
            return this;
        }
        public Boolean getOpenMemory() {
            return this.openMemory;
        }

        public UpdateMmAppAndBindingRequestModelConfig setOpenWebSearch(Boolean openWebSearch) {
            this.openWebSearch = openWebSearch;
            return this;
        }
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        public UpdateMmAppAndBindingRequestModelConfig setSearchModel(String searchModel) {
            this.searchModel = searchModel;
            return this;
        }
        public String getSearchModel() {
            return this.searchModel;
        }

        public UpdateMmAppAndBindingRequestModelConfig setSearchStrategy(String searchStrategy) {
            this.searchStrategy = searchStrategy;
            return this;
        }
        public String getSearchStrategy() {
            return this.searchStrategy;
        }

        public UpdateMmAppAndBindingRequestModelConfig setTextModal(String textModal) {
            this.textModal = textModal;
            return this;
        }
        public String getTextModal() {
            return this.textModal;
        }

        public UpdateMmAppAndBindingRequestModelConfig setUserPromptParams(java.util.List<UpdateMmAppAndBindingRequestModelConfigUserPromptParams> userPromptParams) {
            this.userPromptParams = userPromptParams;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestModelConfigUserPromptParams> getUserPromptParams() {
            return this.userPromptParams;
        }

        public UpdateMmAppAndBindingRequestModelConfig setUserQueryParams(java.util.List<UpdateMmAppAndBindingRequestModelConfigUserQueryParams> userQueryParams) {
            this.userQueryParams = userQueryParams;
            return this;
        }
        public java.util.List<UpdateMmAppAndBindingRequestModelConfigUserQueryParams> getUserQueryParams() {
            return this.userQueryParams;
        }

    }

}
