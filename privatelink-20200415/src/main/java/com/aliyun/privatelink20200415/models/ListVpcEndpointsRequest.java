// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual stack</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The connection state of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Pending</strong>: The endpoint connection is being modified.</p>
     * </li>
     * <li><p><strong>Connecting</strong>: The endpoint is connecting.</p>
     * </li>
     * <li><p><strong>Connected</strong>: The endpoint is connected.</p>
     * </li>
     * <li><p><strong>Disconnecting</strong>: The endpoint is disconnecting.</p>
     * </li>
     * <li><p><strong>Disconnected</strong>: The endpoint is disconnected.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The endpoint is being deleted.</p>
     * </li>
     * <li><p><strong>ServiceDeleted</strong>: The endpoint service with which the endpoint is associated has been deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disconnected</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The ID of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The status of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The endpoint is being created.</p>
     * </li>
     * <li><p><strong>Active</strong>: The endpoint is available.</p>
     * </li>
     * <li><p><strong>Pending</strong>: The endpoint is being modified.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The endpoint is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Interface</strong>: an interface endpoint</p>
     * </li>
     * <li><p><strong>Reverse</strong>: a reverse endpoint</p>
     * </li>
     * <li><p><strong>GatewayLoadBalancer</strong>: a Gateway Load Balancer-type endpoint</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * <ul>
     * <li><p>If this is your first query or no next page is available, you do not need to specify this parameter.</p>
     * </li>
     * <li><p>If a next page is available, set the value to the <strong>NextToken</strong> value that is returned from the previous call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the endpoint is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the region where the endpoint service is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListVpcEndpointsRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-fdjkf789dfdfdfde****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListVpcEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsRequest self = new ListVpcEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public ListVpcEndpointsRequest setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public ListVpcEndpointsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointsRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public ListVpcEndpointsRequest setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public ListVpcEndpointsRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public ListVpcEndpointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcEndpointsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListVpcEndpointsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public ListVpcEndpointsRequest setTag(java.util.List<ListVpcEndpointsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVpcEndpointsRequestTag> getTag() {
        return this.tag;
    }

    public ListVpcEndpointsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListVpcEndpointsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsRequestTag self = new ListVpcEndpointsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
