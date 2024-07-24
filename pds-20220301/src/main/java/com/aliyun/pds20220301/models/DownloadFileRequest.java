// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DownloadFileRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The method used to generate the thumbnail of an image. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The method used to generate the thumbnail of a document. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,w_200</p>
     */
    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The method used to generate the thumbnail of a video. If this parameter is specified, you are redirected to the URL of the generated thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
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
