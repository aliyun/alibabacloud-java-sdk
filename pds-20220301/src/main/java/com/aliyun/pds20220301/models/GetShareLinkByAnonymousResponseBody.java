// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkByAnonymousResponseBody extends TeaModel {
    @NameInMap("access_count")
    public Long accessCount;

    @NameInMap("avatar")
    public String avatar;

    @NameInMap("creator_id")
    public String creatorId;

    @NameInMap("creator_name")
    public String creatorName;

    @NameInMap("creator_phone")
    public String creatorPhone;

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

    @NameInMap("expiration")
    public String expiration;

    @NameInMap("preview_count")
    public Long previewCount;

    @NameInMap("preview_limit")
    public Long previewLimit;

    @NameInMap("report_count")
    public Long reportCount;

    @NameInMap("save_count")
    public Long saveCount;

    @NameInMap("save_download_limit")
    public Long saveDownloadLimit;

    @NameInMap("save_limit")
    public Long saveLimit;

    @NameInMap("share_name")
    public String shareName;

    @NameInMap("updated_at")
    public String updatedAt;

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
