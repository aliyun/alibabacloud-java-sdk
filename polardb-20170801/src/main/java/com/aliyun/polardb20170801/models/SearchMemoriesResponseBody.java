// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchMemoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<SearchMemoriesResponseBodyResults> results;

    public static SearchMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesResponseBody self = new SearchMemoriesResponseBody();
        return TeaModel.build(map, self);
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

    public static class SearchMemoriesResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-09-26T08:25:44Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>423</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>agent1</p>
         */
        @NameInMap("MemoryAgentId")
        public String memoryAgentId;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("MemoryUserId")
        public String memoryUserId;

        @NameInMap("Metadata")
        public String metadata;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Score")
        public String score;

        /**
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
