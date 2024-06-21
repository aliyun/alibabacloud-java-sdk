// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsRequest extends TeaModel {
    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong>: The endpoint connection is being modified.</li>
     * <li><strong>Connecting</strong>: The endpoint connection is being established.</li>
     * <li><strong>Connected</strong>: The endpoint connection is established.</li>
     * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
     * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
     * <li><strong>Deleting</strong>: The connection is being deleted.</li>
     * <li><strong>ServiceDeleted</strong>: The corresponding endpoint service has been deleted.</li>
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
     * <p>The state of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint is being created.</li>
     * <li><strong>Active</strong>: The endpoint is available.</li>
     * <li><strong>Pending</strong>: The endpoint is being modified.</li>
     * <li><strong>Deleting</strong>: The endpoint is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The type of the endpoint.</p>
     * <p>Set the value to <strong>Interface</strong>. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
     * <li>If a next request is to be performed, set the parameter to the value of <strong>NextToken</strong> that is returned from the last call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The list of tags.</p>
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
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
