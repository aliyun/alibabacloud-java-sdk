// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesRequest extends TeaModel {
    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4 type.</p>
     * </li>
     * <li><p><strong>DualStack</strong>: Dual-stack type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>Specifies whether to automatically accept endpoint connections. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Automatically accept endpoint connections.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not automatically accept endpoint connections.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token for the next query. Valid values:</p>
     * <ul>
     * <li><p>Leave this parameter empty for the first query or when no further results exist.</p>
     * </li>
     * <li><p>If another query is needed, set this parameter to the NextToken value returned in the previous API call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the endpoint service is deployed.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the service resource.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The business status of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: The endpoint service is running as expected.</p>
     * </li>
     * <li><p><strong>FinancialLocked</strong>: The endpoint service is locked due to an overdue payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ServiceBusinessStatus")
    public String serviceBusinessStatus;

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
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong>: The service resource is a Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>alb</strong>: The service resource is an Application Load Balancer (ALB) instance.</p>
     * </li>
     * <li><p><strong>nlb</strong>: The service resource is a Network Load Balancer (NLB) instance.</p>
     * </li>
     * <li><p><strong>gwlb</strong>: The service resource is a Gateway Load Balancer (GWLB) instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>The status of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The endpoint service is being created.</p>
     * </li>
     * <li><p><strong>Pending</strong>: The endpoint service is being modified.</p>
     * </li>
     * <li><p><strong>Active</strong>: The endpoint service is available.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The endpoint service is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListVpcEndpointServicesRequestTag> tag;

    /**
     * <p>Specifies whether zonal affinity is enabled for domain name resolution. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static ListVpcEndpointServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServicesRequest self = new ListVpcEndpointServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServicesRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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
        /**
         * <p>The tag key of the instance. You can specify up to 20 tag keys. The key cannot be an empty string.</p>
         * <p>The key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. You can specify up to 20 tag values. The value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
