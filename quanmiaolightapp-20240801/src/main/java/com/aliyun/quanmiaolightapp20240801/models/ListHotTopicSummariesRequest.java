// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ListHotTopicSummariesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
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
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>JlroP3CjgQh5PQDlH3ArzADkBTPZgVqo+64jhZRglNq0mEYoV5SlGb/Juvo8CdfYE9rlwEr2pIJQwdaYotak9g==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListHotTopicSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicSummariesRequest self = new ListHotTopicSummariesRequest();
        return TeaModel.build(map, self);
    }

    public ListHotTopicSummariesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListHotTopicSummariesRequest setHotTopic(String hotTopic) {
        this.hotTopic = hotTopic;
        return this;
    }
    public String getHotTopic() {
        return this.hotTopic;
    }

    public ListHotTopicSummariesRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public ListHotTopicSummariesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotTopicSummariesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
