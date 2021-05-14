// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularVideoDepthRequest extends TeaModel {
    // A short description of struct
    @NameInMap("VideoURL")
    public String videoURL;

    @NameInMap("SampleRate")
    public String sampleRate;

    public static EstimateMonocularVideoDepthRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularVideoDepthRequest self = new EstimateMonocularVideoDepthRequest();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularVideoDepthRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

    public EstimateMonocularVideoDepthRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

}
