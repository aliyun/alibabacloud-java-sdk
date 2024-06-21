// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the endpoint service automatically accepts endpoint connection requests. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The time when the endpoint service was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T19:11:12Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D8992C1-6712-423C-BAC5-E5E817484C6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service state of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The endpoint service runs as expected.</li>
     * <li><strong>FinancialLocked</strong>: The endpoint service is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ServiceBusinessStatus")
    public String serviceBusinessStatus;

    /**
     * <p>The description of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my EndpointService.</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The domain name of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****.cn-huhehaote.privatelink.aliyuncs.com</p>
     */
    @NameInMap("ServiceDomain")
    public String serviceDomain;

    /**
     * <p>The endpoint service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The state of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint service is being created.</li>
     * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
     * <li><strong>Active</strong>: The endpoint service is available.</li>
     * <li><strong>Deleting</strong>: The endpoint service is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>Indicates whether IPv6 was enabled for the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    /**
     * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
