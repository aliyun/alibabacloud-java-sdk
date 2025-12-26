// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class KnowledgeBaseMeta extends TeaModel {
    @NameInMap("ChunkAttachment")
    public java.util.List<KnowledgeBaseMetaChunkAttachment> chunkAttachment;

    @NameInMap("ChunkContent")
    public String chunkContent;

    @NameInMap("ChunkEnd")
    public Integer chunkEnd;

    @NameInMap("ChunkId")
    public String chunkId;

    @NameInMap("ChunkSequence")
    public Integer chunkSequence;

    @NameInMap("ChunkSize")
    public Integer chunkSize;

    @NameInMap("ChunkStart")
    public Integer chunkStart;

    @NameInMap("ChunkStatus")
    public String chunkStatus;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("FileContentType")
    public String fileContentType;

    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    @NameInMap("FileMetaData")
    public String fileMetaData;

    @NameInMap("FileMetaId")
    public String fileMetaId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public Integer fileSize;

    @NameInMap("FileStatus")
    public String fileStatus;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FileUpdateTime")
    public String fileUpdateTime;

    @NameInMap("FileUri")
    public String fileUri;

    @NameInMap("MetaData")
    public KnowledgeBaseMetaMetaData metaData;

    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    public static KnowledgeBaseMeta build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseMeta self = new KnowledgeBaseMeta();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseMeta setChunkAttachment(java.util.List<KnowledgeBaseMetaChunkAttachment> chunkAttachment) {
        this.chunkAttachment = chunkAttachment;
        return this;
    }
    public java.util.List<KnowledgeBaseMetaChunkAttachment> getChunkAttachment() {
        return this.chunkAttachment;
    }

    public KnowledgeBaseMeta setChunkContent(String chunkContent) {
        this.chunkContent = chunkContent;
        return this;
    }
    public String getChunkContent() {
        return this.chunkContent;
    }

    public KnowledgeBaseMeta setChunkEnd(Integer chunkEnd) {
        this.chunkEnd = chunkEnd;
        return this;
    }
    public Integer getChunkEnd() {
        return this.chunkEnd;
    }

    public KnowledgeBaseMeta setChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }
    public String getChunkId() {
        return this.chunkId;
    }

    public KnowledgeBaseMeta setChunkSequence(Integer chunkSequence) {
        this.chunkSequence = chunkSequence;
        return this;
    }
    public Integer getChunkSequence() {
        return this.chunkSequence;
    }

    public KnowledgeBaseMeta setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public KnowledgeBaseMeta setChunkStart(Integer chunkStart) {
        this.chunkStart = chunkStart;
        return this;
    }
    public Integer getChunkStart() {
        return this.chunkStart;
    }

    public KnowledgeBaseMeta setChunkStatus(String chunkStatus) {
        this.chunkStatus = chunkStatus;
        return this;
    }
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    public KnowledgeBaseMeta setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public KnowledgeBaseMeta setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
        return this;
    }
    public String getFileContentType() {
        return this.fileContentType;
    }

    public KnowledgeBaseMeta setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public KnowledgeBaseMeta setFileMetaData(String fileMetaData) {
        this.fileMetaData = fileMetaData;
        return this;
    }
    public String getFileMetaData() {
        return this.fileMetaData;
    }

    public KnowledgeBaseMeta setFileMetaId(String fileMetaId) {
        this.fileMetaId = fileMetaId;
        return this;
    }
    public String getFileMetaId() {
        return this.fileMetaId;
    }

    public KnowledgeBaseMeta setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KnowledgeBaseMeta setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Integer getFileSize() {
        return this.fileSize;
    }

    public KnowledgeBaseMeta setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }
    public String getFileStatus() {
        return this.fileStatus;
    }

    public KnowledgeBaseMeta setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public KnowledgeBaseMeta setFileUpdateTime(String fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
        return this;
    }
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    public KnowledgeBaseMeta setFileUri(String fileUri) {
        this.fileUri = fileUri;
        return this;
    }
    public String getFileUri() {
        return this.fileUri;
    }

    public KnowledgeBaseMeta setMetaData(KnowledgeBaseMetaMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public KnowledgeBaseMetaMetaData getMetaData() {
        return this.metaData;
    }

    public KnowledgeBaseMeta setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public static class KnowledgeBaseMetaChunkAttachment extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("PlaceholderId")
        public String placeholderId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uri")
        public String uri;

        public static KnowledgeBaseMetaChunkAttachment build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseMetaChunkAttachment self = new KnowledgeBaseMetaChunkAttachment();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseMetaChunkAttachment setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public KnowledgeBaseMetaChunkAttachment setPlaceholderId(String placeholderId) {
            this.placeholderId = placeholderId;
            return this;
        }
        public String getPlaceholderId() {
            return this.placeholderId;
        }

        public KnowledgeBaseMetaChunkAttachment setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public KnowledgeBaseMetaChunkAttachment setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class KnowledgeBaseMetaMetaData extends TeaModel {
        @NameInMap("FileMetaId")
        public String fileMetaId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUri")
        public String fileUri;

        public static KnowledgeBaseMetaMetaData build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseMetaMetaData self = new KnowledgeBaseMetaMetaData();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseMetaMetaData setFileMetaId(String fileMetaId) {
            this.fileMetaId = fileMetaId;
            return this;
        }
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        public KnowledgeBaseMetaMetaData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public KnowledgeBaseMetaMetaData setFileUri(String fileUri) {
            this.fileUri = fileUri;
            return this;
        }
        public String getFileUri() {
            return this.fileUri;
        }

    }

}
