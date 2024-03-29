// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularVideoDepthRequest extends TeaModel {
    @NameInMap("SampleRate")
    public String sampleRate;

    @NameInMap("VideoURL")
    public String videoURL;

    public static EstimateMonocularVideoDepthRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularVideoDepthRequest self = new EstimateMonocularVideoDepthRequest();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularVideoDepthRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

    public EstimateMonocularVideoDepthRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
