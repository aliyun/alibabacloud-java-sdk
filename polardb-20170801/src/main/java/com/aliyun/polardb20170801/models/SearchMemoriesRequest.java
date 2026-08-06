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
     * <p>The start time for memory creation.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    /**
     * <p>The end time for memory creation.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The memory agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent1</p>
     */
    @NameInMap("MemoryAgentId")
    public String memoryAgentId;

    /**
     * <p>The memory user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("MemoryUserId")
    public String memoryUserId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of records per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search query.</p>
     * 
     * <strong>example:</strong>
     * <p>who are you</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Specifies the number of top results to return.</p>
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

    public SearchMemoriesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public SearchMemoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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
