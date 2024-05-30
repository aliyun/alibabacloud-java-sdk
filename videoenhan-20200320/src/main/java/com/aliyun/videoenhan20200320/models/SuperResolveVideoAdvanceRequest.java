// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoAdvanceRequest extends TeaModel {
    @NameInMap("BitRate")
    public Integer bitRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static SuperResolveVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoAdvanceRequest self = new SuperResolveVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoAdvanceRequest setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public Integer getBitRate() {
        return this.bitRate;
    }

    public SuperResolveVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
