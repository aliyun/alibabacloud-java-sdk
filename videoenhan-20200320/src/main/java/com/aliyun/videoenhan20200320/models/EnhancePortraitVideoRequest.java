// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhancePortraitVideoRequest extends TeaModel {
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
