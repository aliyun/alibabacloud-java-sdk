// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentRequest extends TeaModel {
    // A short description of struct
    @NameInMap("VideoURL")
    public String videoURL;

    @NameInMap("Async")
    public Boolean async;

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

    public UnderstandVideoContentRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
