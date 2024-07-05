// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the application. If you do not set this parameter, the default value <strong>app-1000000</strong> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCallbackRequest self = new DeleteMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMessageCallbackRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
