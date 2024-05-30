// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ReduceVideoNoiseAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static ReduceVideoNoiseAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReduceVideoNoiseAdvanceRequest self = new ReduceVideoNoiseAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ReduceVideoNoiseAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
