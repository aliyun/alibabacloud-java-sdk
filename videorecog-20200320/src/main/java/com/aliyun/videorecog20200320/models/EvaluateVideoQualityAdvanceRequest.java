// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class EvaluateVideoQualityAdvanceRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static EvaluateVideoQualityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateVideoQualityAdvanceRequest self = new EvaluateVideoQualityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateVideoQualityAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public EvaluateVideoQualityAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
