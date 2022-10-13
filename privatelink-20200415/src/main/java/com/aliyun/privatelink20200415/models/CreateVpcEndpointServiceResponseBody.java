// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceBusinessStatus")
    public String serviceBusinessStatus;

    @NameInMap("ServiceDescription")
    public String serviceDescription;

    @NameInMap("ServiceDomain")
    public String serviceDomain;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

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
