// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    // 视频的开始时间戳(秒)，即UTC时间，默认为0
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

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

    public DetectVideoIPCObjectAdvanceRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
