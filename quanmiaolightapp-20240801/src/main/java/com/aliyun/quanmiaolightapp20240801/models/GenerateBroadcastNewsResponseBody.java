// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateBroadcastNewsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GenerateBroadcastNewsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GenerateBroadcastNewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateBroadcastNewsResponseBody self = new GenerateBroadcastNewsResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateBroadcastNewsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateBroadcastNewsResponseBody setData(GenerateBroadcastNewsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateBroadcastNewsResponseBodyData getData() {
        return this.data;
    }

    public GenerateBroadcastNewsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateBroadcastNewsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateBroadcastNewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateBroadcastNewsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/xxx.jpeg">http://xxx.com/xxx.jpeg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages build(java.util.Map<String, ?> map) throws Exception {
            GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages self = new GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages();
            return TeaModel.build(map, self);
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GenerateBroadcastNewsResponseBodyDataHotTopicSummaries extends TeaModel {
        @NameInMap("category")
        public String category;

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
         * <p>1000000</p>
         */
        @NameInMap("hotValue")
        public Double hotValue;

        /**
         * <strong>example:</strong>
         * <p>1458tb3bjo7531kap42a</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("images")
        public java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages> images;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("textSummary")
        public String textSummary;

        public static GenerateBroadcastNewsResponseBodyDataHotTopicSummaries build(java.util.Map<String, ?> map) throws Exception {
            GenerateBroadcastNewsResponseBodyDataHotTopicSummaries self = new GenerateBroadcastNewsResponseBodyDataHotTopicSummaries();
            return TeaModel.build(map, self);
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setHotTopic(String hotTopic) {
            this.hotTopic = hotTopic;
            return this;
        }
        public String getHotTopic() {
            return this.hotTopic;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setHotTopicVersion(String hotTopicVersion) {
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setHotValue(Double hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Double getHotValue() {
            return this.hotValue;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setImages(java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummariesImages> getImages() {
            return this.images;
        }

        public GenerateBroadcastNewsResponseBodyDataHotTopicSummaries setTextSummary(String textSummary) {
            this.textSummary = textSummary;
            return this;
        }
        public String getTextSummary() {
            return this.textSummary;
        }

    }

    public static class GenerateBroadcastNewsResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GenerateBroadcastNewsResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GenerateBroadcastNewsResponseBodyDataUsage self = new GenerateBroadcastNewsResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GenerateBroadcastNewsResponseBodyDataUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GenerateBroadcastNewsResponseBodyDataUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GenerateBroadcastNewsResponseBodyDataUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GenerateBroadcastNewsResponseBodyData extends TeaModel {
        @NameInMap("hotTopicSummaries")
        public java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummaries> hotTopicSummaries;

        /**
         * <strong>example:</strong>
         * <p>2bb0ea82dafd48a8817fadc4c90e2b52</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("text")
        public String text;

        @NameInMap("usage")
        public GenerateBroadcastNewsResponseBodyDataUsage usage;

        public static GenerateBroadcastNewsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateBroadcastNewsResponseBodyData self = new GenerateBroadcastNewsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateBroadcastNewsResponseBodyData setHotTopicSummaries(java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummaries> hotTopicSummaries) {
            this.hotTopicSummaries = hotTopicSummaries;
            return this;
        }
        public java.util.List<GenerateBroadcastNewsResponseBodyDataHotTopicSummaries> getHotTopicSummaries() {
            return this.hotTopicSummaries;
        }

        public GenerateBroadcastNewsResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GenerateBroadcastNewsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GenerateBroadcastNewsResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GenerateBroadcastNewsResponseBodyData setUsage(GenerateBroadcastNewsResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GenerateBroadcastNewsResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
