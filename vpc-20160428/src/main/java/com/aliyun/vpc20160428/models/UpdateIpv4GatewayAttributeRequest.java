// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpv4GatewayAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Ipv4GatewayDescription")
    public String ipv4GatewayDescription;

    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("Ipv4GatewayName")
    public String ipv4GatewayName;

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

    public static UpdateIpv4GatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpv4GatewayAttributeRequest self = new UpdateIpv4GatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpv4GatewayAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpv4GatewayAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpv4GatewayAttributeRequest setIpv4GatewayDescription(String ipv4GatewayDescription) {
        this.ipv4GatewayDescription = ipv4GatewayDescription;
        return this;
    }
    public String getIpv4GatewayDescription() {
        return this.ipv4GatewayDescription;
    }

    public UpdateIpv4GatewayAttributeRequest setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public UpdateIpv4GatewayAttributeRequest setIpv4GatewayName(String ipv4GatewayName) {
        this.ipv4GatewayName = ipv4GatewayName;
        return this;
    }
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
    }

    public UpdateIpv4GatewayAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateIpv4GatewayAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpv4GatewayAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpv4GatewayAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpv4GatewayAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
