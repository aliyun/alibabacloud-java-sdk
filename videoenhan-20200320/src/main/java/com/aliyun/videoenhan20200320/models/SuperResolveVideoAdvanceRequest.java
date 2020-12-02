// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("BitRate")
    public Integer bitRate;

    public static SuperResolveVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoAdvanceRequest self = new SuperResolveVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public SuperResolveVideoAdvanceRequest setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public Integer getBitRate() {
        return this.bitRate;
    }

}
