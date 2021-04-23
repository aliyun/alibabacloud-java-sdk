// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoVideoDepthAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("SampleRate")
    public String sampleRate;

    public static EstimateStereoVideoDepthAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoVideoDepthAdvanceRequest self = new EstimateStereoVideoDepthAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EstimateStereoVideoDepthAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public EstimateStereoVideoDepthAdvanceRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

}
