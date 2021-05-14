// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularVideoDepthAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("SampleRate")
    public String sampleRate;

    public static EstimateMonocularVideoDepthAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularVideoDepthAdvanceRequest self = new EstimateMonocularVideoDepthAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularVideoDepthAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public EstimateMonocularVideoDepthAdvanceRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

}
