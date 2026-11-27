// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartAgentRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aoe****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to join. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The configuration for the agent to join a Real-Time Communication (RTC) channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RtcConfig")
    public StartAgentRequestRtcConfig rtcConfig;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The configuration for AI voice chat.</p>
     */
    @NameInMap("VoiceChatConfig")
    public StartAgentRequestVoiceChatConfig voiceChatConfig;

    public static StartAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAgentRequest self = new StartAgentRequest();
        return TeaModel.build(map, self);
    }

    public StartAgentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartAgentRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartAgentRequest setRtcConfig(StartAgentRequestRtcConfig rtcConfig) {
        this.rtcConfig = rtcConfig;
        return this;
    }
    public StartAgentRequestRtcConfig getRtcConfig() {
        return this.rtcConfig;
    }

    public StartAgentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartAgentRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartAgentRequest setVoiceChatConfig(StartAgentRequestVoiceChatConfig voiceChatConfig) {
        this.voiceChatConfig = voiceChatConfig;
        return this;
    }
    public StartAgentRequestVoiceChatConfig getVoiceChatConfig() {
        return this.voiceChatConfig;
    }

    public static class StartAgentRequestRtcConfig extends TeaModel {
        /**
         * <p>The list of user IDs subscribed by the agent. Currently, only one user ID is supported.</p>
         */
        @NameInMap("TargetUserIds")
        public java.util.List<String> targetUserIds;

        /**
         * <p>The user ID of the agent in the RTC channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>423341</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The maximum duration threshold for user inactivity, in seconds.
         * When the duration of any of the following states reaches this threshold, the agent automatically stops and exits the channel:</p>
         * <ol>
         * <li>All users in the targetUserIds list have left the channel.</li>
         * <li>The users in the targetUserIds list have not joined the channel.</li>
         * </ol>
         * <p>Default value: 30.
         * Valid values: 5 to 180.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserInactivityTimeout")
        public Integer userInactivityTimeout;

        public static StartAgentRequestRtcConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestRtcConfig self = new StartAgentRequestRtcConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestRtcConfig setTargetUserIds(java.util.List<String> targetUserIds) {
            this.targetUserIds = targetUserIds;
            return this;
        }
        public java.util.List<String> getTargetUserIds() {
            return this.targetUserIds;
        }

        public StartAgentRequestRtcConfig setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartAgentRequestRtcConfig setUserInactivityTimeout(Integer userInactivityTimeout) {
            this.userInactivityTimeout = userInactivityTimeout;
            return this;
        }
        public Integer getUserInactivityTimeout() {
            return this.userInactivityTimeout;
        }

    }

    public static class StartAgentRequestVoiceChatConfigASRConfigVadConfig extends TeaModel {
        /**
         * <p>The minimum duration of continuous human voice signals required to avoid false interruptions, in milliseconds.
         * Valid values: 0 to 3000.
         * Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("InterruptSpeechDuration")
        public Integer interruptSpeechDuration;

        public static StartAgentRequestVoiceChatConfigASRConfigVadConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigASRConfigVadConfig self = new StartAgentRequestVoiceChatConfigASRConfigVadConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigASRConfigVadConfig setInterruptSpeechDuration(Integer interruptSpeechDuration) {
            this.interruptSpeechDuration = interruptSpeechDuration;
            return this;
        }
        public Integer getInterruptSpeechDuration() {
            return this.interruptSpeechDuration;
        }

    }

    public static class StartAgentRequestVoiceChatConfigASRConfig extends TeaModel {
        /**
         * <p>If this parameter is not specified, the model automatically identifies the language.
         * Currently supported language codes:</p>
         * <ul>
         * <li>zh: Chinese, including Mandarin and dialects such as Shanghainese, Wu, Minnan, Northeastern, Gansu, Guizhou, Henan, Hubei, Hunan, Jiangxi, Ningxia, Shanxi, Shaanxi, Shandong, Sichuan, Tianjin, Yunnan, and Cantonese.</li>
         * <li>en: English.</li>
         * <li>ja: Japanese.</li>
         * <li>yue: Cantonese.</li>
         * <li>ko: Korean.</li>
         * </ul>
         */
        @NameInMap("LanguageHints")
        public java.util.List<String> languageHints;

        /**
         * <p>The voice segmentation detection threshold. Default value: 800. Unit: milliseconds. Recommended range: 200 to 6000.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("MaxSentenceSilence")
        public Integer maxSentenceSilence;

        /**
         * <p>Specifies whether semantic or voice segmentation is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SemanticPunctuationEnabled")
        public Boolean semanticPunctuationEnabled;

        /**
         * <p>No configuration is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The Voice Activity Detection (VAD) configuration.</p>
         */
        @NameInMap("VadConfig")
        public StartAgentRequestVoiceChatConfigASRConfigVadConfig vadConfig;

        /**
         * <p>The ID of the supported hot word.</p>
         * 
         * <strong>example:</strong>
         * <p>vocab-xxx-24ee19fa8cfb4d52902170a0xxxxxxxx</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static StartAgentRequestVoiceChatConfigASRConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigASRConfig self = new StartAgentRequestVoiceChatConfigASRConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigASRConfig setLanguageHints(java.util.List<String> languageHints) {
            this.languageHints = languageHints;
            return this;
        }
        public java.util.List<String> getLanguageHints() {
            return this.languageHints;
        }

        public StartAgentRequestVoiceChatConfigASRConfig setMaxSentenceSilence(Integer maxSentenceSilence) {
            this.maxSentenceSilence = maxSentenceSilence;
            return this;
        }
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        public StartAgentRequestVoiceChatConfigASRConfig setSemanticPunctuationEnabled(Boolean semanticPunctuationEnabled) {
            this.semanticPunctuationEnabled = semanticPunctuationEnabled;
            return this;
        }
        public Boolean getSemanticPunctuationEnabled() {
            return this.semanticPunctuationEnabled;
        }

        public StartAgentRequestVoiceChatConfigASRConfig setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public StartAgentRequestVoiceChatConfigASRConfig setVadConfig(StartAgentRequestVoiceChatConfigASRConfigVadConfig vadConfig) {
            this.vadConfig = vadConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigASRConfigVadConfig getVadConfig() {
            return this.vadConfig;
        }

        public StartAgentRequestVoiceChatConfigASRConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class StartAgentRequestVoiceChatConfigAgentSilenceConfig extends TeaModel {
        /**
         * <p>The timeout period for silence reminders, in seconds.
         * This reminder can be triggered multiple times. If the agent remains silent after a silence reminder timeout, the reminder is triggered again upon the next timeout.
         * Valid values: 5 to 600.
         * Default value: 0. A value of 0 indicates that no reminder is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlertTimeout")
        public Integer alertTimeout;

        /**
         * <p>The content of the silence prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The switch.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The script strategy for silence reminders. Valid values:</p>
         * <ul>
         * <li>1: Broadcast the prompt message specified by Content to the user by voice.</li>
         * <li>2: Send the prompt message specified by Content and the conversation history to the LLM, and broadcast the generated reply by voice.
         * Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The silence timeout period for triggering the agent silence timeout webhook, in seconds.
         * This webhook can be triggered multiple times. If the agent remains silent after a webhook silence timeout, the webhook is triggered again upon the next timeout.
         * Valid values: 10 to 600.
         * Default value: 0. A value of 0 indicates that the webhook is not triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebhookTriggerTimeout")
        public Integer webhookTriggerTimeout;

        public static StartAgentRequestVoiceChatConfigAgentSilenceConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigAgentSilenceConfig self = new StartAgentRequestVoiceChatConfigAgentSilenceConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigAgentSilenceConfig setAlertTimeout(Integer alertTimeout) {
            this.alertTimeout = alertTimeout;
            return this;
        }
        public Integer getAlertTimeout() {
            return this.alertTimeout;
        }

        public StartAgentRequestVoiceChatConfigAgentSilenceConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public StartAgentRequestVoiceChatConfigAgentSilenceConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public StartAgentRequestVoiceChatConfigAgentSilenceConfig setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public StartAgentRequestVoiceChatConfigAgentSilenceConfig setWebhookTriggerTimeout(Integer webhookTriggerTimeout) {
            this.webhookTriggerTimeout = webhookTriggerTimeout;
            return this;
        }
        public Integer getWebhookTriggerTimeout() {
            return this.webhookTriggerTimeout;
        }

    }

    public static class StartAgentRequestVoiceChatConfigAmbientSoundConfig extends TeaModel {
        /**
         * <p>The ambient sound ID. Built-in and download modes are planned. Currently, only the built-in mode is supported.</p>
         * <ul>
         * <li>If this parameter is not specified or is left empty, ambient sound is disabled.</li>
         * <li>Built-in mode: The agent provides the following default ambient sounds: white_noise (white noise) and office (office environment).</li>
         * <li>Download mode: You can specify a custom soundId in the console (which must be different from built-in IDs) and provide a URL. The agent will download and bind the sound internally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white_noise</p>
         */
        @NameInMap("SoundId")
        public String soundId;

        /**
         * <p>The volume of the ambient sound.
         * Default value: 50 (original volume).
         * Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static StartAgentRequestVoiceChatConfigAmbientSoundConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigAmbientSoundConfig self = new StartAgentRequestVoiceChatConfigAmbientSoundConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigAmbientSoundConfig setSoundId(String soundId) {
            this.soundId = soundId;
            return this;
        }
        public String getSoundId() {
            return this.soundId;
        }

        public StartAgentRequestVoiceChatConfigAmbientSoundConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class StartAgentRequestVoiceChatConfigBackChannelConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable backchannel responses after the user finishes speaking. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserTurnEnd")
        public Boolean userTurnEnd;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static StartAgentRequestVoiceChatConfigBackChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigBackChannelConfig self = new StartAgentRequestVoiceChatConfigBackChannelConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigBackChannelConfig setUserTurnEnd(Boolean userTurnEnd) {
            this.userTurnEnd = userTurnEnd;
            return this;
        }
        public Boolean getUserTurnEnd() {
            return this.userTurnEnd;
        }

        public StartAgentRequestVoiceChatConfigBackChannelConfig setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class StartAgentRequestVoiceChatConfigInterruptConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable semantic interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SemanticsInterrupt")
        public Boolean semanticsInterrupt;

        public static StartAgentRequestVoiceChatConfigInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigInterruptConfig self = new StartAgentRequestVoiceChatConfigInterruptConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigInterruptConfig setSemanticsInterrupt(Boolean semanticsInterrupt) {
            this.semanticsInterrupt = semanticsInterrupt;
            return this;
        }
        public Boolean getSemanticsInterrupt() {
            return this.semanticsInterrupt;
        }

    }

    public static class StartAgentRequestVoiceChatConfigLLMConfig extends TeaModel {
        /**
         * <p>The API key of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The agent application ID. You must specify either Model or AppId. If both are specified, AppId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>e****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The custom parameters.</p>
         */
        @NameInMap("BizParams")
        public Object bizParams;

        /**
         * <p>The number of historical conversation turns provided to the LLM.
         * Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HistoryDepth")
        public Integer historyDepth;

        /**
         * <p>The maximum number of tokens for the output text.
         * Default value: 8192.
         * The maximum value for DeepSeek and Qwen models is 8192.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxToken")
        public Integer maxToken;

        /**
         * <p>The model name.
         * Supported models under the aliyun provider:
         * [&quot;qwen-plus&quot;, &quot;deepseek-r1&quot;, &quot;qwen-omni-turbo&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The custom user parameters in key-value pairs. This parameter is deprecated. Use the BizParams parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;verification_code&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The prompt used to instruct the model on the role or behavior to adopt.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The sampling temperature used to control the randomness and creativity of the generated text. A higher value indicates higher randomness.
         * Default value: 0.7.
         * Valid values: 0 to 2, excluding 2.
         * Note: This parameter does not take effect for deepseek-r1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        @NameInMap("ToolExecutionConfig")
        public Object toolExecutionConfig;

        @NameInMap("Tools")
        public java.util.List<?> tools;

        /**
         * <p>The sampling range used to control the diversity of output tokens. The model samples from tokens whose cumulative probability exceeds this value to ensure the sampling range is not too broad. A higher value indicates a richer variety of output tokens.
         * Valid values: 0 to 1, excluding 0.
         * Default value: 0.8.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("TopP")
        public Double topP;

        /**
         * <p>The endpoint URL for integrating a third-party LLM.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The name of the service provider when a cloud service provider is integrated. Examples: aliyun for Model Studio, thirdparty.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static StartAgentRequestVoiceChatConfigLLMConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigLLMConfig self = new StartAgentRequestVoiceChatConfigLLMConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setBizParams(Object bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public Object getBizParams() {
            return this.bizParams;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setHistoryDepth(Integer historyDepth) {
            this.historyDepth = historyDepth;
            return this;
        }
        public Integer getHistoryDepth() {
            return this.historyDepth;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setMaxToken(Integer maxToken) {
            this.maxToken = maxToken;
            return this;
        }
        public Integer getMaxToken() {
            return this.maxToken;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setToolExecutionConfig(Object toolExecutionConfig) {
            this.toolExecutionConfig = toolExecutionConfig;
            return this;
        }
        public Object getToolExecutionConfig() {
            return this.toolExecutionConfig;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setTools(java.util.List<?> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<?> getTools() {
            return this.tools;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartAgentRequestVoiceChatConfigLLMConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class StartAgentRequestVoiceChatConfigTTSConfig extends TeaModel {
        /**
         * <p>The API key of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The configuration to filter out characters within specified brackets from text-to-speech conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2]</p>
         */
        @NameInMap("FilterBrackets")
        public java.util.List<Integer> filterBrackets;

        /**
         * <p>The model name. Example: cosyvoice-v1.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v1</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The pitch.
         * Valid values: 0.5 to 2.0.
         * Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pitch")
        public Double pitch;

        /**
         * <p>The speech rate.
         * Valid values: 0.5 to 2.0.
         * Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rate")
        public Double rate;

        /**
         * <p>The service provider. Example: aliyun for Model Studio.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The voice. If you select the Alibaba Cloud cosyvoice-v1 model, the default voice is longxiaoxia.
         * Available voices:
         * longwan, longcheng, longhua, longxiaochun, longxiaoxia, longxiaocheng, longxiaobai, longlaotie, longshu, longshuo, longjing, longmiao, longyue, longyuan, longfei, longjielidou, longtong, longxiang, loongstella, and loongbella.</p>
         * 
         * <strong>example:</strong>
         * <p>longxiaoxia</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume.
         * Valid values: 0 to 100.
         * Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static StartAgentRequestVoiceChatConfigTTSConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfigTTSConfig self = new StartAgentRequestVoiceChatConfigTTSConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setFilterBrackets(java.util.List<Integer> filterBrackets) {
            this.filterBrackets = filterBrackets;
            return this;
        }
        public java.util.List<Integer> getFilterBrackets() {
            return this.filterBrackets;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setPitch(Double pitch) {
            this.pitch = pitch;
            return this;
        }
        public Double getPitch() {
            return this.pitch;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public StartAgentRequestVoiceChatConfigTTSConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class StartAgentRequestVoiceChatConfig extends TeaModel {
        /**
         * <p>The Automatic Speech Recognition (ASR) configuration.</p>
         */
        @NameInMap("ASRConfig")
        public StartAgentRequestVoiceChatConfigASRConfig ASRConfig;

        /**
         * <p>The configuration for agent behavior during silence timeout. When a user joins the channel but does not interact effectively with the agent (the user does not speak), the agent is in a silent state. You can configure the agent to broadcast a voice messaging reminder or send a webhook notification during this silent state.</p>
         */
        @NameInMap("AgentSilenceConfig")
        public StartAgentRequestVoiceChatConfigAgentSilenceConfig agentSilenceConfig;

        /**
         * <p>The ambient sound settings.</p>
         */
        @NameInMap("AmbientSoundConfig")
        public StartAgentRequestVoiceChatConfigAmbientSoundConfig ambientSoundConfig;

        /**
         * <p>The backchannel settings.</p>
         */
        @NameInMap("BackChannelConfig")
        public StartAgentRequestVoiceChatConfigBackChannelConfig backChannelConfig;

        /**
         * <p>The chat mode. Valid values:</p>
         * <ul>
         * <li>1: natural conversation mode. This is the default value.</li>
         * <li>2: walkie-talkie mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatMode")
        public Integer chatMode;

        /**
         * <p>Specifies whether to enable visual understanding. If enabled, the large language model (LLM) must support multimodal data.</p>
         */
        @NameInMap("EnableVideoUnderstanding")
        public Boolean enableVideoUnderstanding;

        /**
         * <p>The greeting message.</p>
         * 
         * <strong>example:</strong>
         * <p>Good morning, my friend</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>The interrupt settings.</p>
         */
        @NameInMap("InterruptConfig")
        public StartAgentRequestVoiceChatConfigInterruptConfig interruptConfig;

        /**
         * <p>The interrupt mode. Valid values:</p>
         * <ul>
         * <li>1: voice interruption supported. This is the default value.</li>
         * <li>2: voice interruption disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InterruptMode")
        public Integer interruptMode;

        /**
         * <p>The large language model (LLM) configuration.</p>
         */
        @NameInMap("LLMConfig")
        public StartAgentRequestVoiceChatConfigLLMConfig LLMConfig;

        /**
         * <p>The text-to-speech (TTS) configuration.</p>
         */
        @NameInMap("TTSConfig")
        public StartAgentRequestVoiceChatConfigTTSConfig TTSConfig;

        /**
         * <p>After visual understanding is enabled, you can specify the video stream that the agent prioritizes for understanding. The agent can understand only one video stream when both the camera stream and the screen sharing stream are pushed simultaneously.</p>
         * <ol>
         * <li>The agent prioritizes the camera stream.</li>
         * <li>The agent prioritizes the screen sharing stream.</li>
         * </ol>
         * <p>By default, the camera stream is prioritized.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("preferVideo")
        public Integer preferVideo;

        public static StartAgentRequestVoiceChatConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAgentRequestVoiceChatConfig self = new StartAgentRequestVoiceChatConfig();
            return TeaModel.build(map, self);
        }

        public StartAgentRequestVoiceChatConfig setASRConfig(StartAgentRequestVoiceChatConfigASRConfig ASRConfig) {
            this.ASRConfig = ASRConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigASRConfig getASRConfig() {
            return this.ASRConfig;
        }

        public StartAgentRequestVoiceChatConfig setAgentSilenceConfig(StartAgentRequestVoiceChatConfigAgentSilenceConfig agentSilenceConfig) {
            this.agentSilenceConfig = agentSilenceConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigAgentSilenceConfig getAgentSilenceConfig() {
            return this.agentSilenceConfig;
        }

        public StartAgentRequestVoiceChatConfig setAmbientSoundConfig(StartAgentRequestVoiceChatConfigAmbientSoundConfig ambientSoundConfig) {
            this.ambientSoundConfig = ambientSoundConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigAmbientSoundConfig getAmbientSoundConfig() {
            return this.ambientSoundConfig;
        }

        public StartAgentRequestVoiceChatConfig setBackChannelConfig(StartAgentRequestVoiceChatConfigBackChannelConfig backChannelConfig) {
            this.backChannelConfig = backChannelConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigBackChannelConfig getBackChannelConfig() {
            return this.backChannelConfig;
        }

        public StartAgentRequestVoiceChatConfig setChatMode(Integer chatMode) {
            this.chatMode = chatMode;
            return this;
        }
        public Integer getChatMode() {
            return this.chatMode;
        }

        public StartAgentRequestVoiceChatConfig setEnableVideoUnderstanding(Boolean enableVideoUnderstanding) {
            this.enableVideoUnderstanding = enableVideoUnderstanding;
            return this;
        }
        public Boolean getEnableVideoUnderstanding() {
            return this.enableVideoUnderstanding;
        }

        public StartAgentRequestVoiceChatConfig setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public StartAgentRequestVoiceChatConfig setInterruptConfig(StartAgentRequestVoiceChatConfigInterruptConfig interruptConfig) {
            this.interruptConfig = interruptConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigInterruptConfig getInterruptConfig() {
            return this.interruptConfig;
        }

        public StartAgentRequestVoiceChatConfig setInterruptMode(Integer interruptMode) {
            this.interruptMode = interruptMode;
            return this;
        }
        public Integer getInterruptMode() {
            return this.interruptMode;
        }

        public StartAgentRequestVoiceChatConfig setLLMConfig(StartAgentRequestVoiceChatConfigLLMConfig LLMConfig) {
            this.LLMConfig = LLMConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigLLMConfig getLLMConfig() {
            return this.LLMConfig;
        }

        public StartAgentRequestVoiceChatConfig setTTSConfig(StartAgentRequestVoiceChatConfigTTSConfig TTSConfig) {
            this.TTSConfig = TTSConfig;
            return this;
        }
        public StartAgentRequestVoiceChatConfigTTSConfig getTTSConfig() {
            return this.TTSConfig;
        }

        public StartAgentRequestVoiceChatConfig setPreferVideo(Integer preferVideo) {
            this.preferVideo = preferVideo;
            return this;
        }
        public Integer getPreferVideo() {
            return this.preferVideo;
        }

    }

}
