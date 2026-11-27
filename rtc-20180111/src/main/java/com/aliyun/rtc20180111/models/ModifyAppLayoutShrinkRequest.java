// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLayoutShrinkRequest extends TeaModel {
    /**
     * <p>Application ID. Create and query through the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Idempotent parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Layout.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Layout")
    public String layoutShrink;

    public static ModifyAppLayoutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLayoutShrinkRequest self = new ModifyAppLayoutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppLayoutShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppLayoutShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppLayoutShrinkRequest setLayoutShrink(String layoutShrink) {
        this.layoutShrink = layoutShrink;
        return this;
    }
    public String getLayoutShrink() {
        return this.layoutShrink;
    }

}
