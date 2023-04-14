// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ShareLink extends TeaModel {
    @NameInMap("access_count")
    public Long accessCount;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("description")
    public String description;

    @NameInMap("disable_download")
    public Boolean disableDownload;

    @NameInMap("disable_preview")
    public Boolean disablePreview;

    @NameInMap("disable_save")
    public Boolean disableSave;

    @NameInMap("download_count")
    public Long downloadCount;

    @NameInMap("download_limit")
    public Long downloadLimit;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("expiration")
    public String expiration;

    @NameInMap("expired")
    public Boolean expired;

    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    @NameInMap("preview_count")
    public Long previewCount;

    @NameInMap("preview_limit")
    public Long previewLimit;

    @NameInMap("report_count")
    public Long reportCount;

    @NameInMap("save_count")
    public Long saveCount;

    @NameInMap("save_limit")
    public Long saveLimit;

    @NameInMap("share_all_files")
    public Boolean shareAllFiles;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("share_name")
    public String shareName;

    @NameInMap("share_pwd")
    public String sharePwd;

    @NameInMap("status")
    public String status;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("video_preview_count")
    public Long videoPreviewCount;

    public static ShareLink build(java.util.Map<String, ?> map) throws Exception {
        ShareLink self = new ShareLink();
        return TeaModel.build(map, self);
    }

    public ShareLink setAccessCount(Long accessCount) {
        this.accessCount = accessCount;
        return this;
    }
    public Long getAccessCount() {
        return this.accessCount;
    }

    public ShareLink setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ShareLink setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ShareLink setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ShareLink setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public ShareLink setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public ShareLink setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public ShareLink setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public ShareLink setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public ShareLink setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ShareLink setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public ShareLink setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public ShareLink setFileIdList(java.util.List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }
    public java.util.List<String> getFileIdList() {
        return this.fileIdList;
    }

    public ShareLink setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public ShareLink setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public ShareLink setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public ShareLink setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public ShareLink setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public ShareLink setShareAllFiles(Boolean shareAllFiles) {
        this.shareAllFiles = shareAllFiles;
        return this;
    }
    public Boolean getShareAllFiles() {
        return this.shareAllFiles;
    }

    public ShareLink setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public ShareLink setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public ShareLink setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public ShareLink setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ShareLink setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ShareLink setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

}
