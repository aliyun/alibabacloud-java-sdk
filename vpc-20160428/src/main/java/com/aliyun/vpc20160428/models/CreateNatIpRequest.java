// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NatIp")
    public String natIp;

    @NameInMap("NatIpCidr")
    public String natIpCidr;

    @NameInMap("NatIpCidrId")
    public String natIpCidrId;

    @NameInMap("NatIpDescription")
    public String natIpDescription;

    @NameInMap("NatIpName")
    public String natIpName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateNatIpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpRequest self = new CreateNatIpRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatIpRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateNatIpRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatIpRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatIpRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public CreateNatIpRequest setNatIpCidrId(String natIpCidrId) {
        this.natIpCidrId = natIpCidrId;
        return this;
    }
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    public CreateNatIpRequest setNatIpDescription(String natIpDescription) {
        this.natIpDescription = natIpDescription;
        return this;
    }
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    public CreateNatIpRequest setNatIpName(String natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public String getNatIpName() {
        return this.natIpName;
    }

    public CreateNatIpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNatIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNatIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatIpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNatIpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
