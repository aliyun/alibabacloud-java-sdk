// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageProcess extends TeaModel {
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    @NameInMap("video_thumbnail_process")
    public String videoThumbnailProcess;

    public static ImageProcess build(java.util.Map<String, ?> map) throws Exception {
        ImageProcess self = new ImageProcess();
        return TeaModel.build(map, self);
    }

    public ImageProcess setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public ImageProcess setOfficeThumbnailProcess(String officeThumbnailProcess) {
        this.officeThumbnailProcess = officeThumbnailProcess;
        return this;
    }
    public String getOfficeThumbnailProcess() {
        return this.officeThumbnailProcess;
    }

    public ImageProcess setVideoThumbnailProcess(String videoThumbnailProcess) {
        this.videoThumbnailProcess = videoThumbnailProcess;
        return this;
    }
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

}
