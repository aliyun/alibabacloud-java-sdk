// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("BitRate")
    public Integer bitRate;

    public static SuperResolveVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoRequest self = new SuperResolveVideoRequest();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public SuperResolveVideoRequest setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public Integer getBitRate() {
        return this.bitRate;
    }

}
