// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ListHotTopicSummariesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListHotTopicSummariesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>JlroP3CjgQh5PQDlH3ArzADkBTPZgVqo+64jhZRglNq0mEYoV5SlGb/Juvo8CdfYE9rlwEr2pIJQwdaYotak9g==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListHotTopicSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicSummariesResponseBody self = new ListHotTopicSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotTopicSummariesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotTopicSummariesResponseBody setData(java.util.List<ListHotTopicSummariesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotTopicSummariesResponseBodyData> getData() {
        return this.data;
    }

    public ListHotTopicSummariesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotTopicSummariesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotTopicSummariesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotTopicSummariesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotTopicSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotTopicSummariesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHotTopicSummariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHotTopicSummariesResponseBodyDataNewsComments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("text")
        public String text;

        public static ListHotTopicSummariesResponseBodyDataNewsComments build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicSummariesResponseBodyDataNewsComments self = new ListHotTopicSummariesResponseBodyDataNewsComments();
            return TeaModel.build(map, self);
        }

        public ListHotTopicSummariesResponseBodyDataNewsComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListHotTopicSummariesResponseBodyDataNews extends TeaModel {
        @NameInMap("comments")
        public java.util.List<ListHotTopicSummariesResponseBodyDataNewsComments> comments;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-09-10 15:32:00</p>
         */
        @NameInMap("pubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListHotTopicSummariesResponseBodyDataNews build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicSummariesResponseBodyDataNews self = new ListHotTopicSummariesResponseBodyDataNews();
            return TeaModel.build(map, self);
        }

        public ListHotTopicSummariesResponseBodyDataNews setComments(java.util.List<ListHotTopicSummariesResponseBodyDataNewsComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<ListHotTopicSummariesResponseBodyDataNewsComments> getComments() {
            return this.comments;
        }

        public ListHotTopicSummariesResponseBodyDataNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListHotTopicSummariesResponseBodyDataNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListHotTopicSummariesResponseBodyDataNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListHotTopicSummariesResponseBodyDataNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListHotTopicSummariesResponseBodyDataSummarySummaries extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("title")
        public String title;

        public static ListHotTopicSummariesResponseBodyDataSummarySummaries build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicSummariesResponseBodyDataSummarySummaries self = new ListHotTopicSummariesResponseBodyDataSummarySummaries();
            return TeaModel.build(map, self);
        }

        public ListHotTopicSummariesResponseBodyDataSummarySummaries setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListHotTopicSummariesResponseBodyDataSummarySummaries setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListHotTopicSummariesResponseBodyDataSummary extends TeaModel {
        @NameInMap("summaries")
        public java.util.List<ListHotTopicSummariesResponseBodyDataSummarySummaries> summaries;

        public static ListHotTopicSummariesResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicSummariesResponseBodyDataSummary self = new ListHotTopicSummariesResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public ListHotTopicSummariesResponseBodyDataSummary setSummaries(java.util.List<ListHotTopicSummariesResponseBodyDataSummarySummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<ListHotTopicSummariesResponseBodyDataSummarySummaries> getSummaries() {
            return this.summaries;
        }

    }

    public static class ListHotTopicSummariesResponseBodyData extends TeaModel {
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("hotTopic")
        public String hotTopic;

        /**
         * <strong>example:</strong>
         * <p>2024-09-13_12</p>
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
         * <p>db5dc5b3d8954a30b65ba700c9dda3bb</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("news")
        public java.util.List<ListHotTopicSummariesResponseBodyDataNews> news;

        @NameInMap("summary")
        public ListHotTopicSummariesResponseBodyDataSummary summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("textSummary")
        public String textSummary;

        public static ListHotTopicSummariesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicSummariesResponseBodyData self = new ListHotTopicSummariesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotTopicSummariesResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListHotTopicSummariesResponseBodyData setHotTopic(String hotTopic) {
            this.hotTopic = hotTopic;
            return this;
        }
        public String getHotTopic() {
            return this.hotTopic;
        }

        public ListHotTopicSummariesResponseBodyData setHotTopicVersion(String hotTopicVersion) {
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        public ListHotTopicSummariesResponseBodyData setHotValue(Double hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Double getHotValue() {
            return this.hotValue;
        }

        public ListHotTopicSummariesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotTopicSummariesResponseBodyData setNews(java.util.List<ListHotTopicSummariesResponseBodyDataNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<ListHotTopicSummariesResponseBodyDataNews> getNews() {
            return this.news;
        }

        public ListHotTopicSummariesResponseBodyData setSummary(ListHotTopicSummariesResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public ListHotTopicSummariesResponseBodyDataSummary getSummary() {
            return this.summary;
        }

        public ListHotTopicSummariesResponseBodyData setTextSummary(String textSummary) {
            this.textSummary = textSummary;
            return this;
        }
        public String getTextSummary() {
            return this.textSummary;
        }

    }

}
