// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstanceInformationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AgentVersion")
    public String agentVersion;

    @NameInMap("PlatformType")
    public String platformType;

    @NameInMap("PlatformName")
    public String platformName;

    @NameInMap("PlatformVersion")
    public String platformVersion;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("ComputerName")
    public String computerName;

    @NameInMap("AgentName")
    public String agentName;

    public static UpdateInstanceInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInformationRequest self = new UpdateInstanceInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceInformationRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UpdateInstanceInformationRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public UpdateInstanceInformationRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public UpdateInstanceInformationRequest setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }
    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public UpdateInstanceInformationRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public UpdateInstanceInformationRequest setComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }
    public String getComputerName() {
        return this.computerName;
    }

    public UpdateInstanceInformationRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

}
