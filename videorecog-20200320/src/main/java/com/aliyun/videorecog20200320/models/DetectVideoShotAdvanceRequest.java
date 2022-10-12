// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static DetectVideoShotAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotAdvanceRequest self = new DetectVideoShotAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoShotAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
