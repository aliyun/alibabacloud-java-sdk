// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverRequest extends TeaModel {
    @NameInMap("IsGif")
    public Boolean isGif;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static GenerateVideoCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverRequest self = new GenerateVideoCoverRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverRequest setIsGif(Boolean isGif) {
        this.isGif = isGif;
        return this;
    }
    public Boolean getIsGif() {
        return this.isGif;
    }

    public GenerateVideoCoverRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
