// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptResponseBody extends TeaModel {
    /**
     * <p>Internal error code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Scenario object information</p>
     */
    @NameInMap("Data")
    public GetScriptResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of dynamic error parameters</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51E08AA9-8D1F-55F8-84A3-40635E2F0806</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptResponseBody self = new GetScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScriptResponseBody setData(GetScriptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScriptResponseBodyData getData() {
        return this.data;
    }

    public GetScriptResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScriptResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <p>The message to play when hanging up after reaching the maximum number of rounds.</p>
         * 
         * <strong>example:</strong>
         * <p>感谢您的接听，祝您生活愉快，再见!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        /**
         * <p>List of custom interception keywords</p>
         */
        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        /**
         * <p>TurnLimit: Maximum interaction rounds check. IntelligentVoiceAssistant: Voice assistant. InteractiveVoiceResponse: Extension transfer. KeyWords: Custom interception</p>
         * 
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>Hangs up when the number of interaction rounds exceeds x. The range is 0 to 100. A value of 0 indicates that the hang-up feature for exceeding the round limit is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers self = new GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig extends TeaModel {
        /**
         * <p>The hang-up action is executed x seconds after the hang-up message is played. The range is 0 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>List of special case interceptions</p>
         */
        @NameInMap("Triggers")
        public java.util.List<GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> triggers;

        public static GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig self = new GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig setTriggers(java.util.List<GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <p>Hang up after consecutive rounds of silence. This takes effect when NluEngine is set to PROMPTS for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>Silence timeout period in milliseconds. If the user remains silent for longer than the specified value, a silence timeout message is played. The range is 2000 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig self = new GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionInteractionConfig extends TeaModel {
        /**
         * <p>Background music ID</p>
         * 
         * <strong>example:</strong>
         * <p>office-ambience</p>
         */
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        /**
         * <p>Hang-up configuration</p>
         */
        @NameInMap("EndConversationConfig")
        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <p>The delay before playing audio after the call is connected, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        /**
         * <p>Silence detection configuration</p>
         */
        @NameInMap("SilenceDetectionConfig")
        public GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetScriptResponseBodyDataDraftVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionInteractionConfig self = new GetScriptResponseBodyDataDraftVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfig setEndConversationConfig(GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public GetScriptResponseBodyDataDraftVersionInteractionConfig setSilenceDetectionConfig(GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionLabelConfig extends TeaModel {
        /**
         * <p>List of candidate values for the label</p>
         */
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <p>Label description</p>
         * 
         * <strong>example:</strong>
         * <p>用户是否同意于还款截止日期前还款</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Label name</p>
         * 
         * <strong>example:</strong>
         * <p>是否同意还款</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetScriptResponseBodyDataDraftVersionLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionLabelConfig self = new GetScriptResponseBodyDataDraftVersionLabelConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public GetScriptResponseBodyDataDraftVersionLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScriptResponseBodyDataDraftVersionLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <p>Prompt JSON</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;prompts\&quot;:\&quot;我是一个聊天机器人。\&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <p>Scenario template ID</p>
         * 
         * <strong>example:</strong>
         * <p>CCC_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile self = new GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta extends TeaModel {
        /**
         * <p>Function service ID</p>
         * 
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        /**
         * <p>Function service name</p>
         * 
         * <strong>example:</strong>
         * <p>my_funciton</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>Function trigger name</p>
         * 
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <p>Function trigger URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <p>Region where the function service is located</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta self = new GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile extends TeaModel {
        /**
         * <p>Third-party dialogue model configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile self = new GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionScriptProfile extends TeaModel {
        /**
         * <p>Chatbot AgentKey</p>
         * 
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>Dialogue agent configuration</p>
         */
        @NameInMap("AgentProfile")
        public GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile;

        /**
         * <p>Chatbot ID</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>Function Compute configuration</p>
         */
        @NameInMap("FunctionMeta")
        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta functionMeta;

        /**
         * <p>Dialogue model</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Associated configuration</p>
         */
        @NameInMap("NluAccessProfile")
        public GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile nluAccessProfile;

        /**
         * <p>Dialogue model call method</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>NLU engine</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>Indicates whether the model is an Omni model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OmniModel")
        public Boolean omniModel;

        public static GetScriptResponseBodyDataDraftVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionScriptProfile self = new GetScriptResponseBodyDataDraftVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setAgentProfile(GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setFunctionMeta(GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setNluAccessProfile(GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetScriptResponseBodyDataDraftVersionScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>Third-party voice configuration</p>
         * 
         * <strong>example:</strong>
         * <p>0c4f978a-73bb-4841-bd84-75c0398edd4f</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile self = new GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules extends TeaModel {
        /**
         * <p>Word prone to errors</p>
         * 
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>Replacement word</p>
         * 
         * <strong>example:</strong>
         * <p>环钱</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules self = new GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionSynthesizerConfig extends TeaModel {
        /**
         * <p>TTS model</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Access account configuration</p>
         */
        @NameInMap("NlsAccessProfile")
        public GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>TTS call method</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>TTS engine</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The speech pitch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <p>List of TTS intervention dictionaries</p>
         */
        @NameInMap("PronRules")
        public java.util.List<GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules> pronRules;

        /**
         * <p>Speech rate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>Voice</p>
         * 
         * <strong>example:</strong>
         * <p>longanyang</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>Volume</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetScriptResponseBodyDataDraftVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionSynthesizerConfig self = new GetScriptResponseBodyDataDraftVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setNlsAccessProfile(GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setPronRules(java.util.List<GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataDraftVersionSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules self = new GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>Third-party voice configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>0c4f978a-73bb-4841-bd84-75c0398edd4f</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile self = new GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersionTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <p>Self-learning language model ID (not currently supported)</p>
         * 
         * <strong>example:</strong>
         * <p>0c4f978a-73bb-4841-bd84-75c0398edd6f</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <p>Voice Activity Detection (VAD) sentence segmentation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        /**
         * <p>ASR model</p>
         * 
         * <strong>example:</strong>
         * <p>Paraformer</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Access account configuration</p>
         */
        @NameInMap("NlsAccessProfile")
        public GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>ASR call method</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>ASR engine</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>Noise threshold</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechNoiseThreshold")
        public String speechNoiseThreshold;

        /**
         * <p>Hotword ID</p>
         * 
         * <strong>example:</strong>
         * <p>0c4f978a-73bb-4841-bd84-75c0398edd5f</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static GetScriptResponseBodyDataDraftVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersionTranscriberConfig self = new GetScriptResponseBodyDataDraftVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setCorrectionRules(java.util.List<GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setNlsAccessProfile(GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setSpeechNoiseThreshold(String speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public String getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public GetScriptResponseBodyDataDraftVersionTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class GetScriptResponseBodyDataDraftVersion extends TeaModel {
        /**
         * <p>Interaction configuration</p>
         */
        @NameInMap("InteractionConfig")
        public GetScriptResponseBodyDataDraftVersionInteractionConfig interactionConfig;

        /**
         * <p>List of label objects</p>
         */
        @NameInMap("LabelConfig")
        public java.util.List<GetScriptResponseBodyDataDraftVersionLabelConfig> labelConfig;

        /**
         * <p>Dialogue capability configuration</p>
         */
        @NameInMap("ScriptProfile")
        public GetScriptResponseBodyDataDraftVersionScriptProfile scriptProfile;

        /**
         * <p>TTS configuration</p>
         */
        @NameInMap("SynthesizerConfig")
        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig synthesizerConfig;

        /**
         * <p>ASR configuration</p>
         */
        @NameInMap("TranscriberConfig")
        public GetScriptResponseBodyDataDraftVersionTranscriberConfig transcriberConfig;

        /**
         * <p>Version ID</p>
         * 
         * <strong>example:</strong>
         * <p>0c4f978a-73bb-4841-bd84-75c0398edd4e</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetScriptResponseBodyDataDraftVersion build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataDraftVersion self = new GetScriptResponseBodyDataDraftVersion();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataDraftVersion setInteractionConfig(GetScriptResponseBodyDataDraftVersionInteractionConfig interactionConfig) {
            this.interactionConfig = interactionConfig;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionInteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        public GetScriptResponseBodyDataDraftVersion setLabelConfig(java.util.List<GetScriptResponseBodyDataDraftVersionLabelConfig> labelConfig) {
            this.labelConfig = labelConfig;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataDraftVersionLabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        public GetScriptResponseBodyDataDraftVersion setScriptProfile(GetScriptResponseBodyDataDraftVersionScriptProfile scriptProfile) {
            this.scriptProfile = scriptProfile;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        public GetScriptResponseBodyDataDraftVersion setSynthesizerConfig(GetScriptResponseBodyDataDraftVersionSynthesizerConfig synthesizerConfig) {
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionSynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        public GetScriptResponseBodyDataDraftVersion setTranscriberConfig(GetScriptResponseBodyDataDraftVersionTranscriberConfig transcriberConfig) {
            this.transcriberConfig = transcriberConfig;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersionTranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        public GetScriptResponseBodyDataDraftVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <ul>
         * <li>The message to play when hanging up after reaching the maximum number of rounds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>感谢您的接听，祝您生活愉快，再见!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        /**
         * <ul>
         * <li>List of custom interception keywords</li>
         * </ul>
         */
        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        /**
         * <ul>
         * <li><p><strong>TurnLimit</strong>: Maximum interaction rounds check.</p>
         * </li>
         * <li><p><strong>IntelligentVoiceAssistant</strong>: Voice assistant.</p>
         * </li>
         * <li><p><strong>InteractiveVoiceResponse</strong>: Extension transfer.</p>
         * </li>
         * <li><p><strong>KeyWords</strong>: Custom interception.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TurnLimit</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <ul>
         * <li><p>Hangs up when the number of interaction rounds exceeds x.</p>
         * </li>
         * <li><p>The range is 0 to 100.</p>
         * </li>
         * <li><p>A value of 0 indicates that the hang-up feature for exceeding the round limit is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers self = new GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig extends TeaModel {
        /**
         * <p>The hang-up action is executed x seconds after the hang-up message is played. The range is 0 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Integer delay;

        /**
         * <p>Special case interception</p>
         */
        @NameInMap("Triggers")
        public java.util.List<GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> triggers;

        public static GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig self = new GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig setTriggers(java.util.List<GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <p>Hang up after consecutive rounds of silence.<br>
         * This takes effect when NluEngine is set to PROMPTS for the current scenario.<br></p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>Silence timeout period in milliseconds.<br>
         * If the user remains silent for longer than the specified value, a silence timeout message is played.<br>
         * The range is 2000 to 10000.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig self = new GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionInteractionConfig extends TeaModel {
        /**
         * <p>Background music ID</p>
         * 
         * <strong>example:</strong>
         * <p>office-ambience</p>
         */
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        /**
         * <p>Hang-up configuration</p>
         */
        @NameInMap("EndConversationConfig")
        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig endConversationConfig;

        /**
         * <ul>
         * <li><p>The delay before playing audio after the call is connected.</p>
         * </li>
         * <li><p>Unit: milliseconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        /**
         * <p>Silence detection configuration</p>
         */
        @NameInMap("SilenceDetectionConfig")
        public GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetScriptResponseBodyDataPublishedVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionInteractionConfig self = new GetScriptResponseBodyDataPublishedVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfig setEndConversationConfig(GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public GetScriptResponseBodyDataPublishedVersionInteractionConfig setSilenceDetectionConfig(GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionLabelConfig extends TeaModel {
        /**
         * <p>List of candidate values for the label</p>
         */
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        /**
         * <p>Label description</p>
         * 
         * <strong>example:</strong>
         * <p>用户是否同意于还款截止日期前还款</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Label name</p>
         * 
         * <strong>example:</strong>
         * <p>是否同意还款</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetScriptResponseBodyDataPublishedVersionLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionLabelConfig self = new GetScriptResponseBodyDataPublishedVersionLabelConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public GetScriptResponseBodyDataPublishedVersionLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScriptResponseBodyDataPublishedVersionLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <p>Dialogue agent description</p>
         * 
         * <strong>example:</strong>
         * <p>用于测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Dialogue agent name</p>
         * 
         * <strong>example:</strong>
         * <p>test agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>Prompt JSON</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;prompts\&quot;:\&quot;我是一个聊天机器人。\&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <p><strong>Scenario template ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>CCC_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile self = new GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta extends TeaModel {
        /**
         * <p>Function service ID. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        /**
         * <p>Function service name. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>my_function</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>Function trigger name. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <p>Function trigger URL. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <p>Region where the function service is located. This is required when NluEngine is set to FUNCTION for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta self = new GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile extends TeaModel {
        /**
         * <p>Third-party dialogue model configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile self = new GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionScriptProfile extends TeaModel {
        /**
         * <p>Chatbot AgentKey. This is required when NluEngine is set to BEEBOT for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1309723684579735_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>Dialogue agent configuration</p>
         */
        @NameInMap("AgentProfile")
        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile;

        /**
         * <p>Chatbot ID. This is required when NluEngine is set to BEEBOT for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>Function Compute configuration</p>
         */
        @NameInMap("FunctionMeta")
        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta functionMeta;

        /**
         * <p>Dialogue model. This is required when NluEngine is set to PROMPTS for the current scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p><strong>Associated configuration</strong></p>
         */
        @NameInMap("NluAccessProfile")
        public GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile nluAccessProfile;

        /**
         * <p>Dialogue model call method</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>NLU engine</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>Indicates whether the model is an Omni model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OmniModel")
        public Boolean omniModel;

        public static GetScriptResponseBodyDataPublishedVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionScriptProfile self = new GetScriptResponseBodyDataPublishedVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setAgentProfile(GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setFunctionMeta(GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setNluAccessProfile(GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetScriptResponseBodyDataPublishedVersionScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>Third-party voice configuration ID (required when using third-party ASR services such as Doubao or iFLYTEK).</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile self = new GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules extends TeaModel {
        /**
         * <p>Word prone to errors</p>
         * 
         * <strong>example:</strong>
         * <p>还钱</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>Homophone</p>
         * 
         * <strong>example:</strong>
         * <p>环钱</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        public static GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules self = new GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionSynthesizerConfig extends TeaModel {
        /**
         * <p><strong>TTS model</strong></p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Associated configuration</p>
         */
        @NameInMap("NlsAccessProfile")
        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p><strong>TTS call method</strong></p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p><strong>TTS engine</strong></p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>Pitch rate
         * The range is -500 to 500.
         * The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <p>List of TTS intervention entries</p>
         */
        @NameInMap("PronRules")
        public java.util.List<GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules> pronRules;

        /**
         * <p><strong>Speech rate</strong>
         * The range is -500 to 500.
         * The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p><strong>Voice</strong></p>
         * 
         * <strong>example:</strong>
         * <p>longanyang</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>Volume
         * The range is 0 to 100.
         * The default value is 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetScriptResponseBodyDataPublishedVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionSynthesizerConfig self = new GetScriptResponseBodyDataPublishedVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setNlsAccessProfile(GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setPronRules(java.util.List<GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataPublishedVersionSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules self = new GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile extends TeaModel {
        /**
         * <p>Third-party voice configuration ID (required when using third-party ASR services such as Doubao or iFLYTEK).</p>
         * 
         * <strong>example:</strong>
         * <p>c2c9baae-9351-4c49-a8cb-6f24a83a8718</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile self = new GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersionTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> correctionRules;

        /**
         * <p>Custom language model ID for ASR</p>
         * 
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe4</p>
         */
        @NameInMap("CustomizationId")
        public String customizationId;

        /**
         * <p>Silence detection (sentence segmentation is triggered when the speaking interval exceeds x milliseconds, which is Voice Activity Detection (VAD)).</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        /**
         * <p>ASR model</p>
         * 
         * <strong>example:</strong>
         * <p>Paraformer</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p><strong>Associated configuration</strong></p>
         */
        @NameInMap("NlsAccessProfile")
        public GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p><strong>ASR call method</strong></p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p><strong>ASR engine</strong></p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>Noise parameter threshold. The range is -100 to 100. The following describes the values:</p>
         * <p>The closer the value is to -100, the more likely noise is identified as speech.</p>
         * <p>The closer the value is to 100, the more likely speech is identified as noise.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechNoiseThreshold")
        public String speechNoiseThreshold;

        /**
         * <p>Hotword table ID (obtained from the hotword management page).</p>
         * 
         * <strong>example:</strong>
         * <p>cd97223f-42f2-4cd9-95af-e734e2fe1fe3</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static GetScriptResponseBodyDataPublishedVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersionTranscriberConfig self = new GetScriptResponseBodyDataPublishedVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setCorrectionRules(java.util.List<GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setNlsAccessProfile(GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setSpeechNoiseThreshold(String speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public String getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class GetScriptResponseBodyDataPublishedVersion extends TeaModel {
        /**
         * <p>Interaction configuration</p>
         */
        @NameInMap("InteractionConfig")
        public GetScriptResponseBodyDataPublishedVersionInteractionConfig interactionConfig;

        /**
         * <p>Custom tag configuration</p>
         */
        @NameInMap("LabelConfig")
        public java.util.List<GetScriptResponseBodyDataPublishedVersionLabelConfig> labelConfig;

        /**
         * <p>Dialogue capability configuration</p>
         */
        @NameInMap("ScriptProfile")
        public GetScriptResponseBodyDataPublishedVersionScriptProfile scriptProfile;

        /**
         * <p>TTS configuration</p>
         */
        @NameInMap("SynthesizerConfig")
        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig synthesizerConfig;

        /**
         * <p>ASR configuration</p>
         */
        @NameInMap("TranscriberConfig")
        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig transcriberConfig;

        /**
         * <p>Version ID</p>
         * 
         * <strong>example:</strong>
         * <p>8b77ff09-6a90-4784-8560-fdc2b860dc68</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetScriptResponseBodyDataPublishedVersion build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyDataPublishedVersion self = new GetScriptResponseBodyDataPublishedVersion();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyDataPublishedVersion setInteractionConfig(GetScriptResponseBodyDataPublishedVersionInteractionConfig interactionConfig) {
            this.interactionConfig = interactionConfig;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionInteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        public GetScriptResponseBodyDataPublishedVersion setLabelConfig(java.util.List<GetScriptResponseBodyDataPublishedVersionLabelConfig> labelConfig) {
            this.labelConfig = labelConfig;
            return this;
        }
        public java.util.List<GetScriptResponseBodyDataPublishedVersionLabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        public GetScriptResponseBodyDataPublishedVersion setScriptProfile(GetScriptResponseBodyDataPublishedVersionScriptProfile scriptProfile) {
            this.scriptProfile = scriptProfile;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        public GetScriptResponseBodyDataPublishedVersion setSynthesizerConfig(GetScriptResponseBodyDataPublishedVersionSynthesizerConfig synthesizerConfig) {
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionSynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        public GetScriptResponseBodyDataPublishedVersion setTranscriberConfig(GetScriptResponseBodyDataPublishedVersionTranscriberConfig transcriberConfig) {
            this.transcriberConfig = transcriberConfig;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersionTranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        public GetScriptResponseBodyDataPublishedVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetScriptResponseBodyData extends TeaModel {
        /**
         * <p>Concurrency</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1773228988000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test script</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Draft version information</p>
         */
        @NameInMap("DraftVersion")
        public GetScriptResponseBodyDataDraftVersion draftVersion;

        /**
         * <p>Scenario name</p>
         * 
         * <strong>example:</strong>
         * <p>测试场景</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Natural Language Understanding (NLU) engine</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>Published version information</p>
         */
        @NameInMap("PublishedVersion")
        public GetScriptResponseBodyDataPublishedVersion publishedVersion;

        /**
         * <p>Scenario ID</p>
         * 
         * <strong>example:</strong>
         * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>1773228988000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetScriptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScriptResponseBodyData self = new GetScriptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScriptResponseBodyData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetScriptResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetScriptResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScriptResponseBodyData setDraftVersion(GetScriptResponseBodyDataDraftVersion draftVersion) {
            this.draftVersion = draftVersion;
            return this;
        }
        public GetScriptResponseBodyDataDraftVersion getDraftVersion() {
            return this.draftVersion;
        }

        public GetScriptResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScriptResponseBodyData setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetScriptResponseBodyData setPublishedVersion(GetScriptResponseBodyDataPublishedVersion publishedVersion) {
            this.publishedVersion = publishedVersion;
            return this;
        }
        public GetScriptResponseBodyDataPublishedVersion getPublishedVersion() {
            return this.publishedVersion;
        }

        public GetScriptResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public GetScriptResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetScriptResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
