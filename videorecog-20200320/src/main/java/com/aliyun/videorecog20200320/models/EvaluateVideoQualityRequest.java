// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class EvaluateVideoQualityRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static EvaluateVideoQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateVideoQualityRequest self = new EvaluateVideoQualityRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateVideoQualityRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public EvaluateVideoQualityRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
