// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("content_hash")
    public String contentHash;

    @NameInMap("content_hash_name")
    public String contentHashName;

    @NameInMap("content_type")
    public String contentType;

    @NameInMap("crc64_hash")
    public String crc64Hash;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("download_url")
    public String downloadUrl;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_extension")
    public String fileExtension;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("investigation_info")
    public FileInvestigationInfo investigationInfo;

    @NameInMap("labels")
    public String labels;

    @NameInMap("local_created_at")
    public String localCreatedAt;

    @NameInMap("local_modified_at")
    public String localModifiedAt;

    @NameInMap("name")
    public String name;

    @NameInMap("parent_file_id")
    public String parentFileId;

    @NameInMap("revision_id")
    public String revisionId;

    @NameInMap("size")
    public Long size;

    @NameInMap("starred")
    public Boolean starred;

    @NameInMap("status")
    public String status;

    @NameInMap("thumbnail")
    public String thumbnail;

    @NameInMap("trashed_at")
    public String trashedAt;

    @NameInMap("type")
    public String type;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("upload_id")
    public String uploadId;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public File setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public File setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public File setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public File setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public File setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public File setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public File setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public File setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public File setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public File setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public File setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public File setInvestigationInfo(FileInvestigationInfo investigationInfo) {
        this.investigationInfo = investigationInfo;
        return this;
    }
    public FileInvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    public File setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public File setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public File setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public File setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public File setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public File setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public File setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public File setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public File setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public File setTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    public String getTrashedAt() {
        return this.trashedAt;
    }

    public File setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public File setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public File setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public static class FileInvestigationInfo extends TeaModel {
        @NameInMap("status")
        public Long status;

        @NameInMap("suggestion")
        public String suggestion;

        public static FileInvestigationInfo build(java.util.Map<String, ?> map) throws Exception {
            FileInvestigationInfo self = new FileInvestigationInfo();
            return TeaModel.build(map, self);
        }

        public FileInvestigationInfo setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public FileInvestigationInfo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
