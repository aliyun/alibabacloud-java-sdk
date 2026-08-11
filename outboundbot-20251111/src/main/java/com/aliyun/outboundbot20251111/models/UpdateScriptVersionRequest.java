// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptVersionRequest extends TeaModel {
    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>交互配置</p>
     */
    @NameInMap("InteractionConfig")
    public UpdateScriptVersionRequestInteractionConfig interactionConfig;

    /**
     * <p>草稿版本的标签配置（JSON字符串）</p>
     */
    @NameInMap("LabelConfigs")
    public java.util.List<UpdateScriptVersionRequestLabelConfigs> labelConfigs;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>话术配置</p>
     */
    @NameInMap("ScriptProfile")
    public UpdateScriptVersionRequestScriptProfile scriptProfile;

    /**
     * <p>语音合成配置</p>
     */
    @NameInMap("SynthesizerConfig")
    public UpdateScriptVersionRequestSynthesizerConfig synthesizerConfig;

    /**
     * <p>语音识别配置</p>
     */
    @NameInMap("TranscriberConfig")
    public UpdateScriptVersionRequestTranscriberConfig transcriberConfig;

    /**
     * <p>版本ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b26</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateScriptVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptVersionRequest self = new UpdateScriptVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScriptVersionRequest setInteractionConfig(UpdateScriptVersionRequestInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        return this;
    }
    public UpdateScriptVersionRequestInteractionConfig getInteractionConfig() {
        return this.interactionConfig;
    }

    public UpdateScriptVersionRequest setLabelConfigs(java.util.List<UpdateScriptVersionRequestLabelConfigs> labelConfigs) {
        this.labelConfigs = labelConfigs;
        return this;
    }
    public java.util.List<UpdateScriptVersionRequestLabelConfigs> getLabelConfigs() {
        return this.labelConfigs;
    }

    public UpdateScriptVersionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public UpdateScriptVersionRequest setScriptProfile(UpdateScriptVersionRequestScriptProfile scriptProfile) {
        this.scriptProfile = scriptProfile;
        return this;
    }
    public UpdateScriptVersionRequestScriptProfile getScriptProfile() {
        return this.scriptProfile;
    }

    public UpdateScriptVersionRequest setSynthesizerConfig(UpdateScriptVersionRequestSynthesizerConfig synthesizerConfig) {
        this.synthesizerConfig = synthesizerConfig;
        return this;
    }
    public UpdateScriptVersionRequestSynthesizerConfig getSynthesizerConfig() {
        return this.synthesizerConfig;
    }

    public UpdateScriptVersionRequest setTranscriberConfig(UpdateScriptVersionRequestTranscriberConfig transcriberConfig) {
        this.transcriberConfig = transcriberConfig;
        return this;
    }
    public UpdateScriptVersionRequestTranscriberConfig getTranscriberConfig() {
        return this.transcriberConfig;
    }

    public UpdateScriptVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class UpdateScriptVersionRequestInteractionConfigBargeInConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClosingBargeInEnabled")
        public Boolean closingBargeInEnabled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalBargeInEnabled")
        public Boolean globalBargeInEnabled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpeningBargeInEnabled")
        public Boolean openingBargeInEnabled;

        public static UpdateScriptVersionRequestInteractionConfigBargeInConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigBargeInConfig self = new UpdateScriptVersionRequestInteractionConfigBargeInConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigBargeInConfig setClosingBargeInEnabled(Boolean closingBargeInEnabled) {
            this.closingBargeInEnabled = closingBargeInEnabled;
            return this;
        }
        public Boolean getClosingBargeInEnabled() {
            return this.closingBargeInEnabled;
        }

        public UpdateScriptVersionRequestInteractionConfigBargeInConfig setGlobalBargeInEnabled(Boolean globalBargeInEnabled) {
            this.globalBargeInEnabled = globalBargeInEnabled;
            return this;
        }
        public Boolean getGlobalBargeInEnabled() {
            return this.globalBargeInEnabled;
        }

        public UpdateScriptVersionRequestInteractionConfigBargeInConfig setOpeningBargeInEnabled(Boolean openingBargeInEnabled) {
            this.openingBargeInEnabled = openingBargeInEnabled;
            return this;
        }
        public Boolean getOpeningBargeInEnabled() {
            return this.openingBargeInEnabled;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>感谢您的接听，祝您生活愉快，再见!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers self = new UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfigEndConversationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BargeInEnabled")
        public Boolean bargeInEnabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Triggers")
        public java.util.List<UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> triggers;

        public static UpdateScriptVersionRequestInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigEndConversationConfig self = new UpdateScriptVersionRequestInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig setBargeInEnabled(Boolean bargeInEnabled) {
            this.bargeInEnabled = bargeInEnabled;
            return this;
        }
        public Boolean getBargeInEnabled() {
            return this.bargeInEnabled;
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig setTriggers(java.util.List<UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<UpdateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HangUp</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList self = new UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        @NameInMap("FallbackControlParamsList")
        public java.util.List<UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> fallbackControlParamsList;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li>复述上一轮对话的内容</li>
         * <li>保证上下文自然衔接</li>
         * </ul>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig self = new UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig setFallbackControlParamsList(java.util.List<UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> fallbackControlParamsList) {
            this.fallbackControlParamsList = fallbackControlParamsList;
            return this;
        }
        public java.util.List<UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> getFallbackControlParamsList() {
            return this.fallbackControlParamsList;
        }

        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfigTransitionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>请根据下面对话记录中用户的最新回复，生成一句简短承接语，用于客服自然、顺畅地衔接对话，要求如下：</p>
         * <ol>
         * <li>使用客服场景常用的口语化表达，保持语气自然、礼貌且中立......</li>
         * </ol>
         */
        @NameInMap("AiPhrasePrompt")
        public String aiPhrasePrompt;

        @NameInMap("FixedPhraseList")
        public java.util.List<String> fixedPhraseList;

        /**
         * <strong>example:</strong>
         * <p>aiGenerated</p>
         */
        @NameInMap("PhraseSource")
        public String phraseSource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TransitionSwitch")
        public Boolean transitionSwitch;

        public static UpdateScriptVersionRequestInteractionConfigTransitionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfigTransitionConfig self = new UpdateScriptVersionRequestInteractionConfigTransitionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfigTransitionConfig setAiPhrasePrompt(String aiPhrasePrompt) {
            this.aiPhrasePrompt = aiPhrasePrompt;
            return this;
        }
        public String getAiPhrasePrompt() {
            return this.aiPhrasePrompt;
        }

        public UpdateScriptVersionRequestInteractionConfigTransitionConfig setFixedPhraseList(java.util.List<String> fixedPhraseList) {
            this.fixedPhraseList = fixedPhraseList;
            return this;
        }
        public java.util.List<String> getFixedPhraseList() {
            return this.fixedPhraseList;
        }

        public UpdateScriptVersionRequestInteractionConfigTransitionConfig setPhraseSource(String phraseSource) {
            this.phraseSource = phraseSource;
            return this;
        }
        public String getPhraseSource() {
            return this.phraseSource;
        }

        public UpdateScriptVersionRequestInteractionConfigTransitionConfig setTransitionSwitch(Boolean transitionSwitch) {
            this.transitionSwitch = transitionSwitch;
            return this;
        }
        public Boolean getTransitionSwitch() {
            return this.transitionSwitch;
        }

    }

    public static class UpdateScriptVersionRequestInteractionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>office-ambience</p>
         */
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        @NameInMap("BargeInConfig")
        public UpdateScriptVersionRequestInteractionConfigBargeInConfig bargeInConfig;

        @NameInMap("EndConversationConfig")
        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        @NameInMap("SilenceDetectionConfig")
        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        @NameInMap("TransitionConfig")
        public UpdateScriptVersionRequestInteractionConfigTransitionConfig transitionConfig;

        public static UpdateScriptVersionRequestInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestInteractionConfig self = new UpdateScriptVersionRequestInteractionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public UpdateScriptVersionRequestInteractionConfig setBargeInConfig(UpdateScriptVersionRequestInteractionConfigBargeInConfig bargeInConfig) {
            this.bargeInConfig = bargeInConfig;
            return this;
        }
        public UpdateScriptVersionRequestInteractionConfigBargeInConfig getBargeInConfig() {
            return this.bargeInConfig;
        }

        public UpdateScriptVersionRequestInteractionConfig setEndConversationConfig(UpdateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public UpdateScriptVersionRequestInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public UpdateScriptVersionRequestInteractionConfig setSilenceDetectionConfig(UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public UpdateScriptVersionRequestInteractionConfig setTransitionConfig(UpdateScriptVersionRequestInteractionConfigTransitionConfig transitionConfig) {
            this.transitionConfig = transitionConfig;
            return this;
        }
        public UpdateScriptVersionRequestInteractionConfigTransitionConfig getTransitionConfig() {
            return this.transitionConfig;
        }

    }

    public static class UpdateScriptVersionRequestLabelConfigs extends TeaModel {
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <strong>example:</strong>
         * <p>描述用户对本次服务是否满意</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>满意度</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateScriptVersionRequestLabelConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestLabelConfigs self = new UpdateScriptVersionRequestLabelConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestLabelConfigs setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public UpdateScriptVersionRequestLabelConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateScriptVersionRequestLabelConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateScriptVersionRequestScriptProfileAgentProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;prompts\&quot;:\&quot;我是一个聊天机器人。\&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <strong>example:</strong>
         * <p>OUTBOUND_BOT_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static UpdateScriptVersionRequestScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestScriptProfileAgentProfile self = new UpdateScriptVersionRequestScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public UpdateScriptVersionRequestScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class UpdateScriptVersionRequestScriptProfileFunctionMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        /**
         * <strong>example:</strong>
         * <p>my_funciton</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static UpdateScriptVersionRequestScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestScriptProfileFunctionMeta self = new UpdateScriptVersionRequestScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public UpdateScriptVersionRequestScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public UpdateScriptVersionRequestScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public UpdateScriptVersionRequestScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public UpdateScriptVersionRequestScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateScriptVersionRequestScriptProfileNluAccessProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static UpdateScriptVersionRequestScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestScriptProfileNluAccessProfile self = new UpdateScriptVersionRequestScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class UpdateScriptVersionRequestScriptProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentProfile")
        public UpdateScriptVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>LITE</p>
         */
        @NameInMap("BuilderType")
        public String builderType;

        /**
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("FunctionMeta")
        public UpdateScriptVersionRequestScriptProfileFunctionMeta functionMeta;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NluAccessProfile")
        public UpdateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OmniModel")
        public Boolean omniModel;

        public static UpdateScriptVersionRequestScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestScriptProfile self = new UpdateScriptVersionRequestScriptProfile();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public UpdateScriptVersionRequestScriptProfile setAgentProfile(UpdateScriptVersionRequestScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public UpdateScriptVersionRequestScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public UpdateScriptVersionRequestScriptProfile setBuilderType(String builderType) {
            this.builderType = builderType;
            return this;
        }
        public String getBuilderType() {
            return this.builderType;
        }

        public UpdateScriptVersionRequestScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public UpdateScriptVersionRequestScriptProfile setFunctionMeta(UpdateScriptVersionRequestScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public UpdateScriptVersionRequestScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public UpdateScriptVersionRequestScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateScriptVersionRequestScriptProfile setNluAccessProfile(UpdateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public UpdateScriptVersionRequestScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public UpdateScriptVersionRequestScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public UpdateScriptVersionRequestScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
        }

    }

    public static class UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile self = new UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class UpdateScriptVersionRequestSynthesizerConfigPronRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <strong>example:</strong>
         * <p>环钱</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static UpdateScriptVersionRequestSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestSynthesizerConfigPronRules self = new UpdateScriptVersionRequestSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateScriptVersionRequestSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class UpdateScriptVersionRequestSynthesizerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<UpdateScriptVersionRequestSynthesizerConfigPronRules> pronRules;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <strong>example:</strong>
         * <p>longanyang</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static UpdateScriptVersionRequestSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestSynthesizerConfig self = new UpdateScriptVersionRequestSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setNlsAccessProfile(UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setPronRules(java.util.List<UpdateScriptVersionRequestSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<UpdateScriptVersionRequestSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public UpdateScriptVersionRequestSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class UpdateScriptVersionRequestTranscriberConfigCorrectionRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>啊里巴巴</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <strong>example:</strong>
         * <p>阿里巴巴</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static UpdateScriptVersionRequestTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestTranscriberConfigCorrectionRules self = new UpdateScriptVersionRequestTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateScriptVersionRequestTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile self = new UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class UpdateScriptVersionRequestTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<UpdateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1472</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        /**
         * <strong>example:</strong>
         * <p>Paraformer</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechNoiseThreshold")
        public Integer speechNoiseThreshold;

        /**
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe3</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static UpdateScriptVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScriptVersionRequestTranscriberConfig self = new UpdateScriptVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScriptVersionRequestTranscriberConfig setCorrectionRules(java.util.List<UpdateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<UpdateScriptVersionRequestTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public UpdateScriptVersionRequestTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public UpdateScriptVersionRequestTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public UpdateScriptVersionRequestTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateScriptVersionRequestTranscriberConfig setNlsAccessProfile(UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public UpdateScriptVersionRequestTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public UpdateScriptVersionRequestTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public UpdateScriptVersionRequestTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public UpdateScriptVersionRequestTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

}
