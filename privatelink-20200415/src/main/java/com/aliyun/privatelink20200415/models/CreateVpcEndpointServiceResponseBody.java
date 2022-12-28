// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    // Indicates whether endpoint connection requests are automatically accepted. Valid values:
    // 
    // *   **true**: Endpoint connection requests are automatically accepted.
    // *   **false**: Endpoint connection requests are not automatically accepted.
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    // The time when the endpoint service was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The status of the endpoint service feature. Valid values:
    // 
    // *   **Normal**: The feature is normal.
    // *   **FinacialLocked**: The feature is locked due to overdue payments.
    @NameInMap("ServiceBusinessStatus")
    public String serviceBusinessStatus;

    // The description of the endpoint service.
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    // The domain name of the endpoint service.
    @NameInMap("ServiceDomain")
    public String serviceDomain;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service.
    @NameInMap("ServiceName")
    public String serviceName;

    // The status of the endpoint service. Valid values:
    // 
    // *   **Creating**: The endpoint service is being created.
    // *   **Pending**: The endpoint service is being modified.
    // *   **Active**: The endpoint service is available.
    // *   **Deleting**: The endpoint service is being deleted.
    // *   **Inactive**: The endpoint service is unavailable.
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    // Indicates whether the endpoint service supports IPv6. Valid values:
    // 
    // *   **true**: The endpoint service supports IPv6.
    // *   **false**: The endpoint service does not support IPv6.
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    // Indicates whether zone affinity is enabled. Valid values:
    // 
    // *   **true**: Zone affinity is enabled.
    // *   **false**: Zone affinity is disabled.
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static CreateVpcEndpointServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointServiceResponseBody self = new CreateVpcEndpointServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointServiceResponseBody setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public CreateVpcEndpointServiceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateVpcEndpointServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcEndpointServiceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcEndpointServiceResponseBody setServiceBusinessStatus(String serviceBusinessStatus) {
        this.serviceBusinessStatus = serviceBusinessStatus;
        return this;
    }
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
    }

    public CreateVpcEndpointServiceResponseBody setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public CreateVpcEndpointServiceResponseBody setServiceDomain(String serviceDomain) {
        this.serviceDomain = serviceDomain;
        return this;
    }
    public String getServiceDomain() {
        return this.serviceDomain;
    }

    public CreateVpcEndpointServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateVpcEndpointServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcEndpointServiceResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public CreateVpcEndpointServiceResponseBody setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public CreateVpcEndpointServiceResponseBody setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

}
