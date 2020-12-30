// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStopSpeedUpRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CorrelationId")
    public String correlationId;

    public static MobileStopSpeedUpRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileStopSpeedUpRequest self = new MobileStopSpeedUpRequest();
        return TeaModel.build(map, self);
    }

    public MobileStopSpeedUpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MobileStopSpeedUpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MobileStopSpeedUpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MobileStopSpeedUpRequest setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
    public String getCorrelationId() {
        return this.correlationId;
    }

}
