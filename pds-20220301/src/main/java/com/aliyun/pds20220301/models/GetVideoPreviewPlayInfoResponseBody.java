// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    @NameInMap("master_url")
    public String masterUrl;

    @NameInMap("message")
    public String message;

    /**
     * <p>The share ID.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The information about video playback.</p>
     */
    @NameInMap("video_preview_play_info")
    public VideoPreviewPlayInfo videoPreviewPlayInfo;

    public static GetVideoPreviewPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayInfoResponseBody self = new GetVideoPreviewPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoPreviewPlayInfoResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetVideoPreviewPlayInfoResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetVideoPreviewPlayInfoResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetVideoPreviewPlayInfoResponseBody setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
        return this;
    }
    public String getMasterUrl() {
        return this.masterUrl;
    }

    public GetVideoPreviewPlayInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoPreviewPlayInfoResponseBody setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetVideoPreviewPlayInfoResponseBody setVideoPreviewPlayInfo(VideoPreviewPlayInfo videoPreviewPlayInfo) {
        this.videoPreviewPlayInfo = videoPreviewPlayInfo;
        return this;
    }
    public VideoPreviewPlayInfo getVideoPreviewPlayInfo() {
        return this.videoPreviewPlayInfo;
    }

}
