// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ModifyAppViewStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewStatusRequest self = new ModifyAppViewStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
