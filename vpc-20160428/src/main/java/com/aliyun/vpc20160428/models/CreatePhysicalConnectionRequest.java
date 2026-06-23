// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the access point where the Express Connect circuit is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-beijing-ft-A</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The circuit code provided by the carrier for the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>longtel001</p>
     */
    @NameInMap("CircuitCode")
    public String circuitCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Express Connect circuit. </p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of device advanced capabilities.</p>
     */
    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    /**
     * <p>The carrier that provides the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><p><strong>CT</strong>: China Telecom.</p>
     * </li>
     * <li><p><strong>CU</strong>: China Unicom.</p>
     * </li>
     * <li><p><strong>CM</strong>: China Mobile.</p>
     * </li>
     * <li><p><strong>CO</strong>: Other carriers in China. </p>
     * </li>
     * <li><p><strong>Equinix</strong>: Equinix.</p>
     * </li>
     * <li><p><strong>Other</strong>: Other carriers outside China.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CT</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The name of the Express Connect circuit.  </p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The optical module model supported by the Express Connect circuit access point. Valid values:</p>
     * <ul>
     * <li>1000Base-LX : <ul>
     * <li><code>SFP-GE-LR-SM1310,10KM</code></li>
     * <li><code>SFP-GE-ER-SM1310,40KM</code></li>
     * <li><code>SFP-GE-ZR-SM1550,80KM</code></li>
     * </ul>
     * </li>
     * <li>10GBase-LR : <ul>
     * <li><code>SFP-10G-LR-SM1310,10KM</code></li>
     * <li><code>SFP-10G-ER-SM1550,40KM</code> </li>
     * <li><code>SFP-10G-ZR-SM1550,80KM</code></li>
     * </ul>
     * </li>
     * <li>40GBase-LR : <ul>
     * <li><code>QSFP-40G-LR4-WDM1300,10KM</code></li>
     * <li><code>QSFP-40G-ER4-WDM1300,40KM</code></li>
     * <li><code>QSFP-40G-ZR4-WDM1300,80KM</code></li>
     * </ul>
     * </li>
     * <li>100GBase-LR : <ul>
     * <li><code>QSFP28-100G-LR4-WDM1300,10KM</code></li>
     * <li><code>QSFP28-100G-ER4-WDM1300,40KM</code></li>
     * <li><code>QSFP28-100G-ZR4-WDM1300,80KM</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SFP-GE-LR-SM1310,10KM</p>
     */
    @NameInMap("OpticalModuleModel")
    public String opticalModuleModel;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The geographical location of the on-premises data center.</p>
     * 
     * <strong>example:</strong>
     * <p>XX街道</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><p><strong>100Base-T</strong>: 100M Ethernet port.</p>
     * </li>
     * <li><p><strong>1000Base-T</strong>: 1 GE electrical port.</p>
     * </li>
     * <li><p><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</p>
     * </li>
     * <li><p><strong>10GBase-T</strong>: 10 GE electrical port.</p>
     * </li>
     * <li><p><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</p>
     * </li>
     * <li><p><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</p>
     * </li>
     * <li><p><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>40GBase-LR and 100GBase-LR are created based on the actual port availability in the backend. Contact your account manager for port availability details.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The instance ID of the redundant Express Connect circuit. The redundant circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-119mfjzm****</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePhysicalConnectionRequestTag> tag;

    /**
     * <p>The type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The bandwidth of the shared Express Connect circuits. Unit: Mbit/s.</p>
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

    public CreatePhysicalConnectionRequest setOpticalModuleModel(String opticalModuleModel) {
        this.opticalModuleModel = opticalModuleModel;
        return this;
    }
    public String getOpticalModuleModel() {
        return this.opticalModuleModel;
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
