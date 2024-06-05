// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DownloadFileRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The method used to generate the thumbnail of an image. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The method used to generate the thumbnail of a document. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     */
    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The method used to generate the thumbnail of a video. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     */
    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static DownloadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFileRequest self = new DownloadFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public DownloadFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DownloadFileRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public DownloadFileRequest setOfficeThumbnailProcess(String officeThumbnailProcess) {
        this.officeThumbnailProcess = officeThumbnailProcess;
        return this;
    }
    public String getOfficeThumbnailProcess() {
        return this.officeThumbnailProcess;
    }

    public DownloadFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public DownloadFileRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
