// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DstIpAddr")
    public String dstIpAddr;

    @NameInMap("DstPort")
    public Integer dstPort;

    @NameInMap("FailCountThreshold")
    public Integer failCountThreshold;

    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProbeCount")
    public Integer probeCount;

    @NameInMap("ProbeInterval")
    public Integer probeInterval;

    @NameInMap("ProbeTimeout")
    public Integer probeTimeout;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RttFailThreshold")
    public Integer rttFailThreshold;

    @NameInMap("RttThreshold")
    public Integer rttThreshold;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SrcIpAddr")
    public String srcIpAddr;

    @NameInMap("SrcPort")
    public Integer srcPort;

    @NameInMap("Type")
    public String type;

    public static ModifyHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckRequest self = new ModifyHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHealthCheckRequest setDstIpAddr(String dstIpAddr) {
        this.dstIpAddr = dstIpAddr;
        return this;
    }
    public String getDstIpAddr() {
        return this.dstIpAddr;
    }

    public ModifyHealthCheckRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public ModifyHealthCheckRequest setFailCountThreshold(Integer failCountThreshold) {
        this.failCountThreshold = failCountThreshold;
        return this;
    }
    public Integer getFailCountThreshold() {
        return this.failCountThreshold;
    }

    public ModifyHealthCheckRequest setHcInstanceId(String hcInstanceId) {
        this.hcInstanceId = hcInstanceId;
        return this;
    }
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    public ModifyHealthCheckRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHealthCheckRequest setProbeCount(Integer probeCount) {
        this.probeCount = probeCount;
        return this;
    }
    public Integer getProbeCount() {
        return this.probeCount;
    }

    public ModifyHealthCheckRequest setProbeInterval(Integer probeInterval) {
        this.probeInterval = probeInterval;
        return this;
    }
    public Integer getProbeInterval() {
        return this.probeInterval;
    }

    public ModifyHealthCheckRequest setProbeTimeout(Integer probeTimeout) {
        this.probeTimeout = probeTimeout;
        return this;
    }
    public Integer getProbeTimeout() {
        return this.probeTimeout;
    }

    public ModifyHealthCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyHealthCheckRequest setRttFailThreshold(Integer rttFailThreshold) {
        this.rttFailThreshold = rttFailThreshold;
        return this;
    }
    public Integer getRttFailThreshold() {
        return this.rttFailThreshold;
    }

    public ModifyHealthCheckRequest setRttThreshold(Integer rttThreshold) {
        this.rttThreshold = rttThreshold;
        return this;
    }
    public Integer getRttThreshold() {
        return this.rttThreshold;
    }

    public ModifyHealthCheckRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyHealthCheckRequest setSrcIpAddr(String srcIpAddr) {
        this.srcIpAddr = srcIpAddr;
        return this;
    }
    public String getSrcIpAddr() {
        return this.srcIpAddr;
    }

    public ModifyHealthCheckRequest setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public Integer getSrcPort() {
        return this.srcPort;
    }

    public ModifyHealthCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
