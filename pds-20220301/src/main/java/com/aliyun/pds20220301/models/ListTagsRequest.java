// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListTagsRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The method that is used to generate the thumbnail of an image.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,w_200</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The method that is used to generate the thumbnail of a video.</p>
     * 
     * <strong>example:</strong>
     * <p>video/snapshot,t_7000,f_jpg,w_800,h_600,m_fast</p>
     */
    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static ListTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsRequest self = new ListTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListTagsRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public ListTagsRequest setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
