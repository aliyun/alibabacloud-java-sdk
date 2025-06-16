// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcGatewayEndpointsRequest extends TeaModel {
    /**
     * <p>The ID of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vpce-bp1i1212ss2whuwyw****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the gateway endpoint.</p>
     * <p>The name must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>If a value is returned for NextToken, specify the value in the next request to retrieve a new page of results.</li>
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
     * <p>The region ID of the gateway endpoint.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxvfvazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyun.cn-hangzhou.oss</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListVpcGatewayEndpointsRequestTags> tags;

    @NameInMap("VpcId")
    public String vpcId;

    public static ListVpcGatewayEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcGatewayEndpointsRequest self = new ListVpcGatewayEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcGatewayEndpointsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcGatewayEndpointsRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public ListVpcGatewayEndpointsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVpcGatewayEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcGatewayEndpointsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListVpcGatewayEndpointsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListVpcGatewayEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcGatewayEndpointsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcGatewayEndpointsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListVpcGatewayEndpointsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListVpcGatewayEndpointsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListVpcGatewayEndpointsRequest setTags(java.util.List<ListVpcGatewayEndpointsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListVpcGatewayEndpointsRequestTags> getTags() {
        return this.tags;
    }

    public ListVpcGatewayEndpointsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListVpcGatewayEndpointsRequestTags extends TeaModel {
        /**
         * <p>The key of tag N added to the resource. You can specify at most 20 tag keys. It cannot be an empty string.</p>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value cannot exceed 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVpcGatewayEndpointsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcGatewayEndpointsRequestTags self = new ListVpcGatewayEndpointsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListVpcGatewayEndpointsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcGatewayEndpointsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
