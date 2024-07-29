// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppCallbackStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223***JQb</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ModifyAppCallbackStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppCallbackStatusRequest self = new ModifyAppCallbackStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppCallbackStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
