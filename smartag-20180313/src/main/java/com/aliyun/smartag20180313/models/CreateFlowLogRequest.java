// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    /**
     * <p>The output interval for active flows. Valid values: <strong>60</strong> to <strong>6000</strong>. Unit: seconds. Default value: <strong>300</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ActiveAging")
    public Integer activeAging;

    /**
     * <p>The description of the flow log instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The output interval for inactive flows. Valid values: <strong>10</strong> to <strong>600</strong>. Unit: seconds. Default value: <strong>15</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("InactiveAging")
    public Integer inactiveAging;

    /**
     * <p>The name of the Simple Log Service Logstore.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>sls</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>config-operation-log</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <p>The name of the flow log instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-flowlog-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IP address of the NetFlow server that stores the flow log.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>netflow</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.2</p>
     */
    @NameInMap("NetflowServerIp")
    public String netflowServerIp;

    /**
     * <p>The server port of the NetFlow server that stores the flow log. Default value: <strong>9995</strong>.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>netflow</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>9995</p>
     */
    @NameInMap("NetflowServerPort")
    public Integer netflowServerPort;

    /**
     * <p>The version of the NetFlow protocol used to store the flow log. Valid values: <strong>V5</strong>, <strong>V9</strong>, and <strong>V10</strong>. Default value: <strong>V9</strong>.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>netflow</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>V9</p>
     */
    @NameInMap("NetflowVersion")
    public String netflowVersion;

    /**
     * <p>The output type of the flow log. Valid values:</p>
     * <ul>
     * <li><p><strong>sls</strong>: The flow log is stored in Simple Log Service.</p>
     * </li>
     * <li><p><strong>netflow</strong>: The flow log is stored on the NetFlow server that you configure.</p>
     * </li>
     * <li><p><strong>all</strong>: The flow log is stored in both Simple Log Service and the NetFlow server that you configure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>sls</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-flowlog-shanghai</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID of the flow log instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region ID of Simple Log Service.</p>
     * <p>This parameter is required when the output type of the flow log is <strong>sls</strong> or <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    public static CreateFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogRequest self = new CreateFlowLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogRequest setActiveAging(Integer activeAging) {
        this.activeAging = activeAging;
        return this;
    }
    public Integer getActiveAging() {
        return this.activeAging;
    }

    public CreateFlowLogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowLogRequest setInactiveAging(Integer inactiveAging) {
        this.inactiveAging = inactiveAging;
        return this;
    }
    public Integer getInactiveAging() {
        return this.inactiveAging;
    }

    public CreateFlowLogRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateFlowLogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowLogRequest setNetflowServerIp(String netflowServerIp) {
        this.netflowServerIp = netflowServerIp;
        return this;
    }
    public String getNetflowServerIp() {
        return this.netflowServerIp;
    }

    public CreateFlowLogRequest setNetflowServerPort(Integer netflowServerPort) {
        this.netflowServerPort = netflowServerPort;
        return this;
    }
    public Integer getNetflowServerPort() {
        return this.netflowServerPort;
    }

    public CreateFlowLogRequest setNetflowVersion(String netflowVersion) {
        this.netflowVersion = netflowVersion;
        return this;
    }
    public String getNetflowVersion() {
        return this.netflowVersion;
    }

    public CreateFlowLogRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public CreateFlowLogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFlowLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFlowLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFlowLogRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

}
