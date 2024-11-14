// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveStatisticRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1725966000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
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
     * <p>The beginning of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type of the statistics. Valid values:</p>
     * <ul>
     * <li><strong>ip</strong>: IP address</li>
     * <li><strong>host</strong>: domain name</li>
     * <li><strong>sensitive_code</strong>: sensitive data type</li>
     * <li><strong>api</strong>: sensitive data-related API</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    public static DescribeSensitiveStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveStatisticRequest self = new DescribeSensitiveStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveStatisticRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSensitiveStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSensitiveStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSensitiveStatisticRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSensitiveStatisticRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSensitiveStatisticRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSensitiveStatisticRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeSensitiveStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSensitiveStatisticRequest setStatisticType(String statisticType) {
        this.statisticType = statisticType;
        return this;
    }
    public String getStatisticType() {
        return this.statisticType;
    }

}
