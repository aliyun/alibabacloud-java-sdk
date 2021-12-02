// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsRequest extends TeaModel {
    @NameInMap("DhcpOptionsSetId")
    public java.util.List<String> dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("MaxResults")
    public Integer maxResults;

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

    public static ListDhcpOptionsSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsRequest self = new ListDhcpOptionsSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDhcpOptionsSetsRequest setDhcpOptionsSetId(java.util.List<String> dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public java.util.List<String> getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public ListDhcpOptionsSetsRequest setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public ListDhcpOptionsSetsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListDhcpOptionsSetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDhcpOptionsSetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDhcpOptionsSetsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListDhcpOptionsSetsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDhcpOptionsSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDhcpOptionsSetsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListDhcpOptionsSetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
