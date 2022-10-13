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

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Tag")
    public java.util.List<ListVpcEndpointServicesByEndUserRequestTag> tag;

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

    public ListVpcEndpointServicesByEndUserRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ListVpcEndpointServicesByEndUserRequest setTag(java.util.List<ListVpcEndpointServicesByEndUserRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesByEndUserRequestTag> getTag() {
        return this.tag;
    }

    public static class ListVpcEndpointServicesByEndUserRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointServicesByEndUserRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserRequestTag self = new ListVpcEndpointServicesByEndUserRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointServicesByEndUserRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
