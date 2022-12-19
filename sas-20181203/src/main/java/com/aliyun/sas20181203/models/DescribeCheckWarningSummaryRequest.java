// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryRequest extends TeaModel {
    // The ID of the container cluster.
    // 
    // >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the container field. Valid values:
    // 
    // *   **clusterId**: the ID of the cluster
    // *   **image**: the name of the image
    // *   **imageId**: the ID of the image
    // *   **namespace**: the namespace
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    // The value of the container field.
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The language of the content within the request and the response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name of the risk item.
    @NameInMap("RiskName")
    public String riskName;

    // The status of the baseline check. Valid values:
    // 
    // *   **1**: failed
    // *   **3**: passed
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The status of the check item. Valid values:
    // 
    // *   **1**: failed
    // *   **2**: verifying
    // *   **3**: passed
    // *   **5**: expired
    // *   **6**: ignored
    @NameInMap("Status")
    public String status;

    // The ID of the baseline check policy.
    @NameInMap("StrategyId")
    public Long strategyId;

    // The type of the query condition. Valid values:
    // 
    // *   **uuid**: the ID of an asset
    @NameInMap("TargetType")
    public String targetType;

    // The level-1 type of check items.
    // 
    // >  You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the level-1 types of check items.
    @NameInMap("TypeName")
    public String typeName;

    // The UUID of the asset.
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets.
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeCheckWarningSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningSummaryRequest self = new DescribeCheckWarningSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeCheckWarningSummaryRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeCheckWarningSummaryRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeCheckWarningSummaryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningSummaryRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public DescribeCheckWarningSummaryRequest setRiskStatus(Integer riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public Integer getRiskStatus() {
        return this.riskStatus;
    }

    public DescribeCheckWarningSummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCheckWarningSummaryRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCheckWarningSummaryRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public DescribeCheckWarningSummaryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeCheckWarningSummaryRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public DescribeCheckWarningSummaryRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
