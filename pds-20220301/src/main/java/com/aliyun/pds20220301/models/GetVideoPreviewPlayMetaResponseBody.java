// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayMetaResponseBody extends TeaModel {
    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("video_preview_play_meta")
    public VideoPreviewPlayMeta videoPreviewPlayMeta;

    public static GetVideoPreviewPlayMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayMetaResponseBody self = new GetVideoPreviewPlayMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayMetaResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetVideoPreviewPlayMetaResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetVideoPreviewPlayMetaResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetVideoPreviewPlayMetaResponseBody setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetVideoPreviewPlayMetaResponseBody setVideoPreviewPlayMeta(VideoPreviewPlayMeta videoPreviewPlayMeta) {
        this.videoPreviewPlayMeta = videoPreviewPlayMeta;
        return this;
    }
    public VideoPreviewPlayMeta getVideoPreviewPlayMeta() {
        return this.videoPreviewPlayMeta;
    }

}
