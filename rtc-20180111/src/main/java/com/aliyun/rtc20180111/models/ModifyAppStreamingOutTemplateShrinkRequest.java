// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppStreamingOutTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Application ID. You can create and query it in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Template.</p>
     * <p>This parameter is required.</p>
     */
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
