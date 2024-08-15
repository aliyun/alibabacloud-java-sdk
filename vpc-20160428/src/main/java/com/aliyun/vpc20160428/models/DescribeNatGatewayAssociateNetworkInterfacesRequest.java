// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayAssociateNetworkInterfacesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Filter")
    public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
         * <strong>example:</strong>
         * <p>ResourceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
