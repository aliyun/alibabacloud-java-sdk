// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotRequest extends TeaModel {
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
