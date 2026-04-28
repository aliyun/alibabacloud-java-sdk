// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageProcess extends TeaModel {
    /**
     * <p>The thumbnail processing rules for images. For more information, see the &quot;IMG implementation modes&quot; topic of Object Storage Service (OSS). Default value: image/resize,m_fill,h_128,w_128,limit_0.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0</p>
     */
    @NameInMap("image_thumbnail_process")
    public String imageThumbnailProcess;

    /**
     * <p>The thumbnail processing rules for documents. For a document, the snapshot of one of the pages in the document is used as the thumbnail. This parameter takes effect on this snapshot. Default value: image/resize,m_fill,h_128,w_128,limit_0.</p>
     * 
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0</p>
     */
    @NameInMap("office_thumbnail_process")
    public String officeThumbnailProcess;

    /**
     * <p>The thumbnail processing rules for videos. For more information, see the &quot;Video snapshots&quot; topic of OSS. Default value: video/snapshot,t_1000,f_jpg,w_0,h_0,m_fast,ar_auto.</p>
     * 
     * <strong>example:</strong>
     * <p>video/snapshot,t_1000,f_jpg,w_0,h_0,m_fast,ar_auto</p>
     */
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
