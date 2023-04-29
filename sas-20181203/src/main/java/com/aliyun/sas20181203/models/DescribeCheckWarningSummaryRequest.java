// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryRequest extends TeaModel {
    /**
     * <p>The value of the container field.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The level-1 type of check items.</p>
     * <br>
     * <p>>  You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the level-1 types of check items.</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The ID of the baseline check policy.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The statistics of check items.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the asset.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The level-2 type of the risk item.</p>
     */
    @NameInMap("RiskName")
    public String riskName;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **uuid**: the ID of an asset</p>
     */
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The number of high-risk items.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of assets on which risk items are detected.</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The number of check items.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The page number of the current page.</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>The name of the container field. Valid values:</p>
     * <br>
     * <p>*   **clusterId**: the ID of the cluster</p>
     * <p>*   **image**: the name of the image</p>
     * <p>*   **imageId**: the ID of the image</p>
     * <p>*   **namespace**: the namespace</p>
     */
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

    public DescribeCheckWarningSummaryRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
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
