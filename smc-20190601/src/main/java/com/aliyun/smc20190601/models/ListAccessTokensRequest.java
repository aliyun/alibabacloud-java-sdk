// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ListAccessTokensRequest extends TeaModel {
    /**
     * <p>The information about activation codes.</p>
     */
    @NameInMap("AccessTokenId")
    public java.util.List<String> accessTokenId;

    /**
     * <p>The name of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The status of the activation code. Valid values:</p>
     * <ul>
     * <li>activated</li>
     * <li>unactivated</li>
     * <li>expired</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>activated</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAccessTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessTokensRequest self = new ListAccessTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessTokensRequest setAccessTokenId(java.util.List<String> accessTokenId) {
        this.accessTokenId = accessTokenId;
        return this;
    }
    public java.util.List<String> getAccessTokenId() {
        return this.accessTokenId;
    }

    public ListAccessTokensRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAccessTokensRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAccessTokensRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAccessTokensRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
