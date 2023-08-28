// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ViewFile extends TeaModel {
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

    @NameInMap("fields")
    public java.util.Map<String, ?> fields;

    @NameInMap("file_extension")
    public String fileExtension;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("file_revision_id")
    public String fileRevisionId;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("investigation_info")
    public ViewFileInvestigationInfo investigationInfo;

    @NameInMap("joined_at")
    public Long joinedAt;

    @NameInMap("labels")
    public java.util.List<String> labels;

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

    @NameInMap("thumbnail_urls")
    public java.util.Map<String, String> thumbnailUrls;

    @NameInMap("trashed_at")
    public String trashedAt;

    @NameInMap("type")
    public String type;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("upload_id")
    public String uploadId;

    @NameInMap("view_id")
    public String viewId;

    public static ViewFile build(java.util.Map<String, ?> map) throws Exception {
        ViewFile self = new ViewFile();
        return TeaModel.build(map, self);
    }

    public ViewFile setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ViewFile setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public ViewFile setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public ViewFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ViewFile setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public ViewFile setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ViewFile setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ViewFile setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ViewFile setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public ViewFile setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ViewFile setFields(java.util.Map<String, ?> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.Map<String, ?> getFields() {
        return this.fields;
    }

    public ViewFile setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public ViewFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ViewFile setFileRevisionId(String fileRevisionId) {
        this.fileRevisionId = fileRevisionId;
        return this;
    }
    public String getFileRevisionId() {
        return this.fileRevisionId;
    }

    public ViewFile setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public ViewFile setInvestigationInfo(ViewFileInvestigationInfo investigationInfo) {
        this.investigationInfo = investigationInfo;
        return this;
    }
    public ViewFileInvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    public ViewFile setJoinedAt(Long joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }
    public Long getJoinedAt() {
        return this.joinedAt;
    }

    public ViewFile setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public ViewFile setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public ViewFile setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public ViewFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ViewFile setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public ViewFile setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public ViewFile setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ViewFile setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public ViewFile setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ViewFile setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public ViewFile setThumbnailUrls(java.util.Map<String, String> thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
        return this;
    }
    public java.util.Map<String, String> getThumbnailUrls() {
        return this.thumbnailUrls;
    }

    public ViewFile setTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
    public String getTrashedAt() {
        return this.trashedAt;
    }

    public ViewFile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ViewFile setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ViewFile setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public ViewFile setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

    public static class ViewFileInvestigationInfo extends TeaModel {
        @NameInMap("status")
        public Long status;

        @NameInMap("suggestion")
        public String suggestion;

        public static ViewFileInvestigationInfo build(java.util.Map<String, ?> map) throws Exception {
            ViewFileInvestigationInfo self = new ViewFileInvestigationInfo();
            return TeaModel.build(map, self);
        }

        public ViewFileInvestigationInfo setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ViewFileInvestigationInfo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
