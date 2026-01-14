// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseChunksResponseBody extends TeaModel {
    /**
     * <p>切片列表</p>
     */
    @NameInMap("KnowledgeBaseChunks")
    public java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks> knowledgeBaseChunks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKnowledgeBaseChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseChunksResponseBody self = new ListKnowledgeBaseChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseChunksResponseBody setKnowledgeBaseChunks(java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks> knowledgeBaseChunks) {
        this.knowledgeBaseChunks = knowledgeBaseChunks;
        return this;
    }
    public java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks> getKnowledgeBaseChunks() {
        return this.knowledgeBaseChunks;
    }

    public ListKnowledgeBaseChunksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBaseChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseChunksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment extends TeaModel {
        /**
         * <p>下载地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>占位符ID</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_PLACEHOLDER_0</p>
         */
        @NameInMap("PlaceholderId")
        public String placeholderId;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>路径</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket/path/file.txt</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment self = new ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment setPlaceholderId(String placeholderId) {
            this.placeholderId = placeholderId;
            return this;
        }
        public String getPlaceholderId() {
            return this.placeholderId;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData extends TeaModel {
        /**
         * <p>文件元数据ID</p>
         * 
         * <strong>example:</strong>
         * <p>xd8e****79du</p>
         */
        @NameInMap("FileMetaId")
        public String fileMetaId;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>file1.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>文件地址</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucketpath/file1.txt</p>
         */
        @NameInMap("FileUri")
        public String fileUri;

        public static ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData self = new ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData setFileMetaId(String fileMetaId) {
            this.fileMetaId = fileMetaId;
            return this;
        }
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData setFileUri(String fileUri) {
            this.fileUri = fileUri;
            return this;
        }
        public String getFileUri() {
            return this.fileUri;
        }

    }

    public static class ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks extends TeaModel {
        /**
         * <p>切片附属信息</p>
         */
        @NameInMap("ChunkAttachment")
        public java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment> chunkAttachment;

        /**
         * <p>切片内容</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("ChunkContent")
        public String chunkContent;

        /**
         * <p>切片结束位置</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("ChunkEnd")
        public Integer chunkEnd;

        /**
         * <p>切片顺序</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChunkSequence")
        public Integer chunkSequence;

        /**
         * <p>切片大小</p>
         * 
         * <strong>example:</strong>
         * <p>1873</p>
         */
        @NameInMap("ChunkSize")
        public Integer chunkSize;

        /**
         * <p>切片起始位置</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChunkStart")
        public Integer chunkStart;

        /**
         * <p>切片状态</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("ChunkStatus")
        public String chunkStatus;

        /**
         * <p>切片下载地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>切片ID</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        @NameInMap("KnowledgeBaseChunkId")
        public String knowledgeBaseChunkId;

        /**
         * <p>知识库ID</p>
         * 
         * <strong>example:</strong>
         * <p>d-ix****o9</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>原始文件信息</p>
         */
        @NameInMap("MetaData")
        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData metaData;

        /**
         * <p>切片缩略图</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <p>知识库版本</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks self = new ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkAttachment(java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment> chunkAttachment) {
            this.chunkAttachment = chunkAttachment;
            return this;
        }
        public java.util.List<ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksChunkAttachment> getChunkAttachment() {
            return this.chunkAttachment;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkContent(String chunkContent) {
            this.chunkContent = chunkContent;
            return this;
        }
        public String getChunkContent() {
            return this.chunkContent;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkEnd(Integer chunkEnd) {
            this.chunkEnd = chunkEnd;
            return this;
        }
        public Integer getChunkEnd() {
            return this.chunkEnd;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkSequence(Integer chunkSequence) {
            this.chunkSequence = chunkSequence;
            return this;
        }
        public Integer getChunkSequence() {
            return this.chunkSequence;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkStart(Integer chunkStart) {
            this.chunkStart = chunkStart;
            return this;
        }
        public Integer getChunkStart() {
            return this.chunkStart;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setChunkStatus(String chunkStatus) {
            this.chunkStatus = chunkStatus;
            return this;
        }
        public String getChunkStatus() {
            return this.chunkStatus;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setKnowledgeBaseChunkId(String knowledgeBaseChunkId) {
            this.knowledgeBaseChunkId = knowledgeBaseChunkId;
            return this;
        }
        public String getKnowledgeBaseChunkId() {
            return this.knowledgeBaseChunkId;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setMetaData(ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunksMetaData getMetaData() {
            return this.metaData;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public ListKnowledgeBaseChunksResponseBodyKnowledgeBaseChunks setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
