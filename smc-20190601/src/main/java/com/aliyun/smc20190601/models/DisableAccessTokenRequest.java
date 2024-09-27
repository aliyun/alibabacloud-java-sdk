// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DisableAccessTokenRequest extends TeaModel {
    /**
     * <p>The ID of the activation code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-bp12g5gwup0yzmce****</p>
     */
    @NameInMap("AccessTokenId")
    public String accessTokenId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DisableAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAccessTokenRequest self = new DisableAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public DisableAccessTokenRequest setAccessTokenId(String accessTokenId) {
        this.accessTokenId = accessTokenId;
        return this;
    }
    public String getAccessTokenId() {
        return this.accessTokenId;
    }

    public DisableAccessTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisableAccessTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
