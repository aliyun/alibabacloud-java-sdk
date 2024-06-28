// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The access point ID of the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-beijing-ft-A</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>longtel001</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Express Connect circuit.</p>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
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
     * <ul>
     * <li><strong>CT</strong>: China Telecom.</li>
     * <li><strong>CU</strong>: China Unicom.</li>
     * <li><strong>CM</strong>: China Mobile.</li>
     * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
     * <li><strong>Equinix</strong>: Equinix.</li>
     * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CT</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The name of the Express Connect circuit.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The geographical location of the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port type. Valid values:</p>
     * <ul>
     * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
     * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
     * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
     * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
     * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
     * </ul>
     * <blockquote>
     * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-119mfjzm****</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmoiyermp****</p>
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
     * <p>The type of Express Connect circuit. Default value: <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The maximum bandwidth of the hosted connection. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>300</strong>, <strong>400</strong>, <strong>500</strong>, <strong>1000</strong>, <strong>2000</strong>, <strong>4000</strong>, <strong>5000</strong>, <strong>8000</strong>, and <strong>10000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
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
         * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to add to the resource. You can specify up to 20 tag values The tag value can be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
