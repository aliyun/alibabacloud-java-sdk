// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFileShardsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-xxxx-xxxx-xxxx-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Shards")
    public java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShards> shards;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeKnowledgeBaseFileShardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseFileShardsResponseBody self = new DescribeKnowledgeBaseFileShardsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setShards(java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShards> shards) {
        this.shards = shards;
        return this;
    }
    public java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShards> getShards() {
        return this.shards;
    }

    public DescribeKnowledgeBaseFileShardsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeKnowledgeBaseFileShardsResponseBodyShards extends TeaModel {
        @NameInMap("Headings")
        public java.util.List<String> headings;

        @NameInMap("PageNumbers")
        public java.util.List<String> pageNumbers;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShardIndex")
        public Integer shardIndex;

        public static DescribeKnowledgeBaseFileShardsResponseBodyShards build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFileShardsResponseBodyShards self = new DescribeKnowledgeBaseFileShardsResponseBodyShards();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setHeadings(java.util.List<String> headings) {
            this.headings = headings;
            return this;
        }
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setPageNumbers(java.util.List<String> pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public java.util.List<String> getPageNumbers() {
            return this.pageNumbers;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setShardContent(String shardContent) {
            this.shardContent = shardContent;
            return this;
        }
        public String getShardContent() {
            return this.shardContent;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setShardIndex(Integer shardIndex) {
            this.shardIndex = shardIndex;
            return this;
        }
        public Integer getShardIndex() {
            return this.shardIndex;
        }

    }

}
