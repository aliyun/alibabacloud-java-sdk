// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppStreamingOutTemplateShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("StreamingOutTemplate")
    public String streamingOutTemplateShrink;

    public static CreateAppStreamingOutTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppStreamingOutTemplateShrinkRequest self = new CreateAppStreamingOutTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppStreamingOutTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppStreamingOutTemplateShrinkRequest setStreamingOutTemplateShrink(String streamingOutTemplateShrink) {
        this.streamingOutTemplateShrink = streamingOutTemplateShrink;
        return this;
    }
    public String getStreamingOutTemplateShrink() {
        return this.streamingOutTemplateShrink;
    }

}
