// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesRequest extends TeaModel {
    // Specifies whether endpoint connection requests are automatically accepted. Valid values:
    // 
    // *   **true**: yes
    // *   **false** (default): no
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    // The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If this is your first query or no next query is to be sent, ignore this parameter.
    // *   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the endpoint service.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The ID of the service resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The business status of the endpoint service. Valid values:
    // 
    // *   **Normal**: running as expected.
    // *   **FinacialLocked**: locked due to overdue payments.
    @NameInMap("ServiceBusinessStatus")
    public String serviceBusinessStatus;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service.
    @NameInMap("ServiceName")
    public String serviceName;

    // The type of the service resource.
    // 
    // Set the value to **slb**, which specifies Classic Load Balancer (CLB).
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    // The status of the endpoint service. Valid values:
    // 
    // *   **Creating**: being created.
    // *   **Pending**: being modified.
    // *   **Active**: available.
    // *   **Deleting**: being deleted.
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    // The tags of the instances you want to query. You can specify up to 20 tags.
    @NameInMap("Tag")
    public java.util.List<ListVpcEndpointServicesRequestTag> tag;

    // Specifies whether to enable zone affinity. Valid values:
    // 
    // *   **true**: yes
    // *   **false** (default): no
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static ListVpcEndpointServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesRequest self = new ListVpcEndpointServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesRequest setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public ListVpcEndpointServicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcEndpointServicesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcEndpointServicesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListVpcEndpointServicesRequest setServiceBusinessStatus(String serviceBusinessStatus) {
        this.serviceBusinessStatus = serviceBusinessStatus;
        return this;
    }
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
    }

    public ListVpcEndpointServicesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListVpcEndpointServicesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListVpcEndpointServicesRequest setServiceResourceType(String serviceResourceType) {
        this.serviceResourceType = serviceResourceType;
        return this;
    }
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    public ListVpcEndpointServicesRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public ListVpcEndpointServicesRequest setTag(java.util.List<ListVpcEndpointServicesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesRequestTag> getTag() {
        return this.tag;
    }

    public ListVpcEndpointServicesRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static class ListVpcEndpointServicesRequestTag extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointServicesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesRequestTag self = new ListVpcEndpointServicesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointServicesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
