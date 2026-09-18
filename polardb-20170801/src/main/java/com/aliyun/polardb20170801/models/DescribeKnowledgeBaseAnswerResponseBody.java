// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAnswerResponseBody extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The answer content.</p>
     * 
     * <strong>example:</strong>
     * <p>The financial report summary is as follows: ******</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The cumulative number of tokens generated for completion.</p>
     * 
     * <strong>example:</strong>
     * <p>3935</p>
     */
    @NameInMap("CompletionTokens")
    public Integer completionTokens;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Space not found: pks-xxxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The error type.</p>
     * 
     * <strong>example:</strong>
     * <p>not_found</p>
     */
    @NameInMap("ErrorType")
    public String errorType;

    /**
     * <p>The large language model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>OO1A6p8B******_xPUC</p>
     */
    @NameInMap("LLMModelId")
    public String LLMModelId;

    /**
     * <p>The cumulative number of tokens consumed by the prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>2459</p>
     */
    @NameInMap("PromptTokens")
    public Integer promptTokens;

    /**
     * <p>The unique ID of the Q&amp;A task.</p>
     * 
     * <strong>example:</strong>
     * <p>R3BGbnBqcXN******.2a5a23c9-******-179970533d30</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of reference sources for the answer.</p>
     */
    @NameInMap("Sources")
    public java.util.List<DescribeKnowledgeBaseAnswerResponseBodySources> sources;

    /**
     * <p>The status of the Q&amp;A task. Valid values:</p>
     * <ul>
     * <li>RUNNING: In progress.</li>
     * <li>COMPLETED: Completed.</li>
     * </ul>
     * 
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

    public static class DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources extends TeaModel {
        /**
         * <p>The index of the source document to which the image belongs, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DocumentIndex")
        public Integer documentIndex;

        /**
         * <p>The unique ID of the image resource.</p>
         * 
         * <strong>example:</strong>
         * <p>document-0/pictures/1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The element reference of the image in the Docling source document structure.</p>
         * 
         * <strong>example:</strong>
         * <p>#/pictures/1</p>
         */
        @NameInMap("ItemRef")
        public String itemRef;

        /**
         * <p>The media type of the image resource.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <p>The OSS URI of the image resource.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-bucket/results/my-space/doc-001/artifacts/image-1.png</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources self = new DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources setDocumentIndex(Integer documentIndex) {
            this.documentIndex = documentIndex;
            return this;
        }
        public Integer getDocumentIndex() {
            return this.documentIndex;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources setItemRef(String itemRef) {
            this.itemRef = itemRef;
            return this;
        }
        public String getItemRef() {
            return this.itemRef;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeKnowledgeBaseAnswerResponseBodySources extends TeaModel {
        /**
         * <p>The chunk metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ChunkMetadata")
        public java.util.Map<String, ?> chunkMetadata;

        /**
         * <p>The file ID.</p>
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
         * <p>FinancialReport.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The list of image resources associated with the referenced chunk in the Q&amp;A.</p>
         */
        @NameInMap("ImageResources")
        public java.util.List<DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources> imageResources;

        /**
         * <p>The unique ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The document metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The list of page numbers to which the chunk belongs.</p>
         */
        @NameInMap("PageNumbers")
        public java.util.List<Integer> pageNumbers;

        /**
         * <p>The chunk content.</p>
         * 
         * <strong>example:</strong>
         * <p>FinancialReport</p>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <p>The chunk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ShardIndex")
        public Integer shardIndex;

        /**
         * <p>The similarity score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.75</p>
         */
        @NameInMap("SimilarityScore")
        public Double similarityScore;

        /**
         * <p>The source ID.</p>
         * 
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

        public DescribeKnowledgeBaseAnswerResponseBodySources setImageResources(java.util.List<DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources> imageResources) {
            this.imageResources = imageResources;
            return this;
        }
        public java.util.List<DescribeKnowledgeBaseAnswerResponseBodySourcesImageResources> getImageResources() {
            return this.imageResources;
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
