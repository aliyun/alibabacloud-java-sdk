// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentTemplateRequest extends TeaModel {
    @NameInMap("AgentSilenceConfig")
    public ModifyAppAgentTemplateRequestAgentSilenceConfig agentSilenceConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AsrConfig")
    public ModifyAppAgentTemplateRequestAsrConfig asrConfig;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatMode")
    public Integer chatMode;

    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231312312131231</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterruptMode")
    public Integer interruptMode;

    @NameInMap("LlmConfig")
    public ModifyAppAgentTemplateRequestLlmConfig llmConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>智能体模版</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TtsConfig")
    public ModifyAppAgentTemplateRequestTtsConfig ttsConfig;

    /**
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

    public ModifyAppAgentTemplateRequest setChatMode(Integer chatMode) {
        this.chatMode = chatMode;
        return this;
    }
    public Integer getChatMode() {
        return this.chatMode;
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

    public static class ModifyAppAgentTemplateRequestAsrConfigVadConfig extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>500</p>
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
        public ModifyAppAgentTemplateRequestAsrConfigVadConfig vadConfig;

        /**
         * <strong>example:</strong>
         * <p>0bb1776b1745123332074d1b6b</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

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

    public static class ModifyAppAgentTemplateRequestLlmConfig extends TeaModel {
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
         * <p>8</p>
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
         * <p>0.7</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <strong>example:</strong>
         * <p>longwan</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
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
