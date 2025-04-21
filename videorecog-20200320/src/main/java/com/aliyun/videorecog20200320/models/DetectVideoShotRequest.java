// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/DetectVideoShot/DetectVideoShot2.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/DetectVideoShot/DetectVideoShot2.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static DetectVideoShotRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotRequest self = new DetectVideoShotRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoShotRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
