// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFileShardsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-xxxx-xxxx-xxxx-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The shard information.</p>
     */
    @NameInMap("Shards")
    public java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShards> shards;

    /**
     * <p>The total number of records.</p>
     * 
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

    public static class DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources extends TeaModel {
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

        public static DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources self = new DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources setDocumentIndex(Integer documentIndex) {
            this.documentIndex = documentIndex;
            return this;
        }
        public Integer getDocumentIndex() {
            return this.documentIndex;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources setItemRef(String itemRef) {
            this.itemRef = itemRef;
            return this;
        }
        public String getItemRef() {
            return this.itemRef;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeKnowledgeBaseFileShardsResponseBodyShards extends TeaModel {
        /**
         * <p>The list of figure or table captions associated with the shard.</p>
         */
        @NameInMap("Captions")
        public java.util.List<String> captions;

        /**
         * <p>The list of Docling source document structured element references associated with the shard. You can use these references to precisely locate original document elements.</p>
         */
        @NameInMap("DocItems")
        public java.util.List<String> docItems;

        /**
         * <p>The chain of section headings to which the shard belongs.</p>
         */
        @NameInMap("Headings")
        public java.util.List<String> headings;

        /**
         * <p>The list of image resources referenced by the shard.</p>
         */
        @NameInMap("ImageResources")
        public java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources> imageResources;

        /**
         * <p>The list of page numbers to which the shard belongs.</p>
         */
        @NameInMap("PageNumbers")
        public java.util.List<String> pageNumbers;

        /**
         * <p>The text content of the shard.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ShardContent")
        public String shardContent;

        /**
         * <p>The index of the shard.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShardIndex")
        public Integer shardIndex;

        public static DescribeKnowledgeBaseFileShardsResponseBodyShards build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFileShardsResponseBodyShards self = new DescribeKnowledgeBaseFileShardsResponseBodyShards();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setCaptions(java.util.List<String> captions) {
            this.captions = captions;
            return this;
        }
        public java.util.List<String> getCaptions() {
            return this.captions;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setDocItems(java.util.List<String> docItems) {
            this.docItems = docItems;
            return this;
        }
        public java.util.List<String> getDocItems() {
            return this.docItems;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setHeadings(java.util.List<String> headings) {
            this.headings = headings;
            return this;
        }
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        public DescribeKnowledgeBaseFileShardsResponseBodyShards setImageResources(java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources> imageResources) {
            this.imageResources = imageResources;
            return this;
        }
        public java.util.List<DescribeKnowledgeBaseFileShardsResponseBodyShardsImageResources> getImageResources() {
            return this.imageResources;
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
