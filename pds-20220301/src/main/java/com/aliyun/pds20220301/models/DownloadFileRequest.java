// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DownloadFileRequest extends TeaModel {
    /**
     * <p>The ID of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The image processing style. Specifying this parameter redirects the request to the URL of the processed thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The document processing style. Specifying this parameter redirects the request to the URL of the processed thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_lfit,w_256,limit_0/format,jpg|image/format,webp</p>
     */
    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    /**
     * <p>The ID of the share. If you access a file by using a share link, you must authenticate with the <code>x-share-token</code> header and specify this parameter. In this case, the <code>drive_id</code> parameter is not applicable. Otherwise, you must authenticate by using <code>AK/SK</code> or an <code>access_token</code> and specify the <code>drive_id</code> parameter. You must specify either <code>share_id</code> or <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The video processing style. Specifying this parameter redirects the request to the URL of the processed thumbnail.</p>
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
