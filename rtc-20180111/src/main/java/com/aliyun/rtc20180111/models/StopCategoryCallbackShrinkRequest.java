// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopCategoryCallbackShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223***JQb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Callback")
    public String callbackShrink;

    public static StopCategoryCallbackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCategoryCallbackShrinkRequest self = new StopCategoryCallbackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopCategoryCallbackShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopCategoryCallbackShrinkRequest setCallbackShrink(String callbackShrink) {
        this.callbackShrink = callbackShrink;
        return this;
    }
    public String getCallbackShrink() {
        return this.callbackShrink;
    }

}
