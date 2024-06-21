// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically accept endpoint connection requests. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
     * <li>If a next request is to be performed, set the parameter to the value of NextToken that is returned from the last call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the endpoint service.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

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
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><strong>slb</strong>: a Classic Load Balancer (CLB) instance</li>
     * <li><strong>alb</strong>: an Application Load Balancer (ALB) instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>The state of the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint service is being created.</li>
     * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
     * <li><strong>Active</strong>: The endpoint service is available.</li>
     * <li><strong>Deleting</strong>: The endpoint service is being deleted</li>
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
     * <p>Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
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
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
