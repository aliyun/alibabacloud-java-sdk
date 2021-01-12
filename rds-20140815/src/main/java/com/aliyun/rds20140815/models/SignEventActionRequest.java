// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SignEventActionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EventId")
    public Integer eventId;

    @NameInMap("EventSig")
    public String eventSig;

    public static SignEventActionRequest build(java.util.Map<String, ?> map) throws Exception {
        SignEventActionRequest self = new SignEventActionRequest();
        return TeaModel.build(map, self);
    }

    public SignEventActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SignEventActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SignEventActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SignEventActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SignEventActionRequest setEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }
    public Integer getEventId() {
        return this.eventId;
    }

    public SignEventActionRequest setEventSig(String eventSig) {
        this.eventSig = eventSig;
        return this;
    }
    public String getEventSig() {
        return this.eventSig;
    }

}
