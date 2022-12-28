// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserRequest extends TeaModel {
    // The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the endpoint service that you want to query.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies the ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The ID of the endpoint service that you want to query.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service that you want to query.
    @NameInMap("ServiceName")
    public String serviceName;

    // The type of the endpoint service.
    // 
    // Set the value to **Interface**, which specifies **slb** for the **ServiceResourceType** parameter. The value slb specifies the Classic Load Balancer (CLB) endpoint type.
    @NameInMap("ServiceType")
    public String serviceType;

    // The list of tags. You can specify a maximum of 20 tags.
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
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
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
