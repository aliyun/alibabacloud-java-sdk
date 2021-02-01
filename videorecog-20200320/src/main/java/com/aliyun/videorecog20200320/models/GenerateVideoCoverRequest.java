// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("IsGif")
    public Boolean isGif;

    public static GenerateVideoCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverRequest self = new GenerateVideoCoverRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public GenerateVideoCoverRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public GenerateVideoCoverRequest setIsGif(Boolean isGif) {
        this.isGif = isGif;
        return this;
    }
    public Boolean getIsGif() {
        return this.isGif;
    }

}
