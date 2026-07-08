// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePostpayBillsRequest extends TeaModel {
    /**
     * <p>The end time. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1779195599</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zz11sr5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. If a next page exists, this field has a return value.</p>
     * <blockquote>
     * <p>If this parameter has a return value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The epoch type for billing information. Valid values:</p>
     * <ul>
     * <li><strong>hour</strong>: Billing information is calculated on an hourly basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hour</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The start time. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1779120000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribePostpayBillsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillsRequest self = new DescribePostpayBillsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePostpayBillsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePostpayBillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePostpayBillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePostpayBillsRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribePostpayBillsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePostpayBillsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribePostpayBillsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
