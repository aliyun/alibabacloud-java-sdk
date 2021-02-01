// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("IsGif")
    public Boolean isGif;

    public static GenerateVideoCoverAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverAdvanceRequest self = new GenerateVideoCoverAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public GenerateVideoCoverAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public GenerateVideoCoverAdvanceRequest setIsGif(Boolean isGif) {
        this.isGif = isGif;
        return this;
    }
    public Boolean getIsGif() {
        return this.isGif;
    }

}
