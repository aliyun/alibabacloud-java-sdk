// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class KnowledgeFile extends TeaModel {
    @NameInMap("creator_id")
    public String creatorId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_category")
    public String fileCategory;

    @NameInMap("file_created_at")
    public Long fileCreatedAt;

    @NameInMap("file_creator_id")
    public String fileCreatorId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("file_image_time")
    public Long fileImageTime;

    @NameInMap("file_name")
    public String fileName;

    @NameInMap("file_name_path")
    public String fileNamePath;

    @NameInMap("file_size")
    public Long fileSize;

    @NameInMap("file_updated_at")
    public Long fileUpdatedAt;

    @NameInMap("joined_at")
    public Long joinedAt;

    @NameInMap("knowledge_base_id")
    public String knowledgeBaseId;

    @NameInMap("knowledge_category_id")
    public String knowledgeCategoryId;

    @NameInMap("revision_id")
    public String revisionId;

    public static KnowledgeFile build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeFile self = new KnowledgeFile();
        return TeaModel.build(map, self);
    }

    public KnowledgeFile setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public KnowledgeFile setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public KnowledgeFile setFileCategory(String fileCategory) {
        this.fileCategory = fileCategory;
        return this;
    }
    public String getFileCategory() {
        return this.fileCategory;
    }

    public KnowledgeFile setFileCreatedAt(Long fileCreatedAt) {
        this.fileCreatedAt = fileCreatedAt;
        return this;
    }
    public Long getFileCreatedAt() {
        return this.fileCreatedAt;
    }

    public KnowledgeFile setFileCreatorId(String fileCreatorId) {
        this.fileCreatorId = fileCreatorId;
        return this;
    }
    public String getFileCreatorId() {
        return this.fileCreatorId;
    }

    public KnowledgeFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public KnowledgeFile setFileImageTime(Long fileImageTime) {
        this.fileImageTime = fileImageTime;
        return this;
    }
    public Long getFileImageTime() {
        return this.fileImageTime;
    }

    public KnowledgeFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KnowledgeFile setFileNamePath(String fileNamePath) {
        this.fileNamePath = fileNamePath;
        return this;
    }
    public String getFileNamePath() {
        return this.fileNamePath;
    }

    public KnowledgeFile setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public KnowledgeFile setFileUpdatedAt(Long fileUpdatedAt) {
        this.fileUpdatedAt = fileUpdatedAt;
        return this;
    }
    public Long getFileUpdatedAt() {
        return this.fileUpdatedAt;
    }

    public KnowledgeFile setJoinedAt(Long joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }
    public Long getJoinedAt() {
        return this.joinedAt;
    }

    public KnowledgeFile setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeFile setKnowledgeCategoryId(String knowledgeCategoryId) {
        this.knowledgeCategoryId = knowledgeCategoryId;
        return this;
    }
    public String getKnowledgeCategoryId() {
        return this.knowledgeCategoryId;
    }

    public KnowledgeFile setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
