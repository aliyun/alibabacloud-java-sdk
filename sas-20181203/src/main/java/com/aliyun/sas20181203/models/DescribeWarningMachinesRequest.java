// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesRequest extends TeaModel {
    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the UUID of the asset</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The name of the server.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The number of **low-risk** items on the server.</p>
     */
    @NameInMap("HaveRisk")
    public Integer haveRisk;

    /**
     * <p>The private IP address of the server.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of **medium-risk** items on the server.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the server on which the baseline check is performed.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The ID of the baseline check policy.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>Specifies whether risks were detected. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The ID of the server.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeWarningMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningMachinesRequest self = new DescribeWarningMachinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWarningMachinesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeWarningMachinesRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeWarningMachinesRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeWarningMachinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWarningMachinesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeWarningMachinesRequest setHaveRisk(Integer haveRisk) {
        this.haveRisk = haveRisk;
        return this;
    }
    public Integer getHaveRisk() {
        return this.haveRisk;
    }

    public DescribeWarningMachinesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWarningMachinesRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public DescribeWarningMachinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWarningMachinesRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeWarningMachinesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWarningMachinesRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public DescribeWarningMachinesRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeWarningMachinesRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
