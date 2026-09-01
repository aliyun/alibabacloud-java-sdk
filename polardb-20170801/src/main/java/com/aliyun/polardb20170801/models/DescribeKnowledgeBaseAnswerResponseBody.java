// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAnswerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>财报的内容总结如下：******</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <strong>example:</strong>
     * <p>3935</p>
     */
    @NameInMap("CompletionTokens")
    public Integer completionTokens;

    /**
     * <strong>example:</strong>
     * <p>Space not found: pks-xxxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>not_found</p>
     */
    @NameInMap("ErrorType")
    public String errorType;

    /**
     * <strong>example:</strong>
     * <p>OO1A6p8B******_xPUC</p>
     */
    @NameInMap("LLMModelId")
    public String LLMModelId;

    /**
     * <strong>example:</strong>
     * <p>2459</p>
     */
    @NameInMap("PromptTokens")
    public Integer promptTokens;

    /**
     * <strong>example:</strong>
     * <p>R3BGbnBqcXN******.2a5a23c9-******-179970533d30</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sources")
    public java.util.List<DescribeKnowledgeBaseAnswerResponseBodySources> sources;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeKnowledgeBaseAnswerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseAnswerResponseBody self = new DescribeKnowledgeBaseAnswerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseAnswerResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setLLMModelId(String LLMModelId) {
        this.LLMModelId = LLMModelId;
        return this;
    }
    public String getLLMModelId() {
        return this.LLMModelId;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setSources(java.util.List<DescribeKnowledgeBaseAnswerResponseBodySources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<DescribeKnowledgeBaseAnswerResponseBodySources> getSources() {
        return this.sources;
    }

    public DescribeKnowledgeBaseAnswerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeKnowledgeBaseAnswerResponseBodySources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ChunkMetadata")
        public java.util.Map<String, ?> chunkMetadata;

        /**
         * <strong>example:</strong>
         * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>财报.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        @NameInMap("PageNumbers")
        public java.util.List<Integer> pageNumbers;

        /**
         * <strong>example:</strong>
         * <p>财报</p>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ShardIndex")
        public Integer shardIndex;

        /**
         * <strong>example:</strong>
         * <p>0.75</p>
         */
        @NameInMap("SimilarityScore")
        public Double similarityScore;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceId")
        public Integer sourceId;

        public static DescribeKnowledgeBaseAnswerResponseBodySources build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseAnswerResponseBodySources self = new DescribeKnowledgeBaseAnswerResponseBodySources();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setChunkMetadata(java.util.Map<String, ?> chunkMetadata) {
            this.chunkMetadata = chunkMetadata;
            return this;
        }
        public java.util.Map<String, ?> getChunkMetadata() {
            return this.chunkMetadata;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setPageNumbers(java.util.List<Integer> pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public java.util.List<Integer> getPageNumbers() {
            return this.pageNumbers;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setShardContent(String shardContent) {
            this.shardContent = shardContent;
            return this;
        }
        public String getShardContent() {
            return this.shardContent;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setShardIndex(Integer shardIndex) {
            this.shardIndex = shardIndex;
            return this;
        }
        public Integer getShardIndex() {
            return this.shardIndex;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setSimilarityScore(Double similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Double getSimilarityScore() {
            return this.similarityScore;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySources setSourceId(Integer sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Integer getSourceId() {
            return this.sourceId;
        }

    }

}
