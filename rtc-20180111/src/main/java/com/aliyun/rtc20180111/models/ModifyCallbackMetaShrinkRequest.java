// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCallbackMetaShrinkRequest extends TeaModel {
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

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ModifyCallbackMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackMetaShrinkRequest self = new ModifyCallbackMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackMetaShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyCallbackMetaShrinkRequest setCallbackShrink(String callbackShrink) {
        this.callbackShrink = callbackShrink;
        return this;
    }
    public String getCallbackShrink() {
        return this.callbackShrink;
    }

    public ModifyCallbackMetaShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
