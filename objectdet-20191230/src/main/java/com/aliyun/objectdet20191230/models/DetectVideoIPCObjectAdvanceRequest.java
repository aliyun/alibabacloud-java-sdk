// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectAdvanceRequest extends TeaModel {
    @NameInMap("CallbackOnlyHasObject")
    public Boolean callbackOnlyHasObject;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static DetectVideoIPCObjectAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectAdvanceRequest self = new DetectVideoIPCObjectAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectAdvanceRequest setCallbackOnlyHasObject(Boolean callbackOnlyHasObject) {
        this.callbackOnlyHasObject = callbackOnlyHasObject;
        return this;
    }
    public Boolean getCallbackOnlyHasObject() {
        return this.callbackOnlyHasObject;
    }

    public DetectVideoIPCObjectAdvanceRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DetectVideoIPCObjectAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
