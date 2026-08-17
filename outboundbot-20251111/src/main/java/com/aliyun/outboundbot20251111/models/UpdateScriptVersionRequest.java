// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptVersionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interaction configuration.</p>
     */
    @NameInMap("InteractionConfig")
    public UpdateScriptVersionRequestInteractionConfig interactionConfig;

    /**
     * <p>The label configurations.</p>
     */
    @NameInMap("LabelConfigs")
    public java.util.List<UpdateScriptVersionRequestLabelConfigs> labelConfigs;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The dialogue capability configuration.</p>
     */
    @NameInMap("ScriptProfile")
    public UpdateScriptVersionRequestScriptProfile scriptProfile;

    /**
     * <p>The TTS configuration.</p>
     */
    @NameInMap("SynthesizerConfig")
    public UpdateScriptVersionRequestSynthesizerConfig synthesizerConfig;

    /**
     * <p>The ASR configuration.</p>
     */
    @NameInMap("TranscriberConfig")
    public UpdateScriptVersionRequestTranscriberConfig transcriberConfig;

    /**
     * <p>The version ID.</p>
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
         * <p>Specifies whether barge-in is supported during the closing statement.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClosingBargeInEnabled")
        public Boolean closingBargeInEnabled;

        /**
         * <p>Specifies whether barge-in is supported during the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalBargeInEnabled")
        public Boolean globalBargeInEnabled;

        /**
         * <p>Specifies whether barge-in is supported during the opening greeting.</p>
         * 
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
         * <p>The closing script to play when the turn limit is reached and hang-up is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>Thank you for answering the call. Have a nice day. Goodbye!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        /**
         * <p>The list of custom interception keywords.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>TurnLimit: maximum interaction turn limit check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The maximum number of interaction turns before executing hang-up. Valid values: 0 to 100. A value of 0 indicates that the turn-limit hang-up is not enabled.</p>
         * 
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
         * <p>Specifies whether barge-in is supported during the delayed hang-up waiting period.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BargeInEnabled")
        public Boolean bargeInEnabled;

        /**
         * <p>The number of seconds to wait after the hang-up script finishes playing before executing the hang-up action. Valid values: 0 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The special condition interception configuration.</p>
         */
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
         * <p>The action to perform during consecutive silence.</p>
         * 
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
        /**
         * <p>The list of actions to perform during consecutive silence.</p>
         */
        @NameInMap("FallbackControlParamsList")
        public java.util.List<UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> fallbackControlParamsList;

        /**
         * <p>The number of consecutive silence rounds before hanging up.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The silence prompt.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>Repeat the content of the previous conversation round</li>
         * </ul>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The silence timeout period, in milliseconds. When the user remains silent for longer than the specified value, the silence timeout prompt is played. Valid range: 2000 to 10000.</p>
         * 
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
         * <p>The prompt for model-generated transition phrases.</p>
         * 
         * <strong>example:</strong>
         * <p>Based on the user\&quot;s latest reply in the conversation history below, generate a brief transitional phrase for the customer service agent to naturally and smoothly connect the conversation. Requirements are as follows:</p>
         * <ol>
         * <li>Use colloquial expressions common in customer service scenarios, maintaining a natural, polite, and neutral tone......</li>
         * </ol>
         */
        @NameInMap("AiPhrasePrompt")
        public String aiPhrasePrompt;

        /**
         * <p>The list of fixed transition phrases.</p>
         */
        @NameInMap("FixedPhraseList")
        public java.util.List<String> fixedPhraseList;

        /**
         * <p>The method for generating transition phrases.</p>
         * 
         * <strong>example:</strong>
         * <p>aiGenerated</p>
         */
        @NameInMap("PhraseSource")
        public String phraseSource;

        /**
         * <p>Specifies whether to enable transition phrases.</p>
         * 
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
         * <p>The background music ID.</p>
         * 
         * <strong>example:</strong>
         * <p>office-ambience</p>
         */
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        /**
         * <p>The barge-in configuration.</p>
         */
        @NameInMap("BargeInConfig")
        public UpdateScriptVersionRequestInteractionConfigBargeInConfig bargeInConfig;

        /**
         * <p>The hang-up configuration.</p>
         */
        @NameInMap("EndConversationConfig")
        public UpdateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <p>The delay in milliseconds before playing audio after the call is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        /**
         * <p>The silence detection configuration.</p>
         */
        @NameInMap("SilenceDetectionConfig")
        public UpdateScriptVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        /**
         * <p>The transition phrase model configuration.</p>
         */
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
        /**
         * <p>The candidate values for the label.</p>
         */
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Describes whether the user is satisfied with this service</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>Satisfaction</p>
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
         * <p>The prompt in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;prompts\&quot;:\&quot;I am a chatbot.\&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <p>The scenario template ID.</p>
         * 
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
         * <p>The function service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        /**
         * <p>The function service name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_funciton</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The function trigger name.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <p>The function trigger URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <p>The region where the function service resides.</p>
         * 
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
         * <p>The third-party dialogue model configuration ID.</p>
         * 
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
         * <p>The chatbot AgentKey.</p>
         * 
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>The dialogue agent configuration.</p>
         */
        @NameInMap("AgentProfile")
        public UpdateScriptVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <p>The chatbot type.</p>
         * 
         * <strong>example:</strong>
         * <p>LITE</p>
         */
        @NameInMap("BuilderType")
        public String builderType;

        /**
         * <p>The chatbot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>The function compute configuration.</p>
         */
        @NameInMap("FunctionMeta")
        public UpdateScriptVersionRequestScriptProfileFunctionMeta functionMeta;

        /**
         * <p>The dialogue model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The associated configuration.</p>
         */
        @NameInMap("NluAccessProfile")
        public UpdateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile;

        /**
         * <p>The dialogue model invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>Specifies whether the model is an Omni model.</p>
         * 
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
         * <p>The third-party speech configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
         * 
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
         * <p>The easily mispronounced word or phrase.</p>
         * 
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The homophonic word or phrase.</p>
         * 
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
         * <p>The TTS model.</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The associated configuration.</p>
         */
        @NameInMap("NlsAccessProfile")
        public UpdateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The TTS invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The pitch rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <p>The TTS correction dictionary.</p>
         */
        @NameInMap("PronRules")
        public java.util.List<UpdateScriptVersionRequestSynthesizerConfigPronRules> pronRules;

        /**
         * <p>The speech rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The voice.</p>
         * 
         * <strong>example:</strong>
         * <p>longanyang</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume.</p>
         * 
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
         * <p>The incorrectly recognized text.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliabba</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The corrected text.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
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
         * <p>The third-party speech configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
         * 
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
        /**
         * <p>The ASR correction dictionary.</p>
         */
        @NameInMap("CorrectionRules")
        public java.util.List<UpdateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <p>The custom language model ID for ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1472</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <p>The silence detection threshold. Sentence segmentation is triggered when the speaking interval exceeds x milliseconds, also known as Voice Activity Detection (VAD).</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        /**
         * <p>The ASR model.</p>
         * 
         * <strong>example:</strong>
         * <p>Paraformer</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The associated configuration.</p>
         */
        @NameInMap("NlsAccessProfile")
        public UpdateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The ASR invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The ASR engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The noise threshold. Valid values: -100 to 100.</p>
         * <p>A value closer to -100 increases the probability that noise is recognized as speech.</p>
         * <p>A value closer to +100 increases the probability that speech is recognized as noise.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechNoiseThreshold")
        public Integer speechNoiseThreshold;

        /**
         * <p>The hot word list ID. You can obtain this ID from the hot word management page.</p>
         * 
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
