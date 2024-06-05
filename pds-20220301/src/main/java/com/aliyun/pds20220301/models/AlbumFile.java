// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AlbumFile extends TeaModel {
    @NameInMap("album_id")
    public String albumId;

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

    @NameInMap("ex_fields_info")
    public java.util.Map<String, ?> exFieldsInfo;

    @NameInMap("file_extension")
    public String fileExtension;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("image_media_metadata")
    public ImageMediaMetadata imageMediaMetadata;

    @NameInMap("investigation_info")
    public InvestigationInfo investigationInfo;

    @NameInMap("joined_at")
    public Long joinedAt;

    @NameInMap("labels")
    public java.util.List<String> labels;

    @NameInMap("local_created_at")
    public String localCreatedAt;

    @NameInMap("local_modified_at")
    public String localModifiedAt;

    @NameInMap("mime_type")
    public String mimeType;

    @NameInMap("name")
    public String name;

    @NameInMap("object_uri")
    public String objectUri;

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

    @NameInMap("transhed_at")
    public String transhedAt;

    @NameInMap("type")
    public String type;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("upload_id")
    public String uploadId;

    @NameInMap("user_meta")
    public String userMeta;

    public static AlbumFile build(java.util.Map<String, ?> map) throws Exception {
        AlbumFile self = new AlbumFile();
        return TeaModel.build(map, self);
    }

    public AlbumFile setAlbumId(String albumId) {
        this.albumId = albumId;
        return this;
    }
    public String getAlbumId() {
        return this.albumId;
    }

    public AlbumFile setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public AlbumFile setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public AlbumFile setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public AlbumFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public AlbumFile setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public AlbumFile setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AlbumFile setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlbumFile setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AlbumFile setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public AlbumFile setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public AlbumFile setExFieldsInfo(java.util.Map<String, ?> exFieldsInfo) {
        this.exFieldsInfo = exFieldsInfo;
        return this;
    }
    public java.util.Map<String, ?> getExFieldsInfo() {
        return this.exFieldsInfo;
    }

    public AlbumFile setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public AlbumFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AlbumFile setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    public Boolean getHidden() {
        return this.hidden;
    }

    public AlbumFile setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
        return this;
    }
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    public AlbumFile setInvestigationInfo(InvestigationInfo investigationInfo) {
        this.investigationInfo = investigationInfo;
        return this;
    }
    public InvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    public AlbumFile setJoinedAt(Long joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }
    public Long getJoinedAt() {
        return this.joinedAt;
    }

    public AlbumFile setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public AlbumFile setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
        return this;
    }
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public AlbumFile setLocalModifiedAt(String localModifiedAt) {
        this.localModifiedAt = localModifiedAt;
        return this;
    }
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    public AlbumFile setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
    public String getMimeType() {
        return this.mimeType;
    }

    public AlbumFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlbumFile setObjectUri(String objectUri) {
        this.objectUri = objectUri;
        return this;
    }
    public String getObjectUri() {
        return this.objectUri;
    }

    public AlbumFile setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public AlbumFile setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public AlbumFile setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public AlbumFile setStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }
    public Boolean getStarred() {
        return this.starred;
    }

    public AlbumFile setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AlbumFile setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public AlbumFile setThumbnailUrls(java.util.Map<String, String> thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
        return this;
    }
    public java.util.Map<String, String> getThumbnailUrls() {
        return this.thumbnailUrls;
    }

    public AlbumFile setTranshedAt(String transhedAt) {
        this.transhedAt = transhedAt;
        return this;
    }
    public String getTranshedAt() {
        return this.transhedAt;
    }

    public AlbumFile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AlbumFile setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public AlbumFile setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public AlbumFile setUserMeta(String userMeta) {
        this.userMeta = userMeta;
        return this;
    }
    public String getUserMeta() {
        return this.userMeta;
    }

}
