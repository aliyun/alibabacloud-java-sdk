// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAppPlayKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-1000231</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>yzNgTUtAl6HAuosIA</p>
     */
    @NameInMap("PlayKey")
    public String playKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetAppPlayKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppPlayKeyRequest self = new SetAppPlayKeyRequest();
        return TeaModel.build(map, self);
    }

    public SetAppPlayKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetAppPlayKeyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetAppPlayKeyRequest setPlayKey(String playKey) {
        this.playKey = playKey;
        return this;
    }
    public String getPlayKey() {
        return this.playKey;
    }

    public SetAppPlayKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetAppPlayKeyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
