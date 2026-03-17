// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeRequest extends TeaModel {
    /**
     * <p>The interval at which log data of active network connections is collected. Default value: <strong>300</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ActiveAging")
    public Integer activeAging;

    /**
     * <p>The description of the flow log.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the flow log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fl-7a56mar1kfw9vj****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The interval at which log data of inactive network connections is collected. Default value: <strong>15</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("InactiveAging")
    public Integer inactiveAging;

    /**
     * <p>The Logstore of Log Service. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ssfghgh</p>
     */
    @NameInMap("LogstoreName")
    public String logstoreName;

    /**
     * <p>The name of the flow log.</p>
     * 
     * <strong>example:</strong>
     * <p>DDE</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IP address of the NetFlow collector where the flow log is stored. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.2</p>
     */
    @NameInMap("NetflowServerIp")
    public String netflowServerIp;

    /**
     * <p>The port of the NetFlow collector. Default value: <strong>9995</strong>. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>9995</p>
     */
    @NameInMap("NetflowServerPort")
    public Integer netflowServerPort;

    /**
     * <p>The NetFlow version. Valid values: <strong>V5</strong>, <strong>V9</strong>, and <strong>V10</strong>. Default value: <strong>V9</strong>. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>V9</p>
     */
    @NameInMap("NetflowVersion")
    public String netflowVersion;

    /**
     * <p>The location where the flow log is stored. Valid values:</p>
     * <ul>
     * <li><strong>sls</strong>: The flow log is stored in Log Service.</li>
     * <li><strong>netflow</strong>: The flow log is stored on a NetFlow collector.</li>
     * <li><strong>all</strong>: The flow log is stored both in Log Service and on a NetFlow collector.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The project to which the Logstore of Log Service belongs. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ddrrgt</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the region where the flow log is deployed.</p>
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
     * <p>The ID of the region where Log Service is deployed. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    public static ModifyFlowLogAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeRequest self = new ModifyFlowLogAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeRequest setActiveAging(Integer activeAging) {
        this.activeAging = activeAging;
        return this;
    }
    public Integer getActiveAging() {
        return this.activeAging;
    }

    public ModifyFlowLogAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowLogAttributeRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public ModifyFlowLogAttributeRequest setInactiveAging(Integer inactiveAging) {
        this.inactiveAging = inactiveAging;
        return this;
    }
    public Integer getInactiveAging() {
        return this.inactiveAging;
    }

    public ModifyFlowLogAttributeRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ModifyFlowLogAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowLogAttributeRequest setNetflowServerIp(String netflowServerIp) {
        this.netflowServerIp = netflowServerIp;
        return this;
    }
    public String getNetflowServerIp() {
        return this.netflowServerIp;
    }

    public ModifyFlowLogAttributeRequest setNetflowServerPort(Integer netflowServerPort) {
        this.netflowServerPort = netflowServerPort;
        return this;
    }
    public Integer getNetflowServerPort() {
        return this.netflowServerPort;
    }

    public ModifyFlowLogAttributeRequest setNetflowVersion(String netflowVersion) {
        this.netflowVersion = netflowVersion;
        return this;
    }
    public String getNetflowVersion() {
        return this.netflowVersion;
    }

    public ModifyFlowLogAttributeRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public ModifyFlowLogAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyFlowLogAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFlowLogAttributeRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyFlowLogAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyFlowLogAttributeRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

}
