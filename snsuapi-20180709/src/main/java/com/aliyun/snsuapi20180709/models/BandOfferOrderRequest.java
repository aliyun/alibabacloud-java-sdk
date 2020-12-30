// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandOfferOrderRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BandId")
    public String bandId;

    @NameInMap("OfferId")
    public String offerId;

    public static BandOfferOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BandOfferOrderRequest self = new BandOfferOrderRequest();
        return TeaModel.build(map, self);
    }

    public BandOfferOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BandOfferOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BandOfferOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BandOfferOrderRequest setBandId(String bandId) {
        this.bandId = bandId;
        return this;
    }
    public String getBandId() {
        return this.bandId;
    }

    public BandOfferOrderRequest setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }
    public String getOfferId() {
        return this.offerId;
    }

}
