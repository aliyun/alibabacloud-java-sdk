// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordStatusRequest extends TeaModel {
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

    public static ModifyAppRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordStatusRequest self = new ModifyAppRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppRecordStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
