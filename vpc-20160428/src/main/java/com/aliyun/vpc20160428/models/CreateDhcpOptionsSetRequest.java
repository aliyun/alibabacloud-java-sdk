// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDhcpOptionsSetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DomainNameServers")
    public String domainNameServers;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static CreateDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDhcpOptionsSetRequest self = new CreateDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDhcpOptionsSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDhcpOptionsSetRequest setDomainNameServers(String domainNameServers) {
        this.domainNameServers = domainNameServers;
        return this;
    }
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    public CreateDhcpOptionsSetRequest setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public CreateDhcpOptionsSetRequest setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public CreateDhcpOptionsSetRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDhcpOptionsSetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDhcpOptionsSetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDhcpOptionsSetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDhcpOptionsSetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDhcpOptionsSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDhcpOptionsSetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
