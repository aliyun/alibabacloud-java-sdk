// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpv4GatewaysRequest extends TeaModel {
    /**
     * <p>The ID of the IPv4 gateway to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    /**
     * <p>The name of the IPv4 gateway to query.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Ipv4GatewayName")
    public String ipv4GatewayName;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the NextToken value returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the IPv4 gateways to query. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-6</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IPv4 gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListIpv4GatewaysRequestTags> tags;

    /**
     * <p>The ID of the VPC associated with the IPv4 gateway to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-5tsrxlw7dv074gci4****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListIpv4GatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpv4GatewaysRequest self = new ListIpv4GatewaysRequest();
        return TeaModel.build(map, self);
    }

    public ListIpv4GatewaysRequest setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public ListIpv4GatewaysRequest setIpv4GatewayName(String ipv4GatewayName) {
        this.ipv4GatewayName = ipv4GatewayName;
        return this;
    }
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
    }

    public ListIpv4GatewaysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpv4GatewaysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpv4GatewaysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListIpv4GatewaysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListIpv4GatewaysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpv4GatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpv4GatewaysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListIpv4GatewaysRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListIpv4GatewaysRequest setTags(java.util.List<ListIpv4GatewaysRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIpv4GatewaysRequestTags> getTags() {
        return this.tags;
    }

    public ListIpv4GatewaysRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListIpv4GatewaysRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, you cannot specify an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can specify an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpv4GatewaysRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpv4GatewaysRequestTags self = new ListIpv4GatewaysRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIpv4GatewaysRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpv4GatewaysRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
