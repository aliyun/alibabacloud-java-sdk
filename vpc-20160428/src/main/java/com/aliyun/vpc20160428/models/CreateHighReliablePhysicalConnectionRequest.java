// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApList")
    public java.util.List<CreateHighReliablePhysicalConnectionRequestApList> apList;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MultiApMultiDevice</p>
     */
    @NameInMap("HighReliableType")
    public String highReliableType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4p****</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-beijing-ft-A</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PortNum")
        public Integer portNum;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
