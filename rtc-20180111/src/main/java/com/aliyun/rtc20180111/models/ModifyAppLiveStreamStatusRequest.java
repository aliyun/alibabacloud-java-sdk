// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLiveStreamStatusRequest extends TeaModel {
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
     * <p>53200b81-b761-4c10-842a-a0726xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyAppLiveStreamStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLiveStreamStatusRequest self = new ModifyAppLiveStreamStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppLiveStreamStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppLiveStreamStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
