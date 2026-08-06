// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchMemoriesResponseBody extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of results.</p>
     */
    @NameInMap("Results")
    public java.util.List<SearchMemoriesResponseBodyResults> results;

    @NameInMap("Total")
    public String total;

    @NameInMap("TotalPages")
    public String totalPages;

    public static SearchMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesResponseBody self = new SearchMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesResponseBody setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public SearchMemoriesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMemoriesResponseBody setResults(java.util.List<SearchMemoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SearchMemoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public SearchMemoriesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public SearchMemoriesResponseBody setTotalPages(String totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public String getTotalPages() {
        return this.totalPages;
    }

    public static class SearchMemoriesResponseBodyResults extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-26T08:25:44Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>423</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The memory content.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The agent to which the memory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>agent1</p>
         */
        @NameInMap("MemoryAgentId")
        public String memoryAgentId;

        /**
         * <p>The user to whom the memory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("MemoryUserId")
        public String memoryUserId;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tags\&quot;:\&quot;Issue_date_2023-11-30,VD_现行有效\&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16T02:27:33Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static SearchMemoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyResults self = new SearchMemoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMemoriesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchMemoriesResponseBodyResults setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public SearchMemoriesResponseBodyResults setMemoryAgentId(String memoryAgentId) {
            this.memoryAgentId = memoryAgentId;
            return this;
        }
        public String getMemoryAgentId() {
            return this.memoryAgentId;
        }

        public SearchMemoriesResponseBodyResults setMemoryUserId(String memoryUserId) {
            this.memoryUserId = memoryUserId;
            return this;
        }
        public String getMemoryUserId() {
            return this.memoryUserId;
        }

        public SearchMemoriesResponseBodyResults setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public SearchMemoriesResponseBodyResults setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public SearchMemoriesResponseBodyResults setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
