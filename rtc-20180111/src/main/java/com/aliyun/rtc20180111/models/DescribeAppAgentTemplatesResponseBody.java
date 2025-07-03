// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppAgentTemplatesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30D41049-D02D-1C21-86AE-B3E5FD805C27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeAppAgentTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeAppAgentTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAgentTemplatesResponseBody self = new DescribeAppAgentTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppAgentTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppAgentTemplatesResponseBody setTemplates(java.util.List<DescribeAppAgentTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeAppAgentTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeAppAgentTemplatesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppAgentTemplatesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Word")
        public String word;

        public static DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights self = new DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights();
            return TeaModel.build(map, self);
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MaxSentenceSilence")
        public Integer maxSentenceSilence;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ecfadace11114cf08a7f07aceee798ad</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        @NameInMap("WordWeights")
        public java.util.List<DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights> wordWeights;

        public static DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig self = new DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig setMaxSentenceSilence(Integer maxSentenceSilence) {
            this.maxSentenceSilence = maxSentenceSilence;
            return this;
        }
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig setWordWeights(java.util.List<DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfigWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

    public static class DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qW8GpBOdHK/pv9gdUSVLvQ==</p>
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
         * <strong>example:</strong>
         * <p>deepseek-r1</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>llm</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
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
         * <p><a href="https://test.com">https://test.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig self = new DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setHistoryDepth(Integer historyDepth) {
            this.historyDepth = historyDepth;
            return this;
        }
        public Integer getHistoryDepth() {
            return this.historyDepth;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setMaxToken(Integer maxToken) {
            this.maxToken = maxToken;
            return this;
        }
        public Integer getMaxToken() {
            return this.maxToken;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setTemperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }
        public Float getTemperature() {
            return this.temperature;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setTopP(Float topP) {
            this.topP = topP;
            return this;
        }
        public Float getTopP() {
            return this.topP;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>N5448VFGI2mXJU8a/A03VQ==</p>
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
         * <p>50</p>
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

        public static DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig self = new DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setFilterBrackets(java.util.List<Integer> filterBrackets) {
            this.filterBrackets = filterBrackets;
            return this;
        }
        public java.util.List<Integer> getFilterBrackets() {
            return this.filterBrackets;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class DescribeAppAgentTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("AsrConfig")
        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig asrConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatMode")
        public Integer chatMode;

        /**
         * <strong>example:</strong>
         * <p>2020-09-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>你好，机器人。</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <strong>example:</strong>
         * <p>wv7N****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InterruptMode")
        public Integer interruptMode;

        @NameInMap("LlmConfig")
        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig llmConfig;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("TtsConfig")
        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig ttsConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeAppAgentTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppAgentTemplatesResponseBodyTemplates self = new DescribeAppAgentTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setAsrConfig(DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public DescribeAppAgentTemplatesResponseBodyTemplatesAsrConfig getAsrConfig() {
            return this.asrConfig;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setChatMode(Integer chatMode) {
            this.chatMode = chatMode;
            return this;
        }
        public Integer getChatMode() {
            return this.chatMode;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setInterruptMode(Integer interruptMode) {
            this.interruptMode = interruptMode;
            return this;
        }
        public Integer getInterruptMode() {
            return this.interruptMode;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setLlmConfig(DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig llmConfig) {
            this.llmConfig = llmConfig;
            return this;
        }
        public DescribeAppAgentTemplatesResponseBodyTemplatesLlmConfig getLlmConfig() {
            return this.llmConfig;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setTtsConfig(DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }
        public DescribeAppAgentTemplatesResponseBodyTemplatesTtsConfig getTtsConfig() {
            return this.ttsConfig;
        }

        public DescribeAppAgentTemplatesResponseBodyTemplates setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
