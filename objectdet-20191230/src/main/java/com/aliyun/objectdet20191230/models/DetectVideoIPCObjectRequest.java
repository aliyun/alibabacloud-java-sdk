// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectRequest extends TeaModel {
    @NameInMap("CallbackOnlyHasObject")
    public Boolean callbackOnlyHasObject;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("VideoURL")
    public String videoURL;

    public static DetectVideoIPCObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectRequest self = new DetectVideoIPCObjectRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectRequest setCallbackOnlyHasObject(Boolean callbackOnlyHasObject) {
        this.callbackOnlyHasObject = callbackOnlyHasObject;
        return this;
    }
    public Boolean getCallbackOnlyHasObject() {
        return this.callbackOnlyHasObject;
    }

    public DetectVideoIPCObjectRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DetectVideoIPCObjectRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
