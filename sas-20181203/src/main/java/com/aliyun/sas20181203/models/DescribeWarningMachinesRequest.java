// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningMachinesRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c7e3c5b420a7947c2933303144688****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the field that is used to search for the container. Valid values:</p>
     * <ul>
     * <li><strong>CONTAINER_ID</strong>: the ID of the container</li>
     * <li><strong>IMAGE</strong>: the name of the image</li>
     * <li><strong>NAMESPACE</strong>: the namespace</li>
     * <li><strong>NODE_NAME</strong>: the name of the node</li>
     * <li><strong>POD_IP</strong>: the IP address of the pod</li>
     * <li><strong>HOST_IP</strong>: the IP address of the host</li>
     * <li><strong>INSTANCE_ID</strong>: the ID of the instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that is used to search for the container.</p>
     * 
     * <strong>example:</strong>
     * <p>c8bb3ef0f5ccf45508f0fd1ffc200****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/130972.html">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Specifies whether risks were detected. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HaveRisk")
    public Integer haveRisk;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The name of the server on which the baseline check is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>oracle-win-001****</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>, which indicates that 10 entries of server information are displayed on each page. A maximum of 100 entries can be returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the risk item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>196</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: the ID of the container</li>
     * <li><strong>uuid</strong>: the UUID of the asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>9888955c-0076-49da-bd9c-34f5492b****</p>
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
