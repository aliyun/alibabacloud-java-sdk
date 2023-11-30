// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateShareLinkRequest extends TeaModel {
    /**
     * <p>The description of the share link. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to prohibit the downloads of the shared files.</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to prohibit the previews of the shared files.</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to prohibit the saves of the shared files.</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The number of times that the shared files are downloaded. The value must be greater than or equal to 0.</p>
     */
    @NameInMap("download_count")
    public Long downloadCount;

    /**
     * <p>The maximum number of times that the shared files can be downloaded. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The time when the share link expires. The time follows the RFC 3339 standard. Example: 2020-06-28T11:33:00.000+08:00. If you leave this parameter empty, the share link never expires.</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>The number of times that the shared files are previewed. The value must be greater than or equal to 0.</p>
     */
    @NameInMap("preview_count")
    public Long previewCount;

    /**
     * <p>The maximum number of times that the shared files can be previewed. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>The number of times that the shared files are reported. The value must be greater than or equal to 0.</p>
     */
    @NameInMap("report_count")
    public Long reportCount;

    /**
     * <p>The number of times that the shared files are saved. The value must be greater than or equal to 0.</p>
     */
    @NameInMap("save_count")
    public Long saveCount;

    /**
     * <p>The maximum number of times that the shared files can be saved. The value must be greater than or equal to 0. A value of 0 specifies that the number is unlimited.</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>The share ID.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The name of the share link. By default, the name of the first file is used. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The access code. The access code can be up to 64 characters in length. A value of 0 specifies an empty string.</p>
     */
    @NameInMap("share_pwd")
    public String sharePwd;

    /**
     * <p>The state of the share link. Valid values:</p>
     * <br>
     * <p>*   disabled: The share link is canceled.</p>
     * <p>*   enabled: The share link is effective.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The number of times that the videos are previewed in the shared files. The value must be greater than or equal to 0.</p>
     */
    @NameInMap("video_preview_count")
    public Long videoPreviewCount;

    public static UpdateShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareLinkRequest self = new UpdateShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShareLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateShareLinkRequest setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public UpdateShareLinkRequest setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public UpdateShareLinkRequest setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public UpdateShareLinkRequest setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public UpdateShareLinkRequest setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public UpdateShareLinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateShareLinkRequest setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public UpdateShareLinkRequest setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public UpdateShareLinkRequest setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public UpdateShareLinkRequest setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public UpdateShareLinkRequest setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public UpdateShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public UpdateShareLinkRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public UpdateShareLinkRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public UpdateShareLinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateShareLinkRequest setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

}
