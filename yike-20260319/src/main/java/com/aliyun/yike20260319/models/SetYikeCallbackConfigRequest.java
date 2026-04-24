// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SetYikeCallbackConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CallbackEventList&quot;:[{&quot;EventType&quot;:&quot;UserCreditAdded&quot;,&quot;UserData&quot;:&quot;{}&quot;}]}</p>
     */
    @NameInMap("CallbackConfig")
    public String callbackConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http//example.com/callback</p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    public static SetYikeCallbackConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetYikeCallbackConfigRequest self = new SetYikeCallbackConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetYikeCallbackConfigRequest setCallbackConfig(String callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

    public SetYikeCallbackConfigRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
