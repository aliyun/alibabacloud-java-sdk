// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ReduceVideoNoiseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static ReduceVideoNoiseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReduceVideoNoiseRequest self = new ReduceVideoNoiseRequest();
        return TeaModel.build(map, self);
    }

    public ReduceVideoNoiseRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
