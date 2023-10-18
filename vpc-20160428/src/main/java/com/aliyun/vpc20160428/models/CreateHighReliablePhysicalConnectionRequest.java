// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ApList")
    public java.util.List<CreateHighReliablePhysicalConnectionRequestApList> apList;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("HighReliableType")
    public String highReliableType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateHighReliablePhysicalConnectionRequestTag> tag;

    public static CreateHighReliablePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHighReliablePhysicalConnectionRequest self = new CreateHighReliablePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateHighReliablePhysicalConnectionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateHighReliablePhysicalConnectionRequest setApList(java.util.List<CreateHighReliablePhysicalConnectionRequestApList> apList) {
        this.apList = apList;
        return this;
    }
    public java.util.List<CreateHighReliablePhysicalConnectionRequestApList> getApList() {
        return this.apList;
    }

    public CreateHighReliablePhysicalConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHighReliablePhysicalConnectionRequest setDeviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
        this.deviceAdvancedCapacity = deviceAdvancedCapacity;
        return this;
    }
    public java.util.List<String> getDeviceAdvancedCapacity() {
        return this.deviceAdvancedCapacity;
    }

    public CreateHighReliablePhysicalConnectionRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CreateHighReliablePhysicalConnectionRequest setHighReliableType(String highReliableType) {
        this.highReliableType = highReliableType;
        return this;
    }
    public String getHighReliableType() {
        return this.highReliableType;
    }

    public CreateHighReliablePhysicalConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateHighReliablePhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateHighReliablePhysicalConnectionRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreateHighReliablePhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHighReliablePhysicalConnectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHighReliablePhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateHighReliablePhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateHighReliablePhysicalConnectionRequest setTag(java.util.List<CreateHighReliablePhysicalConnectionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateHighReliablePhysicalConnectionRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateHighReliablePhysicalConnectionRequestApList extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("Name")
        public String name;

        @NameInMap("PeerLocation")
        public String peerLocation;

        @NameInMap("PortNum")
        public Integer portNum;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Type")
        public String type;

        public static CreateHighReliablePhysicalConnectionRequestApList build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionRequestApList self = new CreateHighReliablePhysicalConnectionRequestApList();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionRequestApList setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setPortNum(Integer portNum) {
            this.portNum = portNum;
            return this;
        }
        public Integer getPortNum() {
            return this.portNum;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateHighReliablePhysicalConnectionRequestApList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateHighReliablePhysicalConnectionRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateHighReliablePhysicalConnectionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateHighReliablePhysicalConnectionRequestTag self = new CreateHighReliablePhysicalConnectionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateHighReliablePhysicalConnectionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateHighReliablePhysicalConnectionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
