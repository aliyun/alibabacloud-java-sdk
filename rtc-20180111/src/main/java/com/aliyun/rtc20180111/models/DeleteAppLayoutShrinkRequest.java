// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppLayoutShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Layout")
    public String layoutShrink;

    public static DeleteAppLayoutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLayoutShrinkRequest self = new DeleteAppLayoutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppLayoutShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppLayoutShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAppLayoutShrinkRequest setLayoutShrink(String layoutShrink) {
        this.layoutShrink = layoutShrink;
        return this;
    }
    public String getLayoutShrink() {
        return this.layoutShrink;
    }

}
