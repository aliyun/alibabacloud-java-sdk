// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoResponseBody extends TeaModel {
    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fileid1</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The share ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
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
