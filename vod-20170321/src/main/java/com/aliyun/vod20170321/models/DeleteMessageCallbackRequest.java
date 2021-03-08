// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCallbackRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("AppId")
    public String appId;

    public static DeleteMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCallbackRequest self = new DeleteMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCallbackRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteMessageCallbackRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public DeleteMessageCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
