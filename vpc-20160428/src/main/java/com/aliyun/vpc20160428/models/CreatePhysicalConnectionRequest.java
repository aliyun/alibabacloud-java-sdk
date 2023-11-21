// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The access point ID of the Express Connect circuit.</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Express Connect circuit.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The advanced features of the device.</p>
     */
    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    /**
     * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
     * <br>
     * <p>*   **CT**: China Telecom.</p>
     * <p>*   **CU**: China Unicom.</p>
     * <p>*   **CM**: China Mobile.</p>
     * <p>*   **CO**: other connectivity providers in the Chinese mainland.</p>
     * <p>*   **Equinix**: Equinix.</p>
     * <p>*   **Other**: other connectivity providers outside the Chinese mainland.</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The name of the Express Connect circuit.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The geographical location of the data center.</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port type. Valid values:</p>
     * <br>
     * <p>*   **100Base-T**: 100 Mbit/s copper Ethernet port</p>
     * <p>*   **1000Base-T**: 1,000 Mbit/s copper Ethernet port</p>
     * <p>*   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)</p>
     * <p>*   **10GBase-T**: 10,000 Mbit/s copper Ethernet port</p>
     * <p>*   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)</p>
     * <p>*   **40GBase-LR**: 40,000 Mbit/s single-mode optical port</p>
     * <p>*   **100GBase-LR**: 100,000 Mbit/s single-mode optical port</p>
     * <br>
     * <p>>  To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the **Allocated**, **Confirmed**, or **Enabled** state.</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePhysicalConnectionRequestTag> tag;

    /**
     * <p>The type of Express Connect circuit. Default value: **VPC**.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The maximum bandwidth of the hosted connection. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **50**, **100**, **200**, **300**, **400**, **500**, **1000**, **2000**, **4000**, **5000**, **8000**, and **10000**.</p>
     */
    @NameInMap("bandwidth")
    public Integer bandwidth;

    public static CreatePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionRequest self = new CreatePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreatePhysicalConnectionRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public CreatePhysicalConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePhysicalConnectionRequest setDeviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
        this.deviceAdvancedCapacity = deviceAdvancedCapacity;
        return this;
    }
    public java.util.List<String> getDeviceAdvancedCapacity() {
        return this.deviceAdvancedCapacity;
    }

    public CreatePhysicalConnectionRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public CreatePhysicalConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePhysicalConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhysicalConnectionRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public CreatePhysicalConnectionRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreatePhysicalConnectionRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public CreatePhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePhysicalConnectionRequest setTag(java.util.List<CreatePhysicalConnectionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePhysicalConnectionRequestTag> getTag() {
        return this.tag;
    }

    public CreatePhysicalConnectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePhysicalConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public static class CreatePhysicalConnectionRequestTag extends TeaModel {
        /**
         * <p>The key of tag to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to add to the resource. You can specify up to 20 tag values The tag value can be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePhysicalConnectionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePhysicalConnectionRequestTag self = new CreatePhysicalConnectionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePhysicalConnectionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePhysicalConnectionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
