// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServicesByEndUserRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <ul>
     * <li><p>If this is your first request, do not specify this parameter.</p>
     * </li>
     * <li><p>If more results are available, set this parameter to the <strong>NextToken</strong> value from the previous response to retrieve the next page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
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
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The region ID of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The type of the endpoint service.</p>
     * <p>Only <strong>Interface</strong> is supported. An interface endpoint allows you to use Application Load Balancers (ALBs), Classic Load Balancers (CLBs), and Network Load Balancers (NLBs) as service resources.</p>
     * 
     * <strong>example:</strong>
     * <p>Interface</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>A list of tags to filter resources. You can specify up to 20 tags.</p>
     */
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

    public ListVpcEndpointServicesByEndUserRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
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
        /**
         * <p>The key of the tag. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
