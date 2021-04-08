// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectRequest extends TeaModel {
    // 视频文件URL地址
    @NameInMap("VideoURL")
    public String videoURL;

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

}
