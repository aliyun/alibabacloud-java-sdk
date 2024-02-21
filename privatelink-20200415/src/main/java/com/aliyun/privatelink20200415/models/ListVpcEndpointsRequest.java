// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsRequest extends TeaModel {
    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <br>
     * <p>*   **Pending**: The endpoint connection is being modified.</p>
     * <p>*   **Connecting**: The endpoint connection is being established.</p>
     * <p>*   **Connected**: The endpoint connection is established.</p>
     * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
     * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
     * <p>*   **Deleting**: The connection is being deleted.</p>
     * <p>*   **ServiceDeleted**: The corresponding endpoint service has been deleted.</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The state of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Creating**: The endpoint is being created.</p>
     * <p>*   **Active**: The endpoint is available.</p>
     * <p>*   **Pending**: The endpoint is being modified.</p>
     * <p>*   **Deleting**: The endpoint is being deleted.</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The type of the endpoint.</p>
     * <br>
     * <p>Set the value to **Interface**. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for the endpoint service.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</p>
     * <p>*   If a next request is to be performed, set the parameter to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
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
         * <br>
         * <p>The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
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
