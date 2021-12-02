// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeployAppRequest extends TeaModel {
    @NameInMap("ArmsFlag")
    public Boolean armsFlag;

    @NameInMap("ContainerImageList")
    public java.util.List<String> containerImageList;

    @NameInMap("DefaultPacketOfAppGroup")
    public String defaultPacketOfAppGroup;

    @NameInMap("DeployPacketId")
    public Long deployPacketId;

    @NameInMap("DeployPacketUrl")
    public String deployPacketUrl;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("InitContainerImageList")
    public java.util.List<String> initContainerImageList;

    @NameInMap("Name")
    public String name;

    @NameInMap("PauseType")
    public String pauseType;

    @NameInMap("TotalPartitions")
    public Integer totalPartitions;

    @NameInMap("UpdateStrategyType")
    public String updateStrategyType;

    public static DeployAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployAppRequest self = new DeployAppRequest();
        return TeaModel.build(map, self);
    }

    public DeployAppRequest setArmsFlag(Boolean armsFlag) {
        this.armsFlag = armsFlag;
        return this;
    }
    public Boolean getArmsFlag() {
        return this.armsFlag;
    }

    public DeployAppRequest setContainerImageList(java.util.List<String> containerImageList) {
        this.containerImageList = containerImageList;
        return this;
    }
    public java.util.List<String> getContainerImageList() {
        return this.containerImageList;
    }

    public DeployAppRequest setDefaultPacketOfAppGroup(String defaultPacketOfAppGroup) {
        this.defaultPacketOfAppGroup = defaultPacketOfAppGroup;
        return this;
    }
    public String getDefaultPacketOfAppGroup() {
        return this.defaultPacketOfAppGroup;
    }

    public DeployAppRequest setDeployPacketId(Long deployPacketId) {
        this.deployPacketId = deployPacketId;
        return this;
    }
    public Long getDeployPacketId() {
        return this.deployPacketId;
    }

    public DeployAppRequest setDeployPacketUrl(String deployPacketUrl) {
        this.deployPacketUrl = deployPacketUrl;
        return this;
    }
    public String getDeployPacketUrl() {
        return this.deployPacketUrl;
    }

    public DeployAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployAppRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DeployAppRequest setInitContainerImageList(java.util.List<String> initContainerImageList) {
        this.initContainerImageList = initContainerImageList;
        return this;
    }
    public java.util.List<String> getInitContainerImageList() {
        return this.initContainerImageList;
    }

    public DeployAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployAppRequest setPauseType(String pauseType) {
        this.pauseType = pauseType;
        return this;
    }
    public String getPauseType() {
        return this.pauseType;
    }

    public DeployAppRequest setTotalPartitions(Integer totalPartitions) {
        this.totalPartitions = totalPartitions;
        return this;
    }
    public Integer getTotalPartitions() {
        return this.totalPartitions;
    }

    public DeployAppRequest setUpdateStrategyType(String updateStrategyType) {
        this.updateStrategyType = updateStrategyType;
        return this;
    }
    public String getUpdateStrategyType() {
        return this.updateStrategyType;
    }

}
