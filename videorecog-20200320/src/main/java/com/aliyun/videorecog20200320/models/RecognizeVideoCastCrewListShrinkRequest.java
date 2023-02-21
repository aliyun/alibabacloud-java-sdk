// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListShrinkRequest extends TeaModel {
    @NameInMap("Params")
    public String paramsShrink;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static RecognizeVideoCastCrewListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListShrinkRequest self = new RecognizeVideoCastCrewListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public RecognizeVideoCastCrewListShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
