// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>Indicates whether endpoint connection requests are automatically accepted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatically accepts endpoint connection requests.</li>
     * <li><strong>false</strong>: does not automatically accept endpoint connection requests.</li>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The business status of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: normal.</p>
     * </li>
     * <li><p><strong>FinancialLocked</strong>: locked due to overdue payments.</p>
     * </li>
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
     * <p>The ID of the endpoint service.</p>
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
     * <li><p><strong>Creating</strong>: being created.</p>
     * </li>
     * <li><p><strong>Pending</strong>: being modified.</p>
     * </li>
     * <li><p><strong>Active</strong>: available.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong>: no.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceSupportIPv6")
    @Deprecated
    public Boolean serviceSupportIPv6;

    /**
     * <p>The list of regions in which the endpoint service is available. Service consumers can initiate endpoint connections from the regions in the list.</p>
     */
    @NameInMap("SupportedRegionSet")
    public java.util.List<CreateVpcEndpointServiceResponseBodySupportedRegionSet> supportedRegionSet;

    /**
     * <p>Indicates whether zone affinity is enabled for endpoint domain name resolution. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
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

    public CreateVpcEndpointServiceResponseBody setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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

    @Deprecated
    public CreateVpcEndpointServiceResponseBody setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public CreateVpcEndpointServiceResponseBody setSupportedRegionSet(java.util.List<CreateVpcEndpointServiceResponseBodySupportedRegionSet> supportedRegionSet) {
        this.supportedRegionSet = supportedRegionSet;
        return this;
    }
    public java.util.List<CreateVpcEndpointServiceResponseBodySupportedRegionSet> getSupportedRegionSet() {
        return this.supportedRegionSet;
    }

    public CreateVpcEndpointServiceResponseBody setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static class CreateVpcEndpointServiceResponseBodySupportedRegionSet extends TeaModel {
        /**
         * <p>The business status of the region in which the endpoint service is available. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal.</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RegionBusinessStatus")
        public String regionBusinessStatus;

        /**
         * <p>The state of the region in which the endpoint service is available. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: changing.</li>
         * <li><strong>Available</strong>: available.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * <li><strong>Failed</strong>: failed.</li>
         * <li><strong>Closed</strong>: closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("RegionServiceStatus")
        public String regionServiceStatus;

        @NameInMap("ServiceRegionId")
        @Deprecated
        public String serviceRegionId;

        /**
         * <p>The ID of a region in which the endpoint service is available.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SupportedRegionId")
        public String supportedRegionId;

        public static CreateVpcEndpointServiceResponseBodySupportedRegionSet build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointServiceResponseBodySupportedRegionSet self = new CreateVpcEndpointServiceResponseBodySupportedRegionSet();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointServiceResponseBodySupportedRegionSet setRegionBusinessStatus(String regionBusinessStatus) {
            this.regionBusinessStatus = regionBusinessStatus;
            return this;
        }
        public String getRegionBusinessStatus() {
            return this.regionBusinessStatus;
        }

        public CreateVpcEndpointServiceResponseBodySupportedRegionSet setRegionServiceStatus(String regionServiceStatus) {
            this.regionServiceStatus = regionServiceStatus;
            return this;
        }
        public String getRegionServiceStatus() {
            return this.regionServiceStatus;
        }

        @Deprecated
        public CreateVpcEndpointServiceResponseBodySupportedRegionSet setServiceRegionId(String serviceRegionId) {
            this.serviceRegionId = serviceRegionId;
            return this;
        }
        public String getServiceRegionId() {
            return this.serviceRegionId;
        }

        public CreateVpcEndpointServiceResponseBodySupportedRegionSet setSupportedRegionId(String supportedRegionId) {
            this.supportedRegionId = supportedRegionId;
            return this;
        }
        public String getSupportedRegionId() {
            return this.supportedRegionId;
        }

    }

}
