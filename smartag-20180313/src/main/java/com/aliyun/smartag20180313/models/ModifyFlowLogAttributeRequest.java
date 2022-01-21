// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeRequest extends TeaModel {
    @NameInMap("ActiveAging")
    public Integer activeAging;

    @NameInMap("Description")
    public String description;

    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("InactiveAging")
    public Integer inactiveAging;

    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetflowServerIp")
    public String netflowServerIp;

    @NameInMap("NetflowServerPort")
    public Integer netflowServerPort;

    @NameInMap("NetflowVersion")
    public String netflowVersion;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
