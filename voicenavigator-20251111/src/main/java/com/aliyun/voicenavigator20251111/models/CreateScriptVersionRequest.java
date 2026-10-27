// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateScriptVersionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interaction configuration.</p>
     */
    @NameInMap("InteractionConfig")
    public CreateScriptVersionRequestInteractionConfig interactionConfig;

    /**
     * <p>The custom label configuration.</p>
     */
    @NameInMap("LabelConfig")
    public java.util.List<CreateScriptVersionRequestLabelConfig> labelConfig;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The conversation capability configuration.</p>
     */
    @NameInMap("ScriptProfile")
    public CreateScriptVersionRequestScriptProfile scriptProfile;

    /**
     * <strong>example:</strong>
     * <p>d7b8a210-1f2d-4c5b-8a63-01e4f3b7c9d2</p>
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

    public CreateScriptVersionRequest setLabelConfig(java.util.List<CreateScriptVersionRequestLabelConfig> labelConfig) {
        this.labelConfig = labelConfig;
        return this;
    }
    public java.util.List<CreateScriptVersionRequestLabelConfig> getLabelConfig() {
        return this.labelConfig;
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

    public static class CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <p>The closing statement played when the turn limit is reached and the hang-up action is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>Thank you for your time. Have a nice day. Goodbye!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        /**
         * <p>The list of custom interception keywords.</p>
         */
        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        /**
         * <p>Valid values:\</p>
         * <ul>
         * <li>TurnLimit: Maximum interaction turn check.\</li>
         * <li>IntelligentVoiceAssistant: Voice assistant.\</li>
         * <li>InteractiveVoiceResponse: Extension transfer.\</li>
         * <li>KeyWords: Custom interception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The maximum number of interaction turns before the hang-up action is executed. Valid values: 0 to 100. A value of 0 indicates that the turn-limit hang-up feature is disabled.</p>
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

        public CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
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
         * <p>The number of seconds to wait after the hang-up script finishes playing before executing the hang-up action. Valid values: 0 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>The special case interception rules.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<CreateScriptVersionRequestInteractionConfigEndConversationConfigTriggers> triggers;

        public static CreateScriptVersionRequestInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestInteractionConfigEndConversationConfig self = new CreateScriptVersionRequestInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
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

    public static class CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <p>The number of consecutive silence turns before the hang-up action is executed.\
         * This parameter takes effect when NluEngine is set to PROMPTS for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The silence timeout period, in milliseconds.\
         * When the user remains silent for longer than the specified value, the silence timeout script is played.\
         * Valid values: 2000 to 10000.</p>
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

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public CreateScriptVersionRequestInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
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
         * <p>The hang-up configuration.</p>
         */
        @NameInMap("EndConversationConfig")
        public CreateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <p>The delay before playing the greeting after the call is connected. Unit: milliseconds.</p>
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

    }

    public static class CreateScriptVersionRequestLabelConfig extends TeaModel {
        /**
         * <p>The list of candidate values for the label.</p>
         */
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>Whether the user agrees to repay before the repayment deadline</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agree to repay</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateScriptVersionRequestLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestLabelConfig self = new CreateScriptVersionRequestLabelConfig();
            return TeaModel.build(map, self);
        }

        public CreateScriptVersionRequestLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public CreateScriptVersionRequestLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScriptVersionRequestLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateScriptVersionRequestScriptProfileAgentProfile extends TeaModel {
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
         * <p>CCC_PROMPTS_DEFAULT</p>
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
         * <p>The function service ID.\
         * This parameter is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        /**
         * <p>The function service name.\
         * This parameter is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>my_funciton</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The HTTP trigger name.\
         * This parameter is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <p>The HTTP trigger URL.\
         * This parameter is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <p>The region where the function service resides.\
         * This parameter is required when NluEngine is set to FUNCTION for the current scenario.</p>
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
         * <p>The third-party conversation model configuration ID.</p>
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
         * <p>The AgentKey of the chatbot.\
         * This parameter is required when NluEngine is set to BEEBOT for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>The conversation agent configuration.</p>
         */
        @NameInMap("AgentProfile")
        public CreateScriptVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <p>The chatbot ID.\
         * This parameter is required when NluEngine is set to BEEBOT for the current scenario.</p>
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
         * <p>The conversation model.\
         * This parameter is required when NluEngine is set to PROMPTS for the current scenario.</p>
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
         * <p>The conversation model invocation method.</p>
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
         * <p>The third-party voice configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
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
         * <p>The commonly mispronounced word.</p>
         * 
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The homophone replacement word.</p>
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
         * <p>The pitch rate.\
         * Valid values: -500 to 500.\
         * Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <p>The TTS pronunciation correction list.</p>
         */
        @NameInMap("PronRules")
        public java.util.List<CreateScriptVersionRequestSynthesizerConfigPronRules> pronRules;

        /**
         * <p>The speech rate.\
         * Valid values: -500 to 500.\
         * Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The voice speaker.</p>
         * 
         * <strong>example:</strong>
         * <p>longanyang</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume.\
         * Valid values: 0 to 100.\
         * Default value: 50.</p>
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
        @NameInMap("Pattern")
        public String pattern;

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
         * <p>The third-party voice configuration ID. This parameter is required when you use a third-party ASR service such as Doubao or iFLYTEK.</p>
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
        @NameInMap("CorrectionRules")
        public java.util.List<CreateScriptVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <p>The custom language model ID for ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe4</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <p>The silence detection threshold. When the silence interval between speech segments exceeds x milliseconds, sentence segmentation is triggered (Voice Activity Detection, or VAD).</p>
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
         * <p>The noise threshold. Valid values: -100 to 100.</p>
         * <p>A value closer to -100 increases the probability that noise is classified as speech.</p>
         * <p>A value closer to +100 increases the probability that speech is classified as noise.</p>
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
