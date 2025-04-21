// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/UnderstandVideoContent/UnderstandVideoContent1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/UnderstandVideoContent/UnderstandVideoContent1.mp4</a></p>
     */
    @NameInMap("VideoURL")
    public String videoURL;

    public static UnderstandVideoContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentRequest self = new UnderstandVideoContentRequest();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
