// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c80dae73bd1be442699766b14ffd0****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the container field. Valid values:</p>
     * <ul>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageId</strong>: the ID of the image</li>
     * <li><strong>namespace</strong>: the namespace</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container field.</p>
     * 
     * <strong>example:</strong>
     * <p>c819391d2d520485fa3e81e2dc2ea****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the risk item.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("RiskName")
    public String riskName;

    /**
     * <p>The status of the baseline check. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: failed</li>
     * <li><strong>3</strong>: passed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>219.133.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the check item. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: failed</li>
     * <li><strong>2</strong>: verifying</li>
     * <li><strong>3</strong>: passed</li>
     * <li><strong>5</strong>: expired</li>
     * <li><strong>6</strong>: ignored</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: the ID of an asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The level-1 type of check items.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the level-1 types of check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>The UUID of the asset.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of assets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f03259d8-1e81-4fae-bcbb-275fb5****</p>
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
