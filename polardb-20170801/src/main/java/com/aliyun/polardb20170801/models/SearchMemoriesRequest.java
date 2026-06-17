// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchMemoriesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The start time for filtering memories by creation time. Must be in UTC and ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    /**
     * <p>The end time for filtering memories by creation time. Must be in UTC and ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The agent ID associated with the memory.</p>
     * 
     * <strong>example:</strong>
     * <p>agent1</p>
     */
    @NameInMap("MemoryAgentId")
    public String memoryAgentId;

    /**
     * <p>The user ID associated with the memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("MemoryUserId")
    public String memoryUserId;

    /**
     * <p>The search query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>who are you</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TopK")
    public String topK;

    public static SearchMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesRequest self = new SearchMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SearchMemoriesRequest setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public SearchMemoriesRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchMemoriesRequest setMemoryAgentId(String memoryAgentId) {
        this.memoryAgentId = memoryAgentId;
        return this;
    }
    public String getMemoryAgentId() {
        return this.memoryAgentId;
    }

    public SearchMemoriesRequest setMemoryUserId(String memoryUserId) {
        this.memoryUserId = memoryUserId;
        return this;
    }
    public String getMemoryUserId() {
        return this.memoryUserId;
    }

    public SearchMemoriesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchMemoriesRequest setTopK(String topK) {
        this.topK = topK;
        return this;
    }
    public String getTopK() {
        return this.topK;
    }

}
