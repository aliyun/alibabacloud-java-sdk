// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateRequest extends TeaModel {
    /**
     * <p>The agent silence configuration.</p>
     */
    @NameInMap("AgentSilenceConfig")
    public CreateAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig;

    /**
     * <p>The ambient environment configuration for the agent. If this parameter is not specified, the ambient environment configuration is not used.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public CreateAppAgentTemplateRequestAmbientSoundConfig ambientSoundConfig;

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
    public CreateAppAgentTemplateRequestAsrConfig asrConfig;

    /**
     * <p>The agent backchannel configuration.</p>
     */
    @NameInMap("BackChannelConfig")
    public CreateAppAgentTemplateRequestBackChannelConfig backChannelConfig;

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
     * <p>Specifies whether to enable video understanding. If enabled, the LLM must support multimodal data.</p>
     */
    @NameInMap("EnableVideoUnderstanding")
    public Boolean enableVideoUnderstanding;

    /**
     * <p>The greeting message. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Good morning, my friend!</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The agent interruption configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public CreateAppAgentTemplateRequestInterruptConfig interruptConfig;

    /**
     * <p>The interruption mode. Valid values:</p>
     * <ul>
     * <li>1: Interruption allowed (default).</li>
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
    public CreateAppAgentTemplateRequestLlmConfig llmConfig;

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
     * <p>The preferred video stream for the agent to process when visual understanding is enabled. The agent can process only one video stream at a time. When both the camera stream and the screen sharing stream are pushed simultaneously, this parameter specifies the preferred stream. Valid values:</p>
     * <ul>
     * <li>1: The agent preferentially processes the camera stream.</li>
     * <li>2: The agent preferentially processes the screen sharing stream.
     * Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreferVideo")
    public Integer preferVideo;

    /**
     * <p>The text-to-speech settings.</p>
     */
    @NameInMap("TtsConfig")
    public CreateAppAgentTemplateRequestTtsConfig ttsConfig;

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

    public static CreateAppAgentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAgentTemplateRequest self = new CreateAppAgentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAgentTemplateRequest setAgentSilenceConfig(CreateAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig) {
        this.agentSilenceConfig = agentSilenceConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestAgentSilenceConfig getAgentSilenceConfig() {
        return this.agentSilenceConfig;
    }

    public CreateAppAgentTemplateRequest setAmbientSoundConfig(CreateAppAgentTemplateRequestAmbientSoundConfig ambientSoundConfig) {
        this.ambientSoundConfig = ambientSoundConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestAmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    public CreateAppAgentTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppAgentTemplateRequest setAsrConfig(CreateAppAgentTemplateRequestAsrConfig asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestAsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    public CreateAppAgentTemplateRequest setBackChannelConfig(CreateAppAgentTemplateRequestBackChannelConfig backChannelConfig) {
        this.backChannelConfig = backChannelConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestBackChannelConfig getBackChannelConfig() {
        return this.backChannelConfig;
    }

    public CreateAppAgentTemplateRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
    }

    public CreateAppAgentTemplateRequest setEnableVideoUnderstanding(Boolean enableVideoUnderstanding) {
        this.enableVideoUnderstanding = enableVideoUnderstanding;
        return this;
    }
    public Boolean getEnableVideoUnderstanding() {
        return this.enableVideoUnderstanding;
    }

    public CreateAppAgentTemplateRequest setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public CreateAppAgentTemplateRequest setInterruptConfig(CreateAppAgentTemplateRequestInterruptConfig interruptConfig) {
        this.interruptConfig = interruptConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestInterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    public CreateAppAgentTemplateRequest setInterruptMode(Integer interruptMode) {
        this.interruptMode = interruptMode;
        return this;
    }
    public Integer getInterruptMode() {
        return this.interruptMode;
    }

    public CreateAppAgentTemplateRequest setLlmConfig(CreateAppAgentTemplateRequestLlmConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestLlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    public CreateAppAgentTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppAgentTemplateRequest setPreferVideo(Integer preferVideo) {
        this.preferVideo = preferVideo;
        return this;
    }
    public Integer getPreferVideo() {
        return this.preferVideo;
    }

    public CreateAppAgentTemplateRequest setTtsConfig(CreateAppAgentTemplateRequestTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public CreateAppAgentTemplateRequestTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public CreateAppAgentTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class CreateAppAgentTemplateRequestAgentSilenceConfig extends TeaModel {
        /**
         * <p>The timeout period for silence alerts, in seconds. This alert can be triggered multiple times. If the agent remains silent after the timeout period elapses, the alert is triggered again upon the next timeout. Valid values: 5 to 600. Default value: 0. A value of 0 indicates that no alert is triggered.</p>
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
         * <p>Hello, please try again later?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The handling strategy for silence timeout. Valid values:</p>
         * <ul>
         * <li>1: Broadcasts the prompt message specified by Content to the user via voice.</li>
         * <li>2: Sends the prompt message specified by Content and the conversation history to the LLM, and broadcasts the reply generated by the model.
         * Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The timeout period for triggering the webhook upon agent silence, in seconds. This webhook can be triggered multiple times. If the agent remains silent after the webhook timeout period elapses, the webhook is triggered again upon the next timeout. Valid values: 10 to 600. Default value: 0. A value of 0 indicates that the webhook is not triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("WebhookTriggerTimeout")
        public Integer webhookTriggerTimeout;

        public static CreateAppAgentTemplateRequestAgentSilenceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestAgentSilenceConfig self = new CreateAppAgentTemplateRequestAgentSilenceConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestAgentSilenceConfig setAlertTimeout(Integer alertTimeout) {
            this.alertTimeout = alertTimeout;
            return this;
        }
        public Integer getAlertTimeout() {
            return this.alertTimeout;
        }

        public CreateAppAgentTemplateRequestAgentSilenceConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAppAgentTemplateRequestAgentSilenceConfig setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public CreateAppAgentTemplateRequestAgentSilenceConfig setWebhookTriggerTimeout(Integer webhookTriggerTimeout) {
            this.webhookTriggerTimeout = webhookTriggerTimeout;
            return this;
        }
        public Integer getWebhookTriggerTimeout() {
            return this.webhookTriggerTimeout;
        }

    }

    public static class CreateAppAgentTemplateRequestAmbientSoundConfig extends TeaModel {
        /**
         * <p>The default ambient sounds provided by the agent. Valid values:</p>
         * <ul>
         * <li>white_noise </li>
         * <li>office</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white_noise</p>
         */
        @NameInMap("SoundId")
        public String soundId;

        /**
         * <p>The volume level.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static CreateAppAgentTemplateRequestAmbientSoundConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestAmbientSoundConfig self = new CreateAppAgentTemplateRequestAmbientSoundConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestAmbientSoundConfig setSoundId(String soundId) {
            this.soundId = soundId;
            return this;
        }
        public String getSoundId() {
            return this.soundId;
        }

        public CreateAppAgentTemplateRequestAmbientSoundConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class CreateAppAgentTemplateRequestAsrConfigVadConfig extends TeaModel {
        /**
         * <p>The minimum duration of continuous voice signals in milliseconds to avoid false interruptions. Default value: 300. Valid values: 0 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("InterruptSpeechDuration")
        public Integer interruptSpeechDuration;

        public static CreateAppAgentTemplateRequestAsrConfigVadConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestAsrConfigVadConfig self = new CreateAppAgentTemplateRequestAsrConfigVadConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestAsrConfigVadConfig setInterruptSpeechDuration(Integer interruptSpeechDuration) {
            this.interruptSpeechDuration = interruptSpeechDuration;
            return this;
        }
        public Integer getInterruptSpeechDuration() {
            return this.interruptSpeechDuration;
        }

    }

    public static class CreateAppAgentTemplateRequestAsrConfigWordWeights extends TeaModel {
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
         * <p>The hot word weight. Valid values: integers from 1 to 5. Common value: 4. If the effect is not obvious, you can increase the weight. However, a large weight may cause negative effects and lead to inaccurate recognition of other words.</p>
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

        public static CreateAppAgentTemplateRequestAsrConfigWordWeights build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestAsrConfigWordWeights self = new CreateAppAgentTemplateRequestAsrConfigWordWeights();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestAsrConfigWordWeights setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public CreateAppAgentTemplateRequestAsrConfigWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateAppAgentTemplateRequestAsrConfigWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class CreateAppAgentTemplateRequestAsrConfig extends TeaModel {
        /**
         * <p>The sentence silence detection threshold. Default value: 500 ms. Valid values: 200 to 6000.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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
        public CreateAppAgentTemplateRequestAsrConfigVadConfig vadConfig;

        /**
         * <p>The hot words. Each vocabulary can contain up to 500 hot words, and each hot word can be up to 10 Chinese characters in length. Hot words must be UTF-8 encoded and cannot contain punctuation marks or special characters. Otherwise, the hot words do not take effect.</p>
         */
        @NameInMap("WordWeights")
        public java.util.List<CreateAppAgentTemplateRequestAsrConfigWordWeights> wordWeights;

        public static CreateAppAgentTemplateRequestAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestAsrConfig self = new CreateAppAgentTemplateRequestAsrConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestAsrConfig setMaxSentenceSilence(Integer maxSentenceSilence) {
            this.maxSentenceSilence = maxSentenceSilence;
            return this;
        }
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        public CreateAppAgentTemplateRequestAsrConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppAgentTemplateRequestAsrConfig setVadConfig(CreateAppAgentTemplateRequestAsrConfigVadConfig vadConfig) {
            this.vadConfig = vadConfig;
            return this;
        }
        public CreateAppAgentTemplateRequestAsrConfigVadConfig getVadConfig() {
            return this.vadConfig;
        }

        public CreateAppAgentTemplateRequestAsrConfig setWordWeights(java.util.List<CreateAppAgentTemplateRequestAsrConfigWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<CreateAppAgentTemplateRequestAsrConfigWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

    public static class CreateAppAgentTemplateRequestBackChannelConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable backchanneling.</p>
         */
        @NameInMap("UserTurnEnd")
        public Boolean userTurnEnd;

        public static CreateAppAgentTemplateRequestBackChannelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestBackChannelConfig self = new CreateAppAgentTemplateRequestBackChannelConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestBackChannelConfig setUserTurnEnd(Boolean userTurnEnd) {
            this.userTurnEnd = userTurnEnd;
            return this;
        }
        public Boolean getUserTurnEnd() {
            return this.userTurnEnd;
        }

    }

    public static class CreateAppAgentTemplateRequestInterruptConfig extends TeaModel {
        /**
         * <p>The semantic interruption configuration.</p>
         */
        @NameInMap("SemanticsInterrupt")
        public Boolean semanticsInterrupt;

        public static CreateAppAgentTemplateRequestInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestInterruptConfig self = new CreateAppAgentTemplateRequestInterruptConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestInterruptConfig setSemanticsInterrupt(Boolean semanticsInterrupt) {
            this.semanticsInterrupt = semanticsInterrupt;
            return this;
        }
        public Boolean getSemanticsInterrupt() {
            return this.semanticsInterrupt;
        }

    }

    public static class CreateAppAgentTemplateRequestLlmConfig extends TeaModel {
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
         * <p>5</p>
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
         * <p>You are a senior psychiatrist</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The sampling temperature. Default value: 0.7. Valid values: [0, 2).</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Temperature")
        public Float temperature;

        /**
         * <p>The top-P sampling range. Default value: 0.8. Valid values: (0, 1].</p>
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
         * <p>The provider. Alibaba Cloud Model Studio and third-party configurations that comply with OpenAI API specifications are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thirdparty</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static CreateAppAgentTemplateRequestLlmConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestLlmConfig self = new CreateAppAgentTemplateRequestLlmConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestLlmConfig setAgentAppId(String agentAppId) {
            this.agentAppId = agentAppId;
            return this;
        }
        public String getAgentAppId() {
            return this.agentAppId;
        }

        public CreateAppAgentTemplateRequestLlmConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateAppAgentTemplateRequestLlmConfig setHistoryDepth(Integer historyDepth) {
            this.historyDepth = historyDepth;
            return this;
        }
        public Integer getHistoryDepth() {
            return this.historyDepth;
        }

        public CreateAppAgentTemplateRequestLlmConfig setMaxToken(Integer maxToken) {
            this.maxToken = maxToken;
            return this;
        }
        public Integer getMaxToken() {
            return this.maxToken;
        }

        public CreateAppAgentTemplateRequestLlmConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppAgentTemplateRequestLlmConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CreateAppAgentTemplateRequestLlmConfig setTemperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }
        public Float getTemperature() {
            return this.temperature;
        }

        public CreateAppAgentTemplateRequestLlmConfig setTopP(Float topP) {
            this.topP = topP;
            return this;
        }
        public Float getTopP() {
            return this.topP;
        }

        public CreateAppAgentTemplateRequestLlmConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateAppAgentTemplateRequestLlmConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class CreateAppAgentTemplateRequestTtsConfig extends TeaModel {
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
         * <p>The filter settings. Valid values:</p>
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
         * <p>The pitch. Default value: 1.0. Valid values: 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <p>The speech rate. Default value: 1.0. Valid values: 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <p>The provider. Alibaba Cloud Model Studio is supported.</p>
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
         * <p>longcheng</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume. Default value: 50. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static CreateAppAgentTemplateRequestTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAgentTemplateRequestTtsConfig self = new CreateAppAgentTemplateRequestTtsConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAgentTemplateRequestTtsConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateAppAgentTemplateRequestTtsConfig setFilterBrackets(java.util.List<Integer> filterBrackets) {
            this.filterBrackets = filterBrackets;
            return this;
        }
        public java.util.List<Integer> getFilterBrackets() {
            return this.filterBrackets;
        }

        public CreateAppAgentTemplateRequestTtsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppAgentTemplateRequestTtsConfig setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public CreateAppAgentTemplateRequestTtsConfig setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public CreateAppAgentTemplateRequestTtsConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public CreateAppAgentTemplateRequestTtsConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public CreateAppAgentTemplateRequestTtsConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
