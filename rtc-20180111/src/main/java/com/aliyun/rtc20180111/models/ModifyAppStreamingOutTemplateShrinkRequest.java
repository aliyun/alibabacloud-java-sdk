// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("StreamingOutTemplate")
    public String streamingOutTemplateShrink;

    public static ModifyAppStreamingOutTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppStreamingOutTemplateShrinkRequest self = new ModifyAppStreamingOutTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppStreamingOutTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppStreamingOutTemplateShrinkRequest setStreamingOutTemplateShrink(String streamingOutTemplateShrink) {
        this.streamingOutTemplateShrink = streamingOutTemplateShrink;
        return this;
    }
    public String getStreamingOutTemplateShrink() {
        return this.streamingOutTemplateShrink;
    }

}
