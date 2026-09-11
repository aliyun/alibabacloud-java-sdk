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

    public static class RetrievalKnowledgeBaseResponseBodyResultsImageResources extends TeaModel {
        /**
         * <p>The index of the source document to which the image belongs, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DocumentIndex")
        public Integer documentIndex;

        /**
         * <p>The unique identifier of the image resource.</p>
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

        public static RetrievalKnowledgeBaseResponseBodyResultsImageResources build(java.util.Map<String, ?> map) throws Exception {
            RetrievalKnowledgeBaseResponseBodyResultsImageResources self = new RetrievalKnowledgeBaseResponseBodyResultsImageResources();
            return TeaModel.build(map, self);
        }

        public RetrievalKnowledgeBaseResponseBodyResultsImageResources setDocumentIndex(Integer documentIndex) {
            this.documentIndex = documentIndex;
            return this;
        }
        public Integer getDocumentIndex() {
            return this.documentIndex;
        }

        public RetrievalKnowledgeBaseResponseBodyResultsImageResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrievalKnowledgeBaseResponseBodyResultsImageResources setItemRef(String itemRef) {
            this.itemRef = itemRef;
            return this;
        }
        public String getItemRef() {
            return this.itemRef;
        }

        public RetrievalKnowledgeBaseResponseBodyResultsImageResources setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public RetrievalKnowledgeBaseResponseBodyResultsImageResources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class RetrievalKnowledgeBaseResponseBodyResults extends TeaModel {
        /**
         * <p>The list of figure or table captions associated with the chunk.</p>
         */
        @NameInMap("Captions")
        public java.util.List<String> captions;

        /**
         * <p>The list of Docling source document structured element references associated with the chunk. You can use these references to precisely locate elements in the original document.</p>
         */
        @NameInMap("DocItems")
        public java.util.List<String> docItems;

        /**
         * <p>The unique identifier of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2024FinancialReport.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The chain of section headings to which the chunk belongs.</p>
         */
        @NameInMap("Headings")
        public java.util.List<String> headings;

        /**
         * <p>The list of image resources referenced by the chunk.</p>
         */
        @NameInMap("ImageResources")
        public java.util.List<RetrievalKnowledgeBaseResponseBodyResultsImageResources> imageResources;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The list of page numbers to which the chunk belongs.</p>
         */
        @NameInMap("PageNumbers")
        public java.util.List<Integer> pageNumbers;

        /**
         * <p>The text content of the chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>Financial report</p>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <p>The index of the chunk.</p>
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

        public RetrievalKnowledgeBaseResponseBodyResults setCaptions(java.util.List<String> captions) {
            this.captions = captions;
            return this;
        }
        public java.util.List<String> getCaptions() {
            return this.captions;
        }

        public RetrievalKnowledgeBaseResponseBodyResults setDocItems(java.util.List<String> docItems) {
            this.docItems = docItems;
            return this;
        }
        public java.util.List<String> getDocItems() {
            return this.docItems;
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

        public RetrievalKnowledgeBaseResponseBodyResults setImageResources(java.util.List<RetrievalKnowledgeBaseResponseBodyResultsImageResources> imageResources) {
            this.imageResources = imageResources;
            return this;
        }
        public java.util.List<RetrievalKnowledgeBaseResponseBodyResultsImageResources> getImageResources() {
            return this.imageResources;
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
