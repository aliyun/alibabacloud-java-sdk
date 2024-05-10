// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the field that is used to search for the container. Valid values:</p>
     * <br>
     * <p>*   **CONTAINER_ID**: the ID of the container</p>
     * <p>*   **IMAGE**: the name of the image</p>
     * <p>*   **NAMESPACE**: the namespace</p>
     * <p>*   **NODE_NAME**: the name of the node</p>
     * <p>*   **POD_IP**: the IP address of the pod</p>
     * <p>*   **HOST_IP**: the IP address of the host</p>
     * <p>*   **INSTANCE_ID**: the ID of the instance</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that is used to search for the container.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](https://help.aliyun.com/document_detail/130972.html) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Specifies whether risks were detected. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("HaveRisk")
    public Integer haveRisk;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the server on which the baseline check is performed.</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of entries per page. Default value: **10**, which indicates that 10 entries of server information are displayed on each page. A maximum of 100 entries can be returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the risk item.</p>
     * <br>
     * <p>> You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of risk items.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the baseline check policy.</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the UUID of the asset</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).</p>
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
