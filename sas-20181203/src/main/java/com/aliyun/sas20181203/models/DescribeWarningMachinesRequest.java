// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesRequest extends TeaModel {
    // The ID of the container cluster.
    // 
    // >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the field that is used to search for the container. Valid values:
    // 
    // *   **CONTAINER_ID**: the ID of the container
    // *   **IMAGE**: the name of the image
    // *   **NAMESPACE**: the namespace
    // *   **NODE_NAME**: the name of the node
    // *   **POD_IP**: the IP address of the pod
    // *   **HOST_IP**: the IP address of the host
    // *   **INSTANCE_ID**: the ID of the instance
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    // The value of the field that is used to search for the container.
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether risks were detected. Valid values:
    // 
    // *   **1**: yes
    // *   **0**: no
    @NameInMap("HaveRisk")
    public Integer haveRisk;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the server on which the baseline check is performed.
    @NameInMap("MachineName")
    public String machineName;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the risk item.
    // 
    // >  You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of risk items.
    @NameInMap("RiskId")
    public Long riskId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the baseline check policy.
    @NameInMap("StrategyId")
    public Long strategyId;

    // The type of the query condition. Valid values:
    // 
    // *   **containerId**: the ID of the container
    // *   **uuid**: the UUID of the asset
    @NameInMap("TargetType")
    public String targetType;

    // The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).
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
