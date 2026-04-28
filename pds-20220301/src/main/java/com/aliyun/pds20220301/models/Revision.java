// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Revision extends TeaModel {
    /**
     * <p>The hash value of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>EA4942AA8761213890A5C386F88E6464D2C31CA3</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The name of the hash algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>sha1</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The CRC64 value of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>3574582125365864471</p>
     */
    @NameInMap("crc64_hash")
    public String crc64Hash;

    /**
     * <p>The time when the version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The ID of the user who created the version.</p>
     */
    @NameInMap("creator_id")
    public String creatorId;

    /**
     * <p>The name of the user who created the version.</p>
     */
    @NameInMap("creator_name")
    public String creatorName;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The download URL. The ListRevision operation does not return this value. The GetRevision, UpdateRevision, and RestoreRevision operations return this value.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file extension.</p>
     * 
     * <strong>example:</strong>
     * <p>mov</p>
     */
    @NameInMap("file_extension")
    public String fileExtension;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Indicates whether it is the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_latest_version")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether the version is permanently retained.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("keep_forever")
    public Boolean keepForever;

    /**
     * <p>The description of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("revision_description")
    public String revisionDescription;

    /**
     * <p>The version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40CB7794C929</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    /**
     * <p>The version name.</p>
     * 
     * <strong>example:</strong>
     * <p>1.mov</p>
     */
    @NameInMap("revision_name")
    public String revisionName;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision_version")
    public Long revisionVersion;

    /**
     * <p>The version size.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The URL of the thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("thumbnail")
    public String thumbnail;

    /**
     * <p>The time when the version was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The preview URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
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
