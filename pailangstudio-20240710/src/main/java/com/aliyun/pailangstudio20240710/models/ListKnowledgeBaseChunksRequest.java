// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseChunksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("ChunkStatus")
    public String chunkStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MetaData")
    public ListKnowledgeBaseChunksRequestMetaData metaData;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static ListKnowledgeBaseChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseChunksRequest self = new ListKnowledgeBaseChunksRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseChunksRequest setChunkStatus(String chunkStatus) {
        this.chunkStatus = chunkStatus;
        return this;
    }
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    public ListKnowledgeBaseChunksRequest setMetaData(ListKnowledgeBaseChunksRequestMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public ListKnowledgeBaseChunksRequestMetaData getMetaData() {
        return this.metaData;
    }

    public ListKnowledgeBaseChunksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKnowledgeBaseChunksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeBaseChunksRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class ListKnowledgeBaseChunksRequestMetaData extends TeaModel {
        /**
         * <p>文件元数据ID</p>
         * 
         * <strong>example:</strong>
         * <p>xd8e****79du</p>
         */
        @NameInMap("FileMetaId")
        public String fileMetaId;

        /**
         * <p>文件地址</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucketpath/file1.txt</p>
         */
        @NameInMap("FileUri")
        public String fileUri;

        public static ListKnowledgeBaseChunksRequestMetaData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseChunksRequestMetaData self = new ListKnowledgeBaseChunksRequestMetaData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseChunksRequestMetaData setFileMetaId(String fileMetaId) {
            this.fileMetaId = fileMetaId;
            return this;
        }
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        public ListKnowledgeBaseChunksRequestMetaData setFileUri(String fileUri) {
            this.fileUri = fileUri;
            return this;
        }
        public String getFileUri() {
            return this.fileUri;
        }

    }

}
