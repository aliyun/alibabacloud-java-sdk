// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NatIpCidr")
    public String natIpCidr;

    @NameInMap("NatIpIds")
    public java.util.List<String> natIpIds;

    @NameInMap("NatIpName")
    public java.util.List<String> natIpName;

    @NameInMap("NatIpStatus")
    public String natIpStatus;

    @NameInMap("NextToken")
    public String nextToken;

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

    public static ListNatIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpsRequest self = new ListNatIpsRequest();
        return TeaModel.build(map, self);
    }

    public ListNatIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListNatIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListNatIpsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListNatIpsRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatIpsRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public ListNatIpsRequest setNatIpIds(java.util.List<String> natIpIds) {
        this.natIpIds = natIpIds;
        return this;
    }
    public java.util.List<String> getNatIpIds() {
        return this.natIpIds;
    }

    public ListNatIpsRequest setNatIpName(java.util.List<String> natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public java.util.List<String> getNatIpName() {
        return this.natIpName;
    }

    public ListNatIpsRequest setNatIpStatus(String natIpStatus) {
        this.natIpStatus = natIpStatus;
        return this;
    }
    public String getNatIpStatus() {
        return this.natIpStatus;
    }

    public ListNatIpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListNatIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNatIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListNatIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
