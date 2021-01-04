// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ActiveAging")
    public Integer activeAging;

    @NameInMap("InactiveAging")
    public Integer inactiveAging;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("NetflowServerIp")
    public String netflowServerIp;

    @NameInMap("NetflowServerPort")
    public Integer netflowServerPort;

    @NameInMap("NetflowVersion")
    public String netflowVersion;

    @NameInMap("FlowLogId")
    public String flowLogId;

    public static ModifyFlowLogAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeRequest self = new ModifyFlowLogAttributeRequest();
        return TeaModel.build(map, self);
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

    public ModifyFlowLogAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowLogAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowLogAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowLogAttributeRequest setActiveAging(Integer activeAging) {
        this.activeAging = activeAging;
        return this;
    }
    public Integer getActiveAging() {
        return this.activeAging;
    }

    public ModifyFlowLogAttributeRequest setInactiveAging(Integer inactiveAging) {
        this.inactiveAging = inactiveAging;
        return this;
    }
    public Integer getInactiveAging() {
        return this.inactiveAging;
    }

    public ModifyFlowLogAttributeRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public ModifyFlowLogAttributeRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public ModifyFlowLogAttributeRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyFlowLogAttributeRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
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

    public ModifyFlowLogAttributeRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

}
