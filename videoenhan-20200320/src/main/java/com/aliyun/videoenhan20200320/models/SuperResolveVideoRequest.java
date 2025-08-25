// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BitRate")
    public Integer bitRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/SuperResolveVideo/SuperResolveVideo2.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/SuperResolveVideo/SuperResolveVideo2.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static SuperResolveVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoRequest self = new SuperResolveVideoRequest();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoRequest setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public Integer getBitRate() {
        return this.bitRate;
    }

    public SuperResolveVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
