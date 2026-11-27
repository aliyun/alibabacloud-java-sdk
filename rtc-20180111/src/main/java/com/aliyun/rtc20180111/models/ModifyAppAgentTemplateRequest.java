// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateRequest extends TeaModel {
    /**
     * <p>The agent silence configuration.</p>
     */
    @NameInMap("AgentSilenceConfig")
    public ModifyAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig;

    /**
     * <p>The agent ambient environment configuration. If this parameter is not specified, the ambient environment configuration is not used.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public ModifyAppAgentTemplateRequestAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The speech-to-text settings.</p>
     */
    @NameInMap("AsrConfig")
    public ModifyAppAgentTemplateRequestAsrConfig asrConfig;

    /**
     * <p>The agent backchannel configuration.</p>
     */
    @NameInMap("BackChannelConfig")
    public ModifyAppAgentTemplateRequestBackChannelConfig backChannelConfig;

    /**
     * <p>The conversation mode. Valid values:</p>
     * <ul>
     * <li>1: Natural conversation mode (default).</li>
     * <li>2: Walkie-talkie mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    /**
     * <p>If enabled, the LLM must support multimodal data.</p>
     */
    @NameInMap("EnableVideoUnderstanding")
    public Boolean enableVideoUnderstanding;

    /**
     * <p>The greeting message. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Good morning, my friend</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231312312131231</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The agent interruption configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public ModifyAppAgentTemplateRequestInterruptConfig interruptConfig;

    /**
     * <p>The interruption mode. Valid values:</p>
     * <ul>
     * <li>1: Interruption supported (default).</li>
     * <li>2: Interruption disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterruptMode")
    public Integer interruptMode;

    /**
     * <p>The large language model settings.</p>
     */
    @NameInMap("LlmConfig")
    public ModifyAppAgentTemplateRequestLlmConfig llmConfig;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The preferred video stream for the agent to understand after visual understanding is enabled. The agent can understand only one video stream. When both the camera stream and the screen sharing stream are pushed:</p>
     * <p>1 - The agent prioritizes understanding the camera stream.</p>
     * <p>2 - The agent prioritizes understanding the screen sharing stream.</p>
     * <p>By default, the agent prioritizes understanding the camera stream.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PreferVideo")
    public Integer preferVideo;

    /**
     * <p>The text-to-speech settings.</p>
     */
    @NameInMap("TtsConfig")
    public ModifyAppAgentTemplateRequestTtsConfig ttsConfig;

    /**
     * <p>The agent type. Valid values:</p>
     * <ul>
     * <li>1: Voice call (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ModifyAppAgentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentTemplateRequest self = new ModifyAppAgentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentTemplateRequest setAgentSilenceConfig(ModifyAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig) {
        this.agentSilenceConfig = agentSilenceConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestAgentSilenceConfig getAgentSilenceConfig() {
        return this.agentSilenceConfig;
    }

    public ModifyAppAgentTemplateRequest setAmbientSoundConfig(ModifyAppAgentTemplateRequestAmbientSoundConfig ambientSoundConfig) {
        this.ambientSoundConfig = ambientSoundConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestAmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    public ModifyAppAgentTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppAgentTemplateRequest setAsrConfig(ModifyAppAgentTemplateRequestAsrConfig asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestAsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    public ModifyAppAgentTemplateRequest setBackChannelConfig(ModifyAppAgentTemplateRequestBackChannelConfig backChannelConfig) {
        this.backChannelConfig = backChannelConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestBackChannelConfig getBackChannelConfig() {
        return this.backChannelConfig;
    }

    public ModifyAppAgentTemplateRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
    }

    public ModifyAppAgentTemplateRequest setEnableVideoUnderstanding(Boolean enableVideoUnderstanding) {
        this.enableVideoUnderstanding = enableVideoUnderstanding;
        return this;
    }
    public Boolean getEnableVideoUnderstanding() {
        return this.enableVideoUnderstanding;
    }

    public ModifyAppAgentTemplateRequest setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public ModifyAppAgentTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyAppAgentTemplateRequest setInterruptConfig(ModifyAppAgentTemplateRequestInterruptConfig interruptConfig) {
        this.interruptConfig = interruptConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestInterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    public ModifyAppAgentTemplateRequest setInterruptMode(Integer interruptMode) {
        this.interruptMode = interruptMode;
        return this;
    }
    public Integer getInterruptMode() {
        return this.interruptMode;
    }

    public ModifyAppAgentTemplateRequest setLlmConfig(ModifyAppAgentTemplateRequestLlmConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestLlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    public ModifyAppAgentTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAppAgentTemplateRequest setPreferVideo(Integer preferVideo) {
        this.preferVideo = preferVideo;
        return this;
    }
    public Integer getPreferVideo() {
        return this.preferVideo;
    }

    public ModifyAppAgentTemplateRequest setTtsConfig(ModifyAppAgentTemplateRequestTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public ModifyAppAgentTemplateRequestTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public ModifyAppAgentTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class ModifyAppAgentTemplateRequestAgentSilenceConfig extends TeaModel {
        /**
         * <p>The timeout period for silence alerts, in seconds. This alert can be triggered multiple times. If the agent remains silent after the silence alert times out, the alert is triggered again upon the next timeout. Valid values: 5 to 600. Default value: 0. A value of 0 indicates that no alert is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlertTimeout")
        public Integer alertTimeout;

        /**
         * <p>The content of the silence prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, the current request is being processed. Please try again later, okay?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The silence timeout handling strategy. Valid values:</p>
         * <ul>
         * <li>1: Broadcast the prompt message specified by Content to the user via voice.</li>
         * <li>2: Send the prompt message specified by Content and the conversation history to the LLM, and broadcast the reply generated by the model.
         * Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The silence timeout period for triggering the agent silence timeout webhook, in seconds. This webhook can be triggered multiple times. If the agent remains silent after the webhook silence timeout, the webhook is triggered again upon the next timeout. Valid values: 10 to 600. Default value: 0. A value of 0 indicates that the webhook is not triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("WebhookTriggerTimeout")
        public Integer webhookTriggerTimeout;

        public static ModifyAppAgentTemplateRequestAgentSilenceConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestAgentSilenceConfig self = new ModifyAppAgentTemplateRequestAgentSilenceConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestAgentSilenceConfig setAlertTimeout(Integer alertTimeout) {
            this.alertTimeout = alertTimeout;
            return this;
        }
        public Integer getAlertTimeout() {
            return this.alertTimeout;
        }

        public ModifyAppAgentTemplateRequestAgentSilenceConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModifyAppAgentTemplateRequestAgentSilenceConfig setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ModifyAppAgentTemplateRequestAgentSilenceConfig setWebhookTriggerTimeout(Integer webhookTriggerTimeout) {
            this.webhookTriggerTimeout = webhookTriggerTimeout;
            return this;
        }
        public Integer getWebhookTriggerTimeout() {
            return this.webhookTriggerTimeout;
        }

    }

    public static class ModifyAppAgentTemplateRequestAmbientSoundConfig extends TeaModel {
        /**
         * <p>The default ambient sounds provided by the agent:
         *     - white_noise 
         *     - office</p>
         * 
         * <strong>example:</strong>
         * <p>white_noise</p>
         */
        @NameInMap("SoundId")
        public String soundId;

        /**
         * <p>The volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static ModifyAppAgentTemplateRequestAmbientSoundConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestAmbientSoundConfig self = new ModifyAppAgentTemplateRequestAmbientSoundConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestAmbientSoundConfig setSoundId(String soundId) {
            this.soundId = soundId;
            return this;
        }
        public String getSoundId() {
            return this.soundId;
        }

        public ModifyAppAgentTemplateRequestAmbientSoundConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class ModifyAppAgentTemplateRequestAsrConfigVadConfig extends TeaModel {
        /**
         * <p>The voice duration threshold. Unit: milliseconds. Valid values: [0, 3000]. This parameter specifies the minimum duration of continuous voice signal detection to avoid false interruptions. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("InterruptSpeechDuration")
        public Integer interruptSpeechDuration;

        public static ModifyAppAgentTemplateRequestAsrConfigVadConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestAsrConfigVadConfig self = new ModifyAppAgentTemplateRequestAsrConfigVadConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestAsrConfigVadConfig setInterruptSpeechDuration(Integer interruptSpeechDuration) {
            this.interruptSpeechDuration = interruptSpeechDuration;
            return this;
        }
        public Integer getInterruptSpeechDuration() {
            return this.interruptSpeechDuration;
        }

    }

    public static class ModifyAppAgentTemplateRequestAsrConfigWordWeights extends TeaModel {
        /**
         * <p>The language code. This parameter is optional. The large language model automatically identifies the language. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The hot word weight. The value must be an integer in the range of [1, 5]. Common value: 4. If the effect is not obvious, you can increase the weight. However, a large weight may cause negative effects and lead to inaccurate recognition of other words.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>The hot word text. Each word can be up to 10 Chinese characters or English words in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple</p>
         */
        @NameInMap("Word")
        public String word;

        public static ModifyAppAgentTemplateRequestAsrConfigWordWeights build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestAsrConfigWordWeights self = new ModifyAppAgentTemplateRequestAsrConfigWordWeights();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestAsrConfigWordWeights setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ModifyAppAgentTemplateRequestAsrConfigWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ModifyAppAgentTemplateRequestAsrConfigWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class ModifyAppAgentTemplateRequestAsrConfig extends TeaModel {
        /**
         * <p>The speech segmentation detection threshold. The default value is 500 ms. Valid values: 200 to 6000. If VadConfig is set, we recommend that you set this value to be greater than VadConfig.InterruptSpeechDuration and less than 1500 ms.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxSentenceSilence")
        public Integer maxSentenceSilence;

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STT</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The voice activity detection (VAD) configuration.</p>
         */
        @NameInMap("VadConfig")
        public ModifyAppAgentTemplateRequestAsrConfigVadConfig vadConfig;

        /**
         * <p>The hot word ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bb1776b1745123332074d1b6b</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        /**
         * <p>The hot word weights. Each vocabulary can contain up to 500 hot words, and each hot word can be up to 10 Chinese characters in length. Hot words must be UTF-8 encoded and cannot contain punctuation marks or special characters. Otherwise, the hot words do not take effect.</p>
         */
        @NameInMap("WordWeights")
        public java.util.List<ModifyAppAgentTemplateRequestAsrConfigWordWeights> wordWeights;

        public static ModifyAppAgentTemplateRequestAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestAsrConfig self = new ModifyAppAgentTemplateRequestAsrConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestAsrConfig setMaxSentenceSilence(Integer maxSentenceSilence) {
            this.maxSentenceSilence = maxSentenceSilence;
            return this;
        }
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        public ModifyAppAgentTemplateRequestAsrConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppAgentTemplateRequestAsrConfig setVadConfig(ModifyAppAgentTemplateRequestAsrConfigVadConfig vadConfig) {
            this.vadConfig = vadConfig;
            return this;
        }
        public ModifyAppAgentTemplateRequestAsrConfigVadConfig getVadConfig() {
            return this.vadConfig;
        }

        public ModifyAppAgentTemplateRequestAsrConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public ModifyAppAgentTemplateRequestAsrConfig setWordWeights(java.util.List<ModifyAppAgentTemplateRequestAsrConfigWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<ModifyAppAgentTemplateRequestAsrConfigWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

    public static class ModifyAppAgentTemplateRequestBackChannelConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the backchannel.</p>
         */
        @NameInMap("UserTurnEnd")
        public Boolean userTurnEnd;

        public static ModifyAppAgentTemplateRequestBackChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestBackChannelConfig self = new ModifyAppAgentTemplateRequestBackChannelConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestBackChannelConfig setUserTurnEnd(Boolean userTurnEnd) {
            this.userTurnEnd = userTurnEnd;
            return this;
        }
        public Boolean getUserTurnEnd() {
            return this.userTurnEnd;
        }

    }

    public static class ModifyAppAgentTemplateRequestInterruptConfig extends TeaModel {
        /**
         * <p>Specifies whether to interrupt based on semantics.</p>
         */
        @NameInMap("SemanticsInterrupt")
        public Boolean semanticsInterrupt;

        public static ModifyAppAgentTemplateRequestInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestInterruptConfig self = new ModifyAppAgentTemplateRequestInterruptConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestInterruptConfig setSemanticsInterrupt(Boolean semanticsInterrupt) {
            this.semanticsInterrupt = semanticsInterrupt;
            return this;
        }
        public Boolean getSemanticsInterrupt() {
            return this.semanticsInterrupt;
        }

    }

    public static class ModifyAppAgentTemplateRequestLlmConfig extends TeaModel {
        /**
         * <p>The ID of the Model Studio agent.</p>
         */
        @NameInMap("AgentAppId")
        public String agentAppId;

        /**
         * <p>The API key required by the large language model service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-1213123123132123131</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The number of historical conversation turns provided to the large language model. Maximum value: 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("HistoryDepth")
        public Integer historyDepth;

        /**
         * <p>The maximum number of tokens for the output text. Default value: 8192.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MaxToken")
        public Integer maxToken;

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The prompt for the large language model. The maximum length is 5,000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, Xiaodingdang</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The sampling temperature. Valid values: [0, 2). Default value: 0.7.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("Temperature")
        public Float temperature;

        /**
         * <p>The top-p sampling range. Valid values: (0, 1]. Default value: 0.8.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("TopP")
        public Float topP;

        /**
         * <p>The endpoint URL for connecting to a third-party large language model.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://llm.example.aliyuns.com">https://llm.example.aliyuns.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The provider. Alibaba Cloud Model Studio and third-party configurations that comply with the OpenAI API specification are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>thirdparty</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ModifyAppAgentTemplateRequestLlmConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestLlmConfig self = new ModifyAppAgentTemplateRequestLlmConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestLlmConfig setAgentAppId(String agentAppId) {
            this.agentAppId = agentAppId;
            return this;
        }
        public String getAgentAppId() {
            return this.agentAppId;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setHistoryDepth(Integer historyDepth) {
            this.historyDepth = historyDepth;
            return this;
        }
        public Integer getHistoryDepth() {
            return this.historyDepth;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setMaxToken(Integer maxToken) {
            this.maxToken = maxToken;
            return this;
        }
        public Integer getMaxToken() {
            return this.maxToken;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setTemperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }
        public Float getTemperature() {
            return this.temperature;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setTopP(Float topP) {
            this.topP = topP;
            return this;
        }
        public Float getTopP() {
            return this.topP;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyAppAgentTemplateRequestLlmConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ModifyAppAgentTemplateRequestTtsConfig extends TeaModel {
        /**
         * <p>The API key required by the large language model service provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-1213123123132123131</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The filter brackets. Valid values:</p>
         * <ul>
         * <li>1: Chinese parentheses （）</li>
         * <li>2: English parentheses ()</li>
         * <li>3: Chinese square brackets 【】</li>
         * <li>4: English square brackets []</li>
         * <li>5: English curly braces {}</li>
         * </ul>
         */
        @NameInMap("FilterBrackets")
        public java.util.List<Integer> filterBrackets;

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tts</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The pitch. Valid values: 0.5 to 2.0. Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <p>The speech rate. Valid values: 0.5 to 2.0. Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <p>The provider. Alibaba Cloud Model Studio is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The voice. Default value: longxiaoxia. Valid values:</p>
         * <ul>
         * <li>longwan</li>
         * <li>longcheng</li>
         * <li>longhua</li>
         * <li>longxiaochun</li>
         * <li>longxiaoxia</li>
         * <li>longxiaocheng</li>
         * <li>longxiaobai</li>
         * <li>longlaotie</li>
         * <li>longshu</li>
         * <li>longshuo</li>
         * <li>longjing</li>
         * <li>longmiao</li>
         * <li>longyue</li>
         * <li>longyuan</li>
         * <li>longfei</li>
         * <li>longjielidou</li>
         * <li>longtong</li>
         * <li>longxiang</li>
         * <li>loongstella</li>
         * <li>loongbella</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>longwan</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume. Valid values: 0 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static ModifyAppAgentTemplateRequestTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppAgentTemplateRequestTtsConfig self = new ModifyAppAgentTemplateRequestTtsConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAppAgentTemplateRequestTtsConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setFilterBrackets(java.util.List<Integer> filterBrackets) {
            this.filterBrackets = filterBrackets;
            return this;
        }
        public java.util.List<Integer> getFilterBrackets() {
            return this.filterBrackets;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public ModifyAppAgentTemplateRequestTtsConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
