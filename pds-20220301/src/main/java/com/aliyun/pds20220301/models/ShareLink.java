// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ShareLink extends TeaModel {
    /**
     * <p>The number of times the share has been accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("access_count")
    public Long accessCount;

    /**
     * <p>The time when the share was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The creator of the share.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description of the share.</p>
     * 
     * <strong>example:</strong>
     * <p>videos</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable downloading of files in the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to disable previewing of files in the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to disable saving of files in the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The number of times the share has been downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("download_count")
    public Long downloadCount;

    /**
     * <p>The maximum number of times the share can be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The expiration time. The value is in RFC 3339 format, for example, &quot;2020-06-28T11:33:00.000+08:00&quot;. An empty string (&quot;&quot;) indicates that the share never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>Indicates whether the share has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("expired")
    public Boolean expired;

    /**
     * <p>The list of file IDs in the shared parent path.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;520b217f13adf4fc24f2191991b1664ce045b393&quot;]</p>
     */
    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    /**
     * <p>Specifies whether online editing of shared documents is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("office_editable")
    public Boolean officeEditable;

    /**
     * <p>The number of times the share has been previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("preview_count")
    public Long previewCount;

    /**
     * <p>The maximum number of times the share can be previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>The number of times the share has been reported.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("report_count")
    public Long reportCount;

    /**
     * <p>The number of times the share has been saved.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("save_count")
    public Long saveCount;

    /**
     * <p>The maximum total number of times the share can be saved and downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("save_download_limit")
    public Long saveDownloadLimit;

    /**
     * <p>The maximum number of times the share can be saved.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>Indicates whether all files in the drive are shared.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("share_all_files")
    public Boolean shareAllFiles;

    /**
     * <p>The share ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The share name. By default, the name of the first file is used.</p>
     * 
     * <strong>example:</strong>
     * <p>video-1.MP4</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The extraction code, which is 0 to 64 characters in length. A length of 0 indicates that no extraction code is set.</p>
     * 
     * <strong>example:</strong>
     * <p>abcF123x</p>
     */
    @NameInMap("share_pwd")
    public String sharePwd;

    /**
     * <p>The status of the share. Valid values:</p>
     * <ul>
     * <li>disabled: Canceled.</li>
     * <li>enabled: Active.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the share was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The number of times audio and video files in the share have been played.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public ShareLink setOfficeEditable(Boolean officeEditable) {
        this.officeEditable = officeEditable;
        return this;
    }
    public Boolean getOfficeEditable() {
        return this.officeEditable;
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

    public ShareLink setSaveDownloadLimit(Long saveDownloadLimit) {
        this.saveDownloadLimit = saveDownloadLimit;
        return this;
    }
    public Long getSaveDownloadLimit() {
        return this.saveDownloadLimit;
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
