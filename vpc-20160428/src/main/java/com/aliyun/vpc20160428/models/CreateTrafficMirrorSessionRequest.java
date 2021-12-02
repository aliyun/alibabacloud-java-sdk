// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorSessionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PacketLength")
    public Integer packetLength;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    @NameInMap("TrafficMirrorSessionDescription")
    public String trafficMirrorSessionDescription;

    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    @NameInMap("TrafficMirrorSourceIds")
    public java.util.List<String> trafficMirrorSourceIds;

    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    @NameInMap("TrafficMirrorTargetType")
    public String trafficMirrorTargetType;

    @NameInMap("VirtualNetworkId")
    public Integer virtualNetworkId;

    public static CreateTrafficMirrorSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorSessionRequest self = new CreateTrafficMirrorSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorSessionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMirrorSessionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMirrorSessionRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateTrafficMirrorSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMirrorSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMirrorSessionRequest setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
        return this;
    }
    public Integer getPacketLength() {
        return this.packetLength;
    }

    public CreateTrafficMirrorSessionRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTrafficMirrorSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTrafficMirrorSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMirrorSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
        this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
        return this;
    }
    public String getTrafficMirrorSessionDescription() {
        return this.trafficMirrorSessionDescription;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSessionName(String trafficMirrorSessionName) {
        this.trafficMirrorSessionName = trafficMirrorSessionName;
        return this;
    }
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
        this.trafficMirrorSourceIds = trafficMirrorSourceIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    public CreateTrafficMirrorSessionRequest setTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
        return this;
    }
    public String getTrafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }

    public CreateTrafficMirrorSessionRequest setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

}
