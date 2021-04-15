// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectRequest extends TeaModel {
    // 视频文件URL地址
    @NameInMap("VideoURL")
    public String videoURL;

    // 视频的开始时间戳(秒)，即UTC时间，默认为0
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DetectVideoIPCObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectRequest self = new DetectVideoIPCObjectRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

    public DetectVideoIPCObjectRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
