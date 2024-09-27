// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteAccessTokenRequest extends TeaModel {
    /**
     * <p>The ID of the activation code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-bp1akz2zp67r0k6r****</p>
     */
    @NameInMap("AccessTokenId")
    public String accessTokenId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DeleteAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessTokenRequest self = new DeleteAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessTokenRequest setAccessTokenId(String accessTokenId) {
        this.accessTokenId = accessTokenId;
        return this;
    }
    public String getAccessTokenId() {
        return this.accessTokenId;
    }

    public DeleteAccessTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAccessTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
