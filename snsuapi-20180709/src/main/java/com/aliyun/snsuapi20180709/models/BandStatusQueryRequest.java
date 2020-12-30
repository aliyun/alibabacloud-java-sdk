// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStatusQueryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BandId")
    public Long bandId;

    public static BandStatusQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        BandStatusQueryRequest self = new BandStatusQueryRequest();
        return TeaModel.build(map, self);
    }

    public BandStatusQueryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BandStatusQueryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BandStatusQueryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BandStatusQueryRequest setBandId(Long bandId) {
        this.bandId = bandId;
        return this;
    }
    public Long getBandId() {
        return this.bandId;
    }

}
