// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundStatisticRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter is available only for hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query information about hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The assessment result. Valid values:</p>
     * <ul>
     * <li><p><strong>report</strong>: a data outbound transfer threat exists.</p>
     * </li>
     * <li><p><strong>none</strong>: no data outbound transfer threat exists.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("DetectionResult")
    public String detectionResult;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp that is in UTC. Unit: seconds.</p>
     * <blockquote>
     * <p>The compliance assessment feature supports querying data from the last month, the last 3 months, the last 6 months, the last 12 months, and from January 1 of the previous year to the present. Make sure that the time range is valid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1725966000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The field to use for sorting. Valid values:</p>
     * <ul>
     * <li><p><strong>total_count</strong>: sorts by the total number of personal information data entries. This is the default value.</p>
     * </li>
     * <li><p><strong>outbound_count</strong>: sorts by the total number of outbound transfer data entries.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>total_count</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p><strong>desc</strong>: descending order. This is the default value.</p>
     * </li>
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
     * <p>The type of sensitive data. Separate multiple types with commas (,).</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported sensitive data types. This parameter supports only built-in sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000,1001</p>
     */
    @NameInMap("SensitiveCode")
    public String sensitiveCode;

    /**
     * <p>The sensitivity level. Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: high.</p>
     * </li>
     * <li><p><strong>medium</strong>: medium.</p>
     * </li>
     * <li><p><strong>low</strong>: low.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The type of information to query. Valid values:</p>
     * <ul>
     * <li><p><strong>info</strong>: all personal information. This is the default value.</p>
     * </li>
     * <li><p><strong>sensitive</strong>: only sensitive personal information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("SensitiveType")
    public String sensitiveType;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp that is in UTC. Unit: seconds.</p>
     * <blockquote>
     * <p>The compliance assessment feature supports querying data from the last month, the last 3 months, the last 6 months, the last 12 months, and from January 1 of the previous year to the present. Make sure that the time range is valid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1672502400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSensitiveOutboundStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundStatisticRequest self = new DescribeSensitiveOutboundStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundStatisticRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSensitiveOutboundStatisticRequest setDetectionResult(String detectionResult) {
        this.detectionResult = detectionResult;
        return this;
    }
    public String getDetectionResult() {
        return this.detectionResult;
    }

    public DescribeSensitiveOutboundStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSensitiveOutboundStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSensitiveOutboundStatisticRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public DescribeSensitiveOutboundStatisticRequest setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }
    public String getOrderWay() {
        return this.orderWay;
    }

    public DescribeSensitiveOutboundStatisticRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSensitiveOutboundStatisticRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSensitiveOutboundStatisticRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSensitiveOutboundStatisticRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeSensitiveOutboundStatisticRequest setSensitiveCode(String sensitiveCode) {
        this.sensitiveCode = sensitiveCode;
        return this;
    }
    public String getSensitiveCode() {
        return this.sensitiveCode;
    }

    public DescribeSensitiveOutboundStatisticRequest setSensitiveLevel(String sensitiveLevel) {
        this.sensitiveLevel = sensitiveLevel;
        return this;
    }
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    public DescribeSensitiveOutboundStatisticRequest setSensitiveType(String sensitiveType) {
        this.sensitiveType = sensitiveType;
        return this;
    }
    public String getSensitiveType() {
        return this.sensitiveType;
    }

    public DescribeSensitiveOutboundStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
