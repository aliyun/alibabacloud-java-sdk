// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateScriptVersionRequest extends TeaModel {
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
    public CreateScriptVersionRequestInteractionConfig interactionConfig;

    /**
     * <p>The label configurations.</p>
     */
    @NameInMap("LabelConfigs")
    public java.util.List<CreateScriptVersionRequestLabelConfigs> labelConfigs;

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
    public CreateScriptVersionRequestScriptProfile scriptProfile;

    /**
     * <p>The source version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b26</p>
     */
    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    /**
     * <p>The TTS configuration.</p>
     */
    @NameInMap("SynthesizerConfig")
    public CreateScriptVersionRequestSynthesizerConfig synthesizerConfig;

    /**
     * <p>The ASR configuration.</p>
     */
    @NameInMap("TranscriberConfig")
    public CreateScriptVersionRequestTranscriberConfig transcriberConfig;

    public static CreateScriptVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptVersionRequest self = new CreateScriptVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptVersionRequest setInteractionConfig(CreateScriptVersionRequestInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        return this;
    }
    public CreateScriptVersionRequestInteractionConfig getInteractionConfig() {
        return this.interactionConfig;
    }

    public CreateScriptVersionRequest setLabelConfigs(java.util.List<CreateScriptVersionRequestLabelConfigs> labelConfigs) {
        this.labelConfigs = labelConfigs;
        return this;
    }
    public java.util.List<CreateScriptVersionRequestLabelConfigs> getLabelConfigs() {
        return this.labelConfigs;
    }

    public CreateScriptVersionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateScriptVersionRequest setScriptProfile(CreateScriptVersionRequestScriptProfile scriptProfile) {
        this.scriptProfile = scriptProfile;
        return this;
    }
    public CreateScriptVersionRequestScriptProfile getScriptProfile() {
        return this.scriptProfile;
    }

    public CreateScriptVersionRequest setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }
    public String getSourceVersionId() {
        return this.sourceVersionId;
    }

    public CreateScriptVersionRequest setSynthesizerConfig(CreateScriptVersionRequestSynthesizerConfig synthesizerConfig) {
        this.synthesizerConfig = synthesizerConfig;
        return this;
    }
    public CreateScriptVersionRequestSynthesizerConfig getSynthesizerConfig() {
        return this.synthesizerConfig;
    }

    public CreateScriptVersionRequest setTranscriberConfig(CreateScriptVersionRequestTranscriberConfig transcriberConfig) {
        this.transcriberConfig = transcriberConfig;
        return this;
    }
    public CreateScriptVersionRequestTranscriberConfig getTranscriberConfig() {
        return this.transcriberConfig;
    }

    public static class CreateScriptVersionRequestInteractionConfigBargeInConfig extends TeaModel {
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

        public static CreateScriptVersionRequestInteractionConfigBargeInConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigBargeInConfig self = new CreateScriptVersionRequestInteractionConfigBargeInConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigBargeInConfig setClosingBargeInEnabled(Boolean closingBargeInEnabled) {
            this.closingBargeInEnabled = closingBargeInEnabled;
            return this;
        }
        public Boolean getClosingBargeInEnabled() {
            return this.closingBargeInEnabled;
        }

        public CreateScriptVersionRequestInteractionConfigBargeInConfig setGlobalBargeInEnabled(Boolean globalBargeInEnabled) {
            this.globalBargeInEnabled = globalBargeInEnabled;
            return this;
        }
        public Boolean getGlobalBargeInEnabled() {
            return this.globalBargeInEnabled;
        }

        public CreateScriptVersionRequestInteractionConfigBargeInConfig setOpeningBargeInEnabled(Boolean openingBargeInEnabled) {
            this.openingBargeInEnabled = openingBargeInEnabled;
            return this;
        }
        public Boolean getOpeningBargeInEnabled() {
            return this.openingBargeInEnabled;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <p>The closing statement played when hanging up after reaching the turn limit.</p>
         * 
         * <strong>example:</strong>
         * <p>Thank you for your time. Have a great day. Goodbye!</p>
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
         * <li>TurnLimit: maximum number of interaction turns.</li>
         * <li>IntelligentVoiceAssistant: voice assistant.</li>
         * <li>InteractiveVoiceResponse: extension transfer.</li>
         * <li>KeyWords: custom interception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>Hangs up when the number of interaction turns exceeds x. Valid values: 0 to 100. A value of 0 indicates that the turn limit hang-up is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers self = new CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfigEndConversationConfig extends TeaModel {
        /**
         * <p>Specifies whether barge-in is supported during the delayed hang-up waiting period.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BargeInEnabled")
        public Boolean bargeInEnabled;

        /**
         * <p>The number of seconds to wait after the closing statement is played before executing the hang-up action. Valid values: 0 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The special condition interception settings.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> triggers;

        public static CreateScriptVersionRequestInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigEndConversationConfig self = new CreateScriptVersionRequestInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfig setBargeInEnabled(Boolean bargeInEnabled) {
            this.bargeInEnabled = bargeInEnabled;
            return this;
        }
        public Boolean getBargeInEnabled() {
            return this.bargeInEnabled;
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public CreateScriptVersionRequestInteractionConfigEndConversationConfig setTriggers(java.util.List<CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList extends TeaModel {
        /**
         * <p>The action to perform during consecutive silence.</p>
         * 
         * <strong>example:</strong>
         * <p>HangUp</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList self = new CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <p>The list of actions to perform during consecutive silence.</p>
         */
        @NameInMap("FallbackControlParamsList")
        public java.util.List<CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> fallbackControlParamsList;

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
         * <p>The silence timeout period, in milliseconds.\
         * When the user remains silent for longer than the specified value, the silence timeout prompt is played.\
         * Valid range: 2000 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig self = new CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setFallbackControlParamsList(java.util.List<CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> fallbackControlParamsList) {
            this.fallbackControlParamsList = fallbackControlParamsList;
            return this;
        }
        public java.util.List<CreateScriptVersionRequestInteractionConfigSilenceDetectionConfigFallbackControlParamsList> getFallbackControlParamsList() {
            return this.fallbackControlParamsList;
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfigTransitionConfig extends TeaModel {
        /**
         * <p>The model generation prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Based on the user\&quot;s latest reply in the conversation history below, generate a brief transitional phrase for the customer service agent to naturally and smoothly connect the dialogue. Requirements are as follows:</p>
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

        public static CreateScriptVersionRequestInteractionConfigTransitionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigTransitionConfig self = new CreateScriptVersionRequestInteractionConfigTransitionConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfigTransitionConfig setAiPhrasePrompt(String aiPhrasePrompt) {
            this.aiPhrasePrompt = aiPhrasePrompt;
            return this;
        }
        public String getAiPhrasePrompt() {
            return this.aiPhrasePrompt;
        }

        public CreateScriptVersionRequestInteractionConfigTransitionConfig setFixedPhraseList(java.util.List<String> fixedPhraseList) {
            this.fixedPhraseList = fixedPhraseList;
            return this;
        }
        public java.util.List<String> getFixedPhraseList() {
            return this.fixedPhraseList;
        }

        public CreateScriptVersionRequestInteractionConfigTransitionConfig setPhraseSource(String phraseSource) {
            this.phraseSource = phraseSource;
            return this;
        }
        public String getPhraseSource() {
            return this.phraseSource;
        }

        public CreateScriptVersionRequestInteractionConfigTransitionConfig setTransitionSwitch(Boolean transitionSwitch) {
            this.transitionSwitch = transitionSwitch;
            return this;
        }
        public Boolean getTransitionSwitch() {
            return this.transitionSwitch;
        }

    }

    public static class CreateScriptVersionRequestInteractionConfig extends TeaModel {
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
        public CreateScriptVersionRequestInteractionConfigBargeInConfig bargeInConfig;

        /**
         * <p>The hang-up configuration.</p>
         */
        @NameInMap("EndConversationConfig")
        public CreateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

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
        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        /**
         * <p>The transition phrase model configuration.</p>
         */
        @NameInMap("TransitionConfig")
        public CreateScriptVersionRequestInteractionConfigTransitionConfig transitionConfig;

        public static CreateScriptVersionRequestInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfig self = new CreateScriptVersionRequestInteractionConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public CreateScriptVersionRequestInteractionConfig setBargeInConfig(CreateScriptVersionRequestInteractionConfigBargeInConfig bargeInConfig) {
            this.bargeInConfig = bargeInConfig;
            return this;
        }
        public CreateScriptVersionRequestInteractionConfigBargeInConfig getBargeInConfig() {
            return this.bargeInConfig;
        }

        public CreateScriptVersionRequestInteractionConfig setEndConversationConfig(CreateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public CreateScriptVersionRequestInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public CreateScriptVersionRequestInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public CreateScriptVersionRequestInteractionConfig setSilenceDetectionConfig(CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

        public CreateScriptVersionRequestInteractionConfig setTransitionConfig(CreateScriptVersionRequestInteractionConfigTransitionConfig transitionConfig) {
            this.transitionConfig = transitionConfig;
            return this;
        }
        public CreateScriptVersionRequestInteractionConfigTransitionConfig getTransitionConfig() {
            return this.transitionConfig;
        }

    }

    public static class CreateScriptVersionRequestLabelConfigs extends TeaModel {
        /**
         * <p>The candidate values for the label.</p>
         */
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Describes whether the user is satisfied with the service</p>
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

        public static CreateScriptVersionRequestLabelConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestLabelConfigs self = new CreateScriptVersionRequestLabelConfigs();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestLabelConfigs setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public CreateScriptVersionRequestLabelConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScriptVersionRequestLabelConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateScriptVersionRequestScriptProfileAgentProfile extends TeaModel {
        /**
         * <p>The prompt JSON.</p>
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

        public static CreateScriptVersionRequestScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestScriptProfileAgentProfile self = new CreateScriptVersionRequestScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public CreateScriptVersionRequestScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class CreateScriptVersionRequestScriptProfileFunctionMeta extends TeaModel {
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

        public static CreateScriptVersionRequestScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestScriptProfileFunctionMeta self = new CreateScriptVersionRequestScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public CreateScriptVersionRequestScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public CreateScriptVersionRequestScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public CreateScriptVersionRequestScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public CreateScriptVersionRequestScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateScriptVersionRequestScriptProfileNluAccessProfile extends TeaModel {
        /**
         * <p>The third-party dialogue model configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateScriptVersionRequestScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestScriptProfileNluAccessProfile self = new CreateScriptVersionRequestScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateScriptVersionRequestScriptProfile extends TeaModel {
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
        public CreateScriptVersionRequestScriptProfileAgentProfile agentProfile;

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
         * <p>The Function Compute configuration.</p>
         */
        @NameInMap("FunctionMeta")
        public CreateScriptVersionRequestScriptProfileFunctionMeta functionMeta;

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
        public CreateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile;

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

        public static CreateScriptVersionRequestScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestScriptProfile self = new CreateScriptVersionRequestScriptProfile();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public CreateScriptVersionRequestScriptProfile setAgentProfile(CreateScriptVersionRequestScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public CreateScriptVersionRequestScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public CreateScriptVersionRequestScriptProfile setBuilderType(String builderType) {
            this.builderType = builderType;
            return this;
        }
        public String getBuilderType() {
            return this.builderType;
        }

        public CreateScriptVersionRequestScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public CreateScriptVersionRequestScriptProfile setFunctionMeta(CreateScriptVersionRequestScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public CreateScriptVersionRequestScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public CreateScriptVersionRequestScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateScriptVersionRequestScriptProfile setNluAccessProfile(CreateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public CreateScriptVersionRequestScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public CreateScriptVersionRequestScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public CreateScriptVersionRequestScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
        }

    }

    public static class CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>The third-party speech configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile self = new CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateScriptVersionRequestSynthesizerConfigPronRules extends TeaModel {
        /**
         * <p>The easily mispronounced word.</p>
         * 
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The homophonic word.</p>
         * 
         * <strong>example:</strong>
         * <p>环钱</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static CreateScriptVersionRequestSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestSynthesizerConfigPronRules self = new CreateScriptVersionRequestSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public CreateScriptVersionRequestSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class CreateScriptVersionRequestSynthesizerConfig extends TeaModel {
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
        public CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

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
         * <p>The pitch.</p>
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
        public java.util.List<CreateScriptVersionRequestSynthesizerConfigPronRules> pronRules;

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

        public static CreateScriptVersionRequestSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestSynthesizerConfig self = new CreateScriptVersionRequestSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateScriptVersionRequestSynthesizerConfig setNlsAccessProfile(CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public CreateScriptVersionRequestSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public CreateScriptVersionRequestSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public CreateScriptVersionRequestSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public CreateScriptVersionRequestSynthesizerConfig setPronRules(java.util.List<CreateScriptVersionRequestSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<CreateScriptVersionRequestSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public CreateScriptVersionRequestSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public CreateScriptVersionRequestSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public CreateScriptVersionRequestSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class CreateScriptVersionRequestTranscriberConfigCorrectionRules extends TeaModel {
        /**
         * <p>The incorrectly recognized text.</p>
         * 
         * <strong>example:</strong>
         * <p>啊里巴巴</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The corrected text.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里巴巴</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static CreateScriptVersionRequestTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestTranscriberConfigCorrectionRules self = new CreateScriptVersionRequestTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public CreateScriptVersionRequestTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class CreateScriptVersionRequestTranscriberConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>The third-party speech configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateScriptVersionRequestTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestTranscriberConfigNlsAccessProfile self = new CreateScriptVersionRequestTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateScriptVersionRequestTranscriberConfig extends TeaModel {
        /**
         * <p>The ASR correction dictionary.</p>
         */
        @NameInMap("CorrectionRules")
        public java.util.List<CreateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <p>The custom language model ID for ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <p>The silence detection threshold. Sentence segmentation is triggered when the speaking interval exceeds x milliseconds, which is also known as Voice Activity Detection (VAD).</p>
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
        public CreateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

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
         * <p>The noise parameter threshold. Valid values: -100 to 100. Description:</p>
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

        public static CreateScriptVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestTranscriberConfig self = new CreateScriptVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestTranscriberConfig setCorrectionRules(java.util.List<CreateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<CreateScriptVersionRequestTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public CreateScriptVersionRequestTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public CreateScriptVersionRequestTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public CreateScriptVersionRequestTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateScriptVersionRequestTranscriberConfig setNlsAccessProfile(CreateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public CreateScriptVersionRequestTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public CreateScriptVersionRequestTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public CreateScriptVersionRequestTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public CreateScriptVersionRequestTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public CreateScriptVersionRequestTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

}
