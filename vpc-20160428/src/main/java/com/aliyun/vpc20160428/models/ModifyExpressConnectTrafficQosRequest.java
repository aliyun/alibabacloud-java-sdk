// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PconnIdList")
    public String pconnIdList;

    @NameInMap("QosDescription")
    public String qosDescription;

    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QosName")
    public String qosName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static ModifyExpressConnectTrafficQosRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosRequest self = new ModifyExpressConnectTrafficQosRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectTrafficQosRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyExpressConnectTrafficQosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyExpressConnectTrafficQosRequest setPconnIdList(String pconnIdList) {
        this.pconnIdList = pconnIdList;
        return this;
    }
    public String getPconnIdList() {
        return this.pconnIdList;
    }

    public ModifyExpressConnectTrafficQosRequest setQosDescription(String qosDescription) {
        this.qosDescription = qosDescription;
        return this;
    }
    public String getQosDescription() {
        return this.qosDescription;
    }

    public ModifyExpressConnectTrafficQosRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public ModifyExpressConnectTrafficQosRequest setQosName(String qosName) {
        this.qosName = qosName;
        return this;
    }
    public String getQosName() {
        return this.qosName;
    }

    public ModifyExpressConnectTrafficQosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExpressConnectTrafficQosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
