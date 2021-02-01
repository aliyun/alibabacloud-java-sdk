// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Async")
    public Boolean async;

    public static SegmentVideoBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyAdvanceRequest self = new SegmentVideoBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentVideoBodyAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public SegmentVideoBodyAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
