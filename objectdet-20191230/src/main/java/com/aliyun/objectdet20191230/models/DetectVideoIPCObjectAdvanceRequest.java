// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    public static DetectVideoIPCObjectAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectAdvanceRequest self = new DetectVideoIPCObjectAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
