// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateScriptVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InteractionConfig")
    public CreateScriptVersionRequestInteractionConfig interactionConfig;

    @NameInMap("LabelConfig")
    public java.util.List<CreateScriptVersionRequestLabelConfig> labelConfig;

    /**
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("ScriptProfile")
    public CreateScriptVersionRequestScriptProfile scriptProfile;

    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    @NameInMap("SynthesizerConfig")
    public CreateScriptVersionRequestSynthesizerConfig synthesizerConfig;

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
         * <strong>example:</strong>
         * <p>感谢您的接听，祝您生活愉快，再见!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
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
         * <strong>example:</strong>
         * <p>office-ambience</p>
         */
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        @NameInMap("EndConversationConfig")
        public CreateScriptVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

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
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        @NameInMap("Description")
        public String description;

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
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
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
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentProfile")
        public CreateScriptVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("FunctionMeta")
        public CreateScriptVersionRequestScriptProfileFunctionMeta functionMeta;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NluAccessProfile")
        public CreateScriptVersionRequestScriptProfileNluAccessProfile nluAccessProfile;

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
        @NameInMap("Pattern")
        public String pattern;

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
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public CreateScriptVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

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
        public java.util.List<CreateScriptVersionRequestSynthesizerConfigPronRules> pronRules;

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

    public static class CreateScriptVersionRequestTranscriberConfigNlsAccessProfile extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe4</p>
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
        public CreateScriptVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

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

        public static CreateScriptVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScriptVersionRequestTranscriberConfig self = new CreateScriptVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
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
