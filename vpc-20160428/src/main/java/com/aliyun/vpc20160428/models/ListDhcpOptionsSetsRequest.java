// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsRequest extends TeaModel {
    @NameInMap("DhcpOptionsSetId")
    public java.util.List<String> dhcpOptionsSetId;

    /**
     * <p>The name of the DHCP options set.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    /**
     * <p>The root domain. For example, you can set the value to example.com.</p>
     * <br>
     * <p>After a DHCP options set is associated with a virtual private cloud (VPC), the root domain in the DHCP options set is automatically synchronized with the Elastic Compute Service (ECS) instances in the VPC.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next queries are to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the DHCP options sets that you want to query.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tags")
    public java.util.List<ListDhcpOptionsSetsRequestTags> tags;

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

    public ListDhcpOptionsSetsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ListDhcpOptionsSetsRequest setTags(java.util.List<ListDhcpOptionsSetsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListDhcpOptionsSetsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListDhcpOptionsSetsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDhcpOptionsSetsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsRequestTags self = new ListDhcpOptionsSetsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDhcpOptionsSetsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
