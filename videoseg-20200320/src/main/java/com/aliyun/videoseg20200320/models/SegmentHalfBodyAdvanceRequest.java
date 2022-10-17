// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static SegmentHalfBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyAdvanceRequest self = new SegmentHalfBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHalfBodyAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
