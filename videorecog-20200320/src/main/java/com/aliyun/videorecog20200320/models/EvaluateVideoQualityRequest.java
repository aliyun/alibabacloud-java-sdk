// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class EvaluateVideoQualityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vqa_plus</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://public-vigen-video.oss-cn-shanghai.aliyuncs.com/Common/xxx/dont_delete/decaption/123.mp4">http://public-vigen-video.oss-cn-shanghai.aliyuncs.com/Common/xxx/dont_delete/decaption/123.mp4</a></p>
     */
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
