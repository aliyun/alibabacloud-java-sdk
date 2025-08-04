// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateRequest extends TeaModel {
    @NameInMap("AgentSilenceConfig")
    public CreateAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AsrConfig")
    public CreateAppAgentTemplateRequestAsrConfig asrConfig;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    @NameInMap("Greeting")
    public String greeting;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterruptMode")
    public Integer interruptMode;

    @NameInMap("LlmConfig")
    public CreateAppAgentTemplateRequestLlmConfig llmConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>智能体模版</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TtsConfig")
    public CreateAppAgentTemplateRequestTtsConfig ttsConfig;

    /**
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

    public CreateAppAgentTemplateRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
    }

    public CreateAppAgentTemplateRequest setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
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
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlertTimeout")
        public Integer alertTimeout;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
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

    public static class CreateAppAgentTemplateRequestAsrConfigVadConfig extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>苹果</p>
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
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MaxSentenceSilence")
        public Integer maxSentenceSilence;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STT</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("VadConfig")
        public CreateAppAgentTemplateRequestAsrConfigVadConfig vadConfig;

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

    public static class CreateAppAgentTemplateRequestLlmConfig extends TeaModel {
        @NameInMap("AgentAppId")
        public String agentAppId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-1213123123132123131</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HistoryDepth")
        public Integer historyDepth;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MaxToken")
        public Integer maxToken;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Temperature")
        public Float temperature;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("TopP")
        public Float topP;

        /**
         * <strong>example:</strong>
         * <p><a href="https://llm.example.aliyuns.com">https://llm.example.aliyuns.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak-1213123123132123131</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("FilterBrackets")
        public java.util.List<Integer> filterBrackets;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tts</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <strong>example:</strong>
         * <p>longcheng</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
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
