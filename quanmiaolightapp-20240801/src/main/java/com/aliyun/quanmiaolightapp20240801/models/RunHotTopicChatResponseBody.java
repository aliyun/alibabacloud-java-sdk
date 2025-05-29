// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicChatResponseBody extends TeaModel {
    @NameInMap("header")
    public RunHotTopicChatResponseBodyHeader header;

    @NameInMap("payload")
    public RunHotTopicChatResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>04DA1A52-4E51-56CB-BA64-FDDA0B53BAE8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunHotTopicChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicChatResponseBody self = new RunHotTopicChatResponseBody();
        return TeaModel.build(map, self);
    }

    public RunHotTopicChatResponseBody setHeader(RunHotTopicChatResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunHotTopicChatResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunHotTopicChatResponseBody setPayload(RunHotTopicChatResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunHotTopicChatResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunHotTopicChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunHotTopicChatResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InvalidParam</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-finished</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("eventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("traceId")
        public String traceId;

        public static RunHotTopicChatResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyHeader self = new RunHotTopicChatResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunHotTopicChatResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunHotTopicChatResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunHotTopicChatResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunHotTopicChatResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunHotTopicChatResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunHotTopicChatResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutputArticles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-09-22 16:45:06</p>
         */
        @NameInMap("pubTime")
        public String pubTime;

        @NameInMap("score")
        public Double score;

        @NameInMap("searchSourceName")
        public String searchSourceName;

        @NameInMap("select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static RunHotTopicChatResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutputArticles self = new RunHotTopicChatResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunHotTopicChatResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages self = new RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews self = new RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("customHotValue")
        public Double customHotValue;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("customTextSummary")
        public String customTextSummary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("hotTopic")
        public String hotTopic;

        /**
         * <strong>example:</strong>
         * <p>2024-09-13_08</p>
         */
        @NameInMap("hotTopicVersion")
        public String hotTopicVersion;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("hotValue")
        public Double hotValue;

        @NameInMap("images")
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages> images;

        @NameInMap("news")
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews> news;

        @NameInMap("pubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("textSummary")
        public String textSummary;

        @NameInMap("url")
        public String url;

        public static RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries self = new RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setCustomHotValue(Double customHotValue) {
            this.customHotValue = customHotValue;
            return this;
        }
        public Double getCustomHotValue() {
            return this.customHotValue;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setCustomTextSummary(String customTextSummary) {
            this.customTextSummary = customTextSummary;
            return this;
        }
        public String getCustomTextSummary() {
            return this.customTextSummary;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setHotTopic(String hotTopic) {
            this.hotTopic = hotTopic;
            return this;
        }
        public String getHotTopic() {
            return this.hotTopic;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setHotTopicVersion(String hotTopicVersion) {
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setHotValue(Double hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Double getHotValue() {
            return this.hotValue;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setImages(java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesImages> getImages() {
            return this.images;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setNews(java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummariesNews> getNews() {
            return this.news;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setTextSummary(String textSummary) {
            this.textSummary = textSummary;
            return this;
        }
        public String getTextSummary() {
            return this.textSummary;
        }

        public RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("fileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("mediaType")
        public String mediaType;

        @NameInMap("sortScore")
        public Double sortScore;

        public static RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias self = new RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias setSortScore(Double sortScore) {
            this.sortScore = sortScore;
            return this;
        }
        public Double getSortScore() {
            return this.sortScore;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("articles")
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputArticles> articles;

        @NameInMap("category")
        public String category;

        @NameInMap("hotTopicSummaries")
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries> hotTopicSummaries;

        @NameInMap("keyword")
        public String keyword;

        @NameInMap("location")
        public String location;

        @NameInMap("multimodalMedias")
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias> multimodalMedias;

        @NameInMap("recommendQueries")
        public java.util.List<String> recommendQueries;

        @NameInMap("searchQuery")
        public String searchQuery;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("text")
        public String text;

        public static RunHotTopicChatResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadOutput self = new RunHotTopicChatResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadOutput setArticles(java.util.List<RunHotTopicChatResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setHotTopicSummaries(java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries> hotTopicSummaries) {
            this.hotTopicSummaries = hotTopicSummaries;
            return this;
        }
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputHotTopicSummaries> getHotTopicSummaries() {
            return this.hotTopicSummaries;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setMultimodalMedias(java.util.List<RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<RunHotTopicChatResponseBodyPayloadOutputMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setRecommendQueries(java.util.List<String> recommendQueries) {
            this.recommendQueries = recommendQueries;
            return this;
        }
        public java.util.List<String> getRecommendQueries() {
            return this.recommendQueries;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunHotTopicChatResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunHotTopicChatResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static RunHotTopicChatResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayloadUsage self = new RunHotTopicChatResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunHotTopicChatResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunHotTopicChatResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunHotTopicChatResponseBodyPayload extends TeaModel {
        @NameInMap("output")
        public RunHotTopicChatResponseBodyPayloadOutput output;

        @NameInMap("usage")
        public RunHotTopicChatResponseBodyPayloadUsage usage;

        public static RunHotTopicChatResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunHotTopicChatResponseBodyPayload self = new RunHotTopicChatResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunHotTopicChatResponseBodyPayload setOutput(RunHotTopicChatResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunHotTopicChatResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunHotTopicChatResponseBodyPayload setUsage(RunHotTopicChatResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunHotTopicChatResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
