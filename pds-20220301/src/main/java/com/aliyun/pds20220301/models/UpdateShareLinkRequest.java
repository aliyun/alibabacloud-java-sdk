// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateShareLinkRequest extends TeaModel {
    /**
     * <p>The description of the share link, which can be up to 1,024 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Complete lecture series</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Whether to prevent users from downloading files from the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Whether to disable previews for the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Whether to prevent users from saving files from the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The download count. The value must be greater than or equal to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("download_count")
    public Long downloadCount;

    /**
     * <p>The maximum number of times the shared content can be downloaded. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The expiration time. The value must be in RFC 3339 format, for example, <code>2020-06-28T11:33:00.000+08:00</code>. An empty string (&quot;&quot;) indicates that the share link never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>Whether to allow online editing of the shared documents.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("office_editable")
    public Boolean officeEditable;

    /**
     * <p>The preview count. The value must be greater than or equal to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("preview_count")
    public Long previewCount;

    /**
     * <p>The maximum number of times the shared content can be previewed. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>The report count. The value must be greater than or equal to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("report_count")
    public Long reportCount;

    /**
     * <p>The save count. The value must be greater than or equal to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("save_count")
    public Long saveCount;

    /**
     * <p>The maximum number of times the shared content can be saved. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>The share ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The share name. If not specified, the name of the first file is used by default. The name must be 0 to 128 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Lecture-1.mp4</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The share password. The password must be 0 to 64 characters long. An empty string (&quot;&quot;) indicates no password is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abcF123x</p>
     */
    @NameInMap("share_pwd")
    public String sharePwd;

    /**
     * <p>The status of the share link. Valid values:</p>
     * <ul>
     * <li><p><code>disabled</code>: The share is canceled.</p>
     * </li>
     * <li><p><code>enabled</code>: The share is active.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The video preview count. The value must be greater than or equal to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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

    public UpdateShareLinkRequest setOfficeEditable(Boolean officeEditable) {
        this.officeEditable = officeEditable;
        return this;
    }
    public Boolean getOfficeEditable() {
        return this.officeEditable;
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
