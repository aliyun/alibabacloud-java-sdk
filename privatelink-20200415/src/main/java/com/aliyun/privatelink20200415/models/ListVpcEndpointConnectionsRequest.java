// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsRequest extends TeaModel {
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
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>25346073170691****</p>
     */
    @NameInMap("EndpointOwnerId")
    public Long endpointOwnerId;

    /**
     * <p>The ID of the endpoint elastic network interface (ENI).</p>
     * 
     * <strong>example:</strong>
     * <p>eni-hp32lk0pyv6o94hs****</p>
     */
    @NameInMap("EniId")
    public String eniId;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>50</strong>.</p>
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
     * <li>If a next request is to be performed, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint connection.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ReplacedResourceId")
    public String replacedResourceId;

    /**
     * <p>The ID of the resource group to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The endpoint service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ListVpcEndpointConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointConnectionsRequest self = new ListVpcEndpointConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointConnectionsRequest setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public ListVpcEndpointConnectionsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointConnectionsRequest setEndpointOwnerId(Long endpointOwnerId) {
        this.endpointOwnerId = endpointOwnerId;
        return this;
    }
    public Long getEndpointOwnerId() {
        return this.endpointOwnerId;
    }

    public ListVpcEndpointConnectionsRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }
    public String getEniId() {
        return this.eniId;
    }

    public ListVpcEndpointConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointConnectionsRequest setReplacedResourceId(String replacedResourceId) {
        this.replacedResourceId = replacedResourceId;
        return this;
    }
    public String getReplacedResourceId() {
        return this.replacedResourceId;
    }

    public ListVpcEndpointConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcEndpointConnectionsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListVpcEndpointConnectionsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
