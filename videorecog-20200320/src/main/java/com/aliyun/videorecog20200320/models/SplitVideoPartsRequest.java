// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsRequest extends TeaModel {
    @NameInMap("Template")
    public String template;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static SplitVideoPartsRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsRequest self = new SplitVideoPartsRequest();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SplitVideoPartsRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
