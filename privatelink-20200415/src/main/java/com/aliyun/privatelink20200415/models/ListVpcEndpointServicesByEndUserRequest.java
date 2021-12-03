// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceType")
    public String serviceType;

    public static ListVpcEndpointServicesByEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserRequest self = new ListVpcEndpointServicesByEndUserRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesByEndUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesByEndUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointServicesByEndUserRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListVpcEndpointServicesByEndUserRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListVpcEndpointServicesByEndUserRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
