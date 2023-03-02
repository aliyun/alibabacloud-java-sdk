// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the application. If you do not set this parameter, the default value **app-1000000** is used.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static GetMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackRequest self = new GetMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageCallbackRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
