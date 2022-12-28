// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    // The number of entries to return on each page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If **NextToken** is empty, no next query is to be sent.
    // *   If a value of **NextToken** is returned, the value is the token that is used for the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The list of endpoint services.
    @NameInMap("Services")
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services;

    public static ListVpcEndpointServicesByEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesByEndUserResponseBody self = new ListVpcEndpointServicesByEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesByEndUserResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServicesByEndUserResponseBody setServices(java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListVpcEndpointServicesByEndUserResponseBodyServicesTags extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointServicesByEndUserResponseBodyServicesTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserResponseBodyServicesTags self = new ListVpcEndpointServicesByEndUserResponseBodyServicesTags();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServicesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServicesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcEndpointServicesByEndUserResponseBodyServices extends TeaModel {
        // The payer of the endpoint service. Valid values:
        // 
        // *   **Endpoint**: the service consumer.
        // *   **EndpointService**: the service provider.
        @NameInMap("Payer")
        public String payer;

        // The ID of the resource group to which the resource belong.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The domain name of the endpoint service that can be associated with the endpoints when you create endpoints.
        @NameInMap("ServiceDomain")
        public String serviceDomain;

        // The ID of the endpoint service that can be associated with the endpoints when you create endpoints.
        @NameInMap("ServiceId")
        public String serviceId;

        // The name of the endpoint service that can be associated with the endpoints when you create endpoints.
        @NameInMap("ServiceName")
        public String serviceName;

        // Indicates whether the endpoint service supports IPv6. Valid values:
        // 
        // *   **true**: supports IPv6.
        // *   **false**: does not support IPv6.
        @NameInMap("ServiceSupportIPv6")
        public Boolean serviceSupportIPv6;

        // The type of the endpoint service.
        // 
        // Set the value to **Interface**, which specifies **slb** for the **ServiceResourceType** parameter. The value slb specifies the Classic Load Balancer (CLB) endpoint type.
        @NameInMap("ServiceType")
        public String serviceType;

        // The tags of the endpoint service.
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> tags;

        // The zone of the endpoint service that can be associated with the endpoints when you create endpoints.
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static ListVpcEndpointServicesByEndUserResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServicesByEndUserResponseBodyServices self = new ListVpcEndpointServicesByEndUserResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setPayer(String payer) {
            this.payer = payer;
            return this;
        }
        public String getPayer() {
            return this.payer;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }
        public String getServiceDomain() {
            return this.serviceDomain;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }
        public Boolean getServiceSupportIPv6() {
            return this.serviceSupportIPv6;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setTags(java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcEndpointServicesByEndUserResponseBodyServicesTags> getTags() {
            return this.tags;
        }

        public ListVpcEndpointServicesByEndUserResponseBodyServices setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
