// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

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

}
