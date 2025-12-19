// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayAssociateNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The filter information. You can specify a filter key and a filter value.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestFilter> filter;

    /**
     * <p>The number of entries to return per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid value:</p>
     * <ul>
     * <li>If no value is returned for NetToken, you do not need to specify this parameter.</li>
     * <li>If a value is returned for NextToken, you must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Internet NAT gateway.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestTag> tag;

    public static DescribeNatGatewayAssociateNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewayAssociateNetworkInterfacesRequest self = new DescribeNatGatewayAssociateNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setFilter(java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesRequest setTag(java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesRequestFilter extends TeaModel {
        /**
         * <p>The filter key.</p>
         * <ul>
         * <li>ResourceId</li>
         * </ul>
         * <blockquote>
         * <p> Specify the service resource ID in the Value field.</p>
         * </blockquote>
         * <ul>
         * <li>NetworkInterfaceId</li>
         * </ul>
         * <blockquote>
         * <p> Specify the ENI ID in the Value field.</p>
         * </blockquote>
         * <ul>
         * <li>ResourceOwnerId</li>
         * </ul>
         * <blockquote>
         * <p> Specify the UID of the account to which the service resource belongs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ResourceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ep-8psre8c8936596cd****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNatGatewayAssociateNetworkInterfacesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesRequestFilter self = new DescribeNatGatewayAssociateNetworkInterfacesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesRequestTag extends TeaModel {
        /**
         * <p>The tag key You can specify at most 20 tag keys. It cannot be an empty string,</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag key. You can specify at most 20 tag keys. It cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNatGatewayAssociateNetworkInterfacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesRequestTag self = new DescribeNatGatewayAssociateNetworkInterfacesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
