// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CallbackOnlyHasObject")
    public Boolean callbackOnlyHasObject;

    /**
     * <strong>example:</strong>
     * <p>1629086400</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVideoIPCObject/DetectVideoIPCObject1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVideoIPCObject/DetectVideoIPCObject1.mp4</a></p>
     */
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
