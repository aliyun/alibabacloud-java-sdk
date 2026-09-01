// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RetrievalKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The query text.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial report</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResultCount")
    public Integer resultCount;

    /**
     * <p>The search results.</p>
     */
    @NameInMap("Results")
    public java.util.List<RetrievalKnowledgeBaseResponseBodyResults> results;

    public static RetrievalKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrievalKnowledgeBaseResponseBody self = new RetrievalKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrievalKnowledgeBaseResponseBody setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public RetrievalKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrievalKnowledgeBaseResponseBody setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public Integer getResultCount() {
        return this.resultCount;
    }

    public RetrievalKnowledgeBaseResponseBody setResults(java.util.List<RetrievalKnowledgeBaseResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RetrievalKnowledgeBaseResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RetrievalKnowledgeBaseResponseBodyResults extends TeaModel {
        /**
         * <p>The unique ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>2024FinancialReport.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The chain of section headings to which the shard belongs.</p>
         */
        @NameInMap("Headings")
        public java.util.List<String> headings;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The list of page numbers to which the shard belongs.</p>
         */
        @NameInMap("PageNumbers")
        public java.util.List<Integer> pageNumbers;

        /**
         * <p>The text content of the shard.</p>
         * 
         * <strong>example:</strong>
         * <p>Financial report</p>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <p>The shard index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShardIndex")
        public Integer shardIndex;

        /**
         * <p>The similarity score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("SimilarityScore")
        public Double similarityScore;

        public static RetrievalKnowledgeBaseResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RetrievalKnowledgeBaseResponseBodyResults self = new RetrievalKnowledgeBaseResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RetrievalKnowledgeBaseResponseBodyResults setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setHeadings(java.util.List<String> headings) {
            this.headings = headings;
            return this;
        }
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setPageNumbers(java.util.List<Integer> pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public java.util.List<Integer> getPageNumbers() {
            return this.pageNumbers;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setShardContent(String shardContent) {
            this.shardContent = shardContent;
            return this;
        }
        public String getShardContent() {
            return this.shardContent;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setShardIndex(Integer shardIndex) {
            this.shardIndex = shardIndex;
            return this;
        }
        public Integer getShardIndex() {
            return this.shardIndex;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setSimilarityScore(Double similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Double getSimilarityScore() {
            return this.similarityScore;
        }

    }

}
