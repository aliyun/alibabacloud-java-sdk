// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentGreenScreenVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static SegmentGreenScreenVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentGreenScreenVideoAdvanceRequest self = new SegmentGreenScreenVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentGreenScreenVideoAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
