// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class KnowledgeBaseFileChunk extends TeaModel {
    @NameInMap("ChunkAttachment")
    public java.util.List<KnowledgeBaseFileChunkChunkAttachment> chunkAttachment;

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

    @NameInMap("MetaData")
    public KnowledgeBaseFileChunkMetaData metaData;

    @NameInMap("Score")
    public Float score;

    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    public static KnowledgeBaseFileChunk build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseFileChunk self = new KnowledgeBaseFileChunk();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseFileChunk setChunkAttachment(java.util.List<KnowledgeBaseFileChunkChunkAttachment> chunkAttachment) {
        this.chunkAttachment = chunkAttachment;
        return this;
    }
    public java.util.List<KnowledgeBaseFileChunkChunkAttachment> getChunkAttachment() {
        return this.chunkAttachment;
    }

    public KnowledgeBaseFileChunk setChunkContent(String chunkContent) {
        this.chunkContent = chunkContent;
        return this;
    }
    public String getChunkContent() {
        return this.chunkContent;
    }

    public KnowledgeBaseFileChunk setChunkEnd(Integer chunkEnd) {
        this.chunkEnd = chunkEnd;
        return this;
    }
    public Integer getChunkEnd() {
        return this.chunkEnd;
    }

    public KnowledgeBaseFileChunk setChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }
    public String getChunkId() {
        return this.chunkId;
    }

    public KnowledgeBaseFileChunk setChunkSequence(Integer chunkSequence) {
        this.chunkSequence = chunkSequence;
        return this;
    }
    public Integer getChunkSequence() {
        return this.chunkSequence;
    }

    public KnowledgeBaseFileChunk setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public KnowledgeBaseFileChunk setChunkStart(Integer chunkStart) {
        this.chunkStart = chunkStart;
        return this;
    }
    public Integer getChunkStart() {
        return this.chunkStart;
    }

    public KnowledgeBaseFileChunk setChunkStatus(String chunkStatus) {
        this.chunkStatus = chunkStatus;
        return this;
    }
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    public KnowledgeBaseFileChunk setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public KnowledgeBaseFileChunk setMetaData(KnowledgeBaseFileChunkMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public KnowledgeBaseFileChunkMetaData getMetaData() {
        return this.metaData;
    }

    public KnowledgeBaseFileChunk setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public KnowledgeBaseFileChunk setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public static class KnowledgeBaseFileChunkChunkAttachment extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("PlaceholderId")
        public String placeholderId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uri")
        public String uri;

        public static KnowledgeBaseFileChunkChunkAttachment build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseFileChunkChunkAttachment self = new KnowledgeBaseFileChunkChunkAttachment();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseFileChunkChunkAttachment setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public KnowledgeBaseFileChunkChunkAttachment setPlaceholderId(String placeholderId) {
            this.placeholderId = placeholderId;
            return this;
        }
        public String getPlaceholderId() {
            return this.placeholderId;
        }

        public KnowledgeBaseFileChunkChunkAttachment setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public KnowledgeBaseFileChunkChunkAttachment setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class KnowledgeBaseFileChunkMetaData extends TeaModel {
        @NameInMap("FileMetaId")
        public String fileMetaId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUri")
        public String fileUri;

        public static KnowledgeBaseFileChunkMetaData build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseFileChunkMetaData self = new KnowledgeBaseFileChunkMetaData();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseFileChunkMetaData setFileMetaId(String fileMetaId) {
            this.fileMetaId = fileMetaId;
            return this;
        }
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        public KnowledgeBaseFileChunkMetaData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public KnowledgeBaseFileChunkMetaData setFileUri(String fileUri) {
            this.fileUri = fileUri;
            return this;
        }
        public String getFileUri() {
            return this.fileUri;
        }

    }

}
