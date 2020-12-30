// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStatusQueryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CorrelationId")
    public String correlationId;

    public static MobileStatusQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileStatusQueryRequest self = new MobileStatusQueryRequest();
        return TeaModel.build(map, self);
    }

    public MobileStatusQueryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MobileStatusQueryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MobileStatusQueryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MobileStatusQueryRequest setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
    public String getCorrelationId() {
        return this.correlationId;
    }

}
