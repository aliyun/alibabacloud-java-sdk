// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundStatisticRequest extends TeaModel {
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
     * <p>The evaluation result. Valid values:</p>
     * <ul>
     * <li><strong>report</strong>: Risks exist in cross-border data transfer.</li>
     * <li><strong>none</strong>: No risks exist in cross-border data transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("DetectionResult")
    public String detectionResult;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
     * <blockquote>
     * <p> You can query only data of the previous month, previous 3 months, previous 6 months, previous 12 months, and data generated since January 1 of last year for compliance check. You must specify a valid time range.</p>
     * </blockquote>
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
     * <p>waf-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the sorting field. Valid values:</p>
     * <ul>
     * <li><strong>total_count</strong> (default): total number of data entries</li>
     * <li><strong>outbound_count</strong>: total number of data entries that are transferred across borders</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>total_count</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default): in descending order</li>
     * <li><strong>asc</strong>: in ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

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
     * <p>The type of the sensitive data. Separate multiple types with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of sensitive data. Only built-in types of sensitive data are supported for this operation.</p>
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
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The type of the information. Valid values:</p>
     * <ul>
     * <li><strong>info</strong> (default): full personal information</li>
     * <li><strong>sensitive</strong>: sensitive personal information</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("SensitiveType")
    public String sensitiveType;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
     * <blockquote>
     * <p> You can query only data of the previous month, previous 3 months, previous 6 months, previous 12 months, and data generated since January 1 of last year for compliance check. You must specify a valid time range.</p>
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
