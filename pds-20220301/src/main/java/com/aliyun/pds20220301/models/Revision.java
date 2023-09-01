// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Revision extends TeaModel {
    @NameInMap("content_hash")
    public String contentHash;

    @NameInMap("content_hash_name")
    public String contentHashName;

    @NameInMap("crc64_hash")
    public String crc64Hash;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator_id")
    public String creatorId;

    @NameInMap("creator_name")
    public String creatorName;

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

    @NameInMap("is_latest_version")
    public Boolean isLatestVersion;

    @NameInMap("keep_forever")
    public Boolean keepForever;

    @NameInMap("revision_description")
    public String revisionDescription;

    @NameInMap("revision_id")
    public String revisionId;

    @NameInMap("revision_name")
    public String revisionName;

    @NameInMap("revision_version")
    public Long revisionVersion;

    @NameInMap("size")
    public Long size;

    @NameInMap("thumbnail")
    public String thumbnail;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("url")
    public String url;

    public static Revision build(java.util.Map<String, ?> map) throws Exception {
        Revision self = new Revision();
        return TeaModel.build(map, self);
    }

    public Revision setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public Revision setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public Revision setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public Revision setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Revision setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public Revision setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public Revision setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Revision setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Revision setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public Revision setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public Revision setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public Revision setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public Revision setKeepForever(Boolean keepForever) {
        this.keepForever = keepForever;
        return this;
    }
    public Boolean getKeepForever() {
        return this.keepForever;
    }

    public Revision setRevisionDescription(String revisionDescription) {
        this.revisionDescription = revisionDescription;
        return this;
    }
    public String getRevisionDescription() {
        return this.revisionDescription;
    }

    public Revision setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public Revision setRevisionName(String revisionName) {
        this.revisionName = revisionName;
        return this;
    }
    public String getRevisionName() {
        return this.revisionName;
    }

    public Revision setRevisionVersion(Long revisionVersion) {
        this.revisionVersion = revisionVersion;
        return this;
    }
    public Long getRevisionVersion() {
        return this.revisionVersion;
    }

    public Revision setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public Revision setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public Revision setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Revision setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
