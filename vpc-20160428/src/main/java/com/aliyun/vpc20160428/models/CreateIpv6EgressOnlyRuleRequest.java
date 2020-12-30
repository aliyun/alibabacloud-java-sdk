// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpv6EgressOnlyRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CreateIpv6EgressOnlyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpv6EgressOnlyRuleRequest self = new CreateIpv6EgressOnlyRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpv6EgressOnlyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpv6EgressOnlyRuleRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public CreateIpv6EgressOnlyRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpv6EgressOnlyRuleRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateIpv6EgressOnlyRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIpv6EgressOnlyRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIpv6EgressOnlyRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpv6EgressOnlyRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpv6EgressOnlyRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpv6EgressOnlyRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpv6EgressOnlyRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
