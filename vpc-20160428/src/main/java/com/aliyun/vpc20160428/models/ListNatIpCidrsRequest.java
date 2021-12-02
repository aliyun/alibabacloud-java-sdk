// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsRequest extends TeaModel {
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

    @NameInMap("NatIpCidrName")
    public java.util.List<String> natIpCidrName;

    @NameInMap("NatIpCidrStatus")
    public String natIpCidrStatus;

    @NameInMap("NatIpCidrs")
    public java.util.List<String> natIpCidrs;

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

    public static ListNatIpCidrsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpCidrsRequest self = new ListNatIpCidrsRequest();
        return TeaModel.build(map, self);
    }

    public ListNatIpCidrsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListNatIpCidrsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListNatIpCidrsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListNatIpCidrsRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatIpCidrsRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public ListNatIpCidrsRequest setNatIpCidrName(java.util.List<String> natIpCidrName) {
        this.natIpCidrName = natIpCidrName;
        return this;
    }
    public java.util.List<String> getNatIpCidrName() {
        return this.natIpCidrName;
    }

    public ListNatIpCidrsRequest setNatIpCidrStatus(String natIpCidrStatus) {
        this.natIpCidrStatus = natIpCidrStatus;
        return this;
    }
    public String getNatIpCidrStatus() {
        return this.natIpCidrStatus;
    }

    public ListNatIpCidrsRequest setNatIpCidrs(java.util.List<String> natIpCidrs) {
        this.natIpCidrs = natIpCidrs;
        return this;
    }
    public java.util.List<String> getNatIpCidrs() {
        return this.natIpCidrs;
    }

    public ListNatIpCidrsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpCidrsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListNatIpCidrsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNatIpCidrsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatIpCidrsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListNatIpCidrsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
