// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aoe****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RtcConfig")
    public StartAgentRequestRtcConfig rtcConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

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
        @NameInMap("TargetUserIds")
        public java.util.List<String> targetUserIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>423341</p>
         */
        @NameInMap("UserId")
        public String userId;

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
        @NameInMap("LanguageHints")
        public java.util.List<String> languageHints;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("MaxSentenceSilence")
        public Integer maxSentenceSilence;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SemanticPunctuationEnabled")
        public Boolean semanticPunctuationEnabled;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("VadConfig")
        public StartAgentRequestVoiceChatConfigASRConfigVadConfig vadConfig;

        /**
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
        @NameInMap("AlertTimeout")
        public Integer alertTimeout;

        @NameInMap("Content")
        public String content;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Strategy")
        public Integer strategy;

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

    public static class StartAgentRequestVoiceChatConfigLLMConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HistoryDepth")
        public Integer historyDepth;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxToken")
        public Integer maxToken;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("TopP")
        public Double topP;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
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
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("FilterBrackets")
        public java.util.List<Integer> filterBrackets;

        /**
         * <strong>example:</strong>
         * <p>cosyvoice-v1</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pitch")
        public Double pitch;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rate")
        public Double rate;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <strong>example:</strong>
         * <p>longxiaoxia</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
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
        @NameInMap("ASRConfig")
        public StartAgentRequestVoiceChatConfigASRConfig ASRConfig;

        @NameInMap("AgentSilenceConfig")
        public StartAgentRequestVoiceChatConfigAgentSilenceConfig agentSilenceConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatMode")
        public Integer chatMode;

        @NameInMap("Greeting")
        public String greeting;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InterruptMode")
        public Integer interruptMode;

        @NameInMap("LLMConfig")
        public StartAgentRequestVoiceChatConfigLLMConfig LLMConfig;

        @NameInMap("TTSConfig")
        public StartAgentRequestVoiceChatConfigTTSConfig TTSConfig;

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

        public StartAgentRequestVoiceChatConfig setChatMode(Integer chatMode) {
            this.chatMode = chatMode;
            return this;
        }
        public Integer getChatMode() {
            return this.chatMode;
        }

        public StartAgentRequestVoiceChatConfig setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
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

    }

}
