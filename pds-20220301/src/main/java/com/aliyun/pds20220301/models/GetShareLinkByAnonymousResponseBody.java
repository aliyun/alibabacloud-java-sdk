// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkByAnonymousResponseBody extends TeaModel {
    /**
     * <p>The number of times that the shared files are visited.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("access_count")
    public Long accessCount;

    /**
     * <p>The profile picture of the user who created the share link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyunpds.com/a.jpg">https://aliyunpds.com/a.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The ID of the user who created the share link.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator_id")
    public String creatorId;

    /**
     * <p>The name of the user who created the share link. The value is masked.</p>
     * 
     * <strong>example:</strong>
     * <p>AB***CD</p>
     */
    @NameInMap("creator_name")
    public String creatorName;

    /**
     * <p>The mobile number of the user who created the share link. The value is masked.</p>
     * 
     * <strong>example:</strong>
     * <p>136****00</p>
     */
    @NameInMap("creator_phone")
    public String creatorPhone;

    /**
     * <p>Indicates whether the downloads of the shared files are prohibited.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Indicates whether the previews of the shared files are prohibited.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Indicates whether the saves of the shared files are prohibited.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The number of times that the shared files are downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("download_count")
    public Long downloadCount;

    /**
     * <p>The maximum number of times that the shared files can be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The time when the share link expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-20T06:51:27.292Z</p>
     */
    @NameInMap("expiration")
    public String expiration;

    @NameInMap("has_pwd")
    public Boolean hasPwd;

    /**
     * <p>The number of times that the shared files are previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("preview_count")
    public Long previewCount;

    /**
     * <p>The maximum number of times that the shared files can be previewed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>The number of times that the shared files are reported.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("report_count")
    public Long reportCount;

    /**
     * <p>The number of times that the shared files are saved.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("save_count")
    public Long saveCount;

    /**
     * <p>The maximum number of times that the shared files can be saved and downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("save_download_limit")
    public Long saveDownloadLimit;

    /**
     * <p>The maximum number of times that the shared files can be saved.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>The name of the share link.</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The time when the share link was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The number of times that the videos are previewed in the shared files.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("video_preview_count")
    public Long videoPreviewCount;

    public static GetShareLinkByAnonymousResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkByAnonymousResponseBody self = new GetShareLinkByAnonymousResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareLinkByAnonymousResponseBody setAccessCount(Long accessCount) {
        this.accessCount = accessCount;
        return this;
    }
    public Long getAccessCount() {
        return this.accessCount;
    }

    public GetShareLinkByAnonymousResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public GetShareLinkByAnonymousResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetShareLinkByAnonymousResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public GetShareLinkByAnonymousResponseBody setCreatorPhone(String creatorPhone) {
        this.creatorPhone = creatorPhone;
        return this;
    }
    public String getCreatorPhone() {
        return this.creatorPhone;
    }

    public GetShareLinkByAnonymousResponseBody setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public GetShareLinkByAnonymousResponseBody setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public GetShareLinkByAnonymousResponseBody setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public GetShareLinkByAnonymousResponseBody setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public GetShareLinkByAnonymousResponseBody setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public GetShareLinkByAnonymousResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public GetShareLinkByAnonymousResponseBody setHasPwd(Boolean hasPwd) {
        this.hasPwd = hasPwd;
        return this;
    }
    public Boolean getHasPwd() {
        return this.hasPwd;
    }

    public GetShareLinkByAnonymousResponseBody setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public GetShareLinkByAnonymousResponseBody setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public GetShareLinkByAnonymousResponseBody setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public GetShareLinkByAnonymousResponseBody setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public GetShareLinkByAnonymousResponseBody setSaveDownloadLimit(Long saveDownloadLimit) {
        this.saveDownloadLimit = saveDownloadLimit;
        return this;
    }
    public Long getSaveDownloadLimit() {
        return this.saveDownloadLimit;
    }

    public GetShareLinkByAnonymousResponseBody setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public GetShareLinkByAnonymousResponseBody setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public GetShareLinkByAnonymousResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public GetShareLinkByAnonymousResponseBody setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

}
