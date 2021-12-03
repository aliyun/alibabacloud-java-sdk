// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsRequest extends TeaModel {
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointOwnerId")
    public Long endpointOwnerId;

    @NameInMap("EniId")
    public String eniId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

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

    public ListVpcEndpointConnectionsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
