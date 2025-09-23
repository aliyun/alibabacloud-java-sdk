// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectAdvanceRequest extends TeaModel {
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
