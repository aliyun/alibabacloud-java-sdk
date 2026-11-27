// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppStreamingOutTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The stream ingest template information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamingOutTemplate")
    public String streamingOutTemplateShrink;

    public static DeleteAppStreamingOutTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppStreamingOutTemplateShrinkRequest self = new DeleteAppStreamingOutTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppStreamingOutTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppStreamingOutTemplateShrinkRequest setStreamingOutTemplateShrink(String streamingOutTemplateShrink) {
        this.streamingOutTemplateShrink = streamingOutTemplateShrink;
        return this;
    }
    public String getStreamingOutTemplateShrink() {
        return this.streamingOutTemplateShrink;
    }

}
