// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhancePortraitVideoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static EnhancePortraitVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhancePortraitVideoRequest self = new EnhancePortraitVideoRequest();
        return TeaModel.build(map, self);
    }

    public EnhancePortraitVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
