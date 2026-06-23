// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong> (default): Chinese.</li>
     * <li><strong>en-US</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The list of access points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApList")
    public java.util.List<CreateHighReliablePhysicalConnectionRequestApList> apList;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of advanced device capabilities.</p>
     */
    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without creating the instance. The system checks the required parameters, request format, and instance status. If the check fails, the error code <code>DRYRUN.FAIL</code> is returned along with the corresponding error list. If the check succeeds, the code <code>DRYRUN.SUCCESS</code> is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. After the request passes the check, the instance is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The zone-redundancy mode. Valid values:</p>
     * <ul>
     * <li><strong>MultiApMultiDevice</strong>: maximum disaster recovery. This mode supports two different access points and two different devices, providing maximum disaster recovery.</li>
     * <li><strong>MultiApSingleDevice</strong>: enhanced disaster recovery. This mode supports two different access points and one device, providing enhanced disaster recovery.</li>
     * <li><strong>SingleApMultiDevice</strong>: development and testing. This mode supports one access point and two devices. This mode is recommended only for development and testing of non-critical workloads.</li>
     * <li><strong>SingleApMultiConnection</strong>: high-bandwidth load balancing. This mode is available only to users in the whitelist. It supports one access point, one device, and multiple physical ports. To use this mode, contact your account manager.</li>
     * </ul>
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
     * <p>The port type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><p><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</p>
     * </li>
     * <li><p><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</p>
     * </li>
     * <li><p><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</p>
     * </li>
     * <li><p><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>40GBase-LR and 100GBase-LR are subject to the actual port availability. For information about port availability, contact your account manager.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000Base-LX</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>rg-acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
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
         * <p>The ID of the access point for the Express Connect circuit.</p>
         * <blockquote>
         * <p>When <strong>HighReliableType</strong> is set to <strong>MultiApMultiDevice</strong> or <strong>MultiApSingleDevice</strong>, you must specify two different access points. When <strong>HighReliableType</strong> is set to <strong>SingleApMultiDevice</strong> or <strong>SingleApMultiConnection</strong>, you must specify one access point.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-beijing-ft-A</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The bandwidth of the shared Express Connect circuits. Unit: Mbit/s.</p>
         * <p>Valid values: 50, 100, 200, 300, 400, 500, 1000, 2000, 4000, 5000, 8000, and 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The circuit code provided by the connectivity provider for the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The description of the Express Connect circuit.</p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or Chinese character, but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><p><strong>CT</strong>: China Telecom.</p>
         * </li>
         * <li><p><strong>CU</strong>: China Unicom.</p>
         * </li>
         * <li><p><strong>CM</strong>: China Mobile.</p>
         * </li>
         * <li><p><strong>CO</strong>: other Chinese carriers. </p>
         * </li>
         * <li><p><strong>Equinix</strong>: Equinix.</p>
         * </li>
         * <li><p><strong>Other</strong>: other carriers outside the Chinese mainland.</p>
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
         * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-), but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The optical module model supported by the access point of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li>1000Base-LX: <ul>
         * <li><code>SFP-GE-LR-SM1310,10KM</code></li>
         * <li><code>SFP-GE-ER-SM1310,40KM</code></li>
         * <li><code>SFP-GE-ZR-SM1550,80KM</code></li>
         * </ul>
         * </li>
         * <li>10GBase-LR: <ul>
         * <li><code>SFP-10G-LR-SM1310,10KM</code></li>
         * <li><code>SFP-10G-ER-SM1550,40KM</code> </li>
         * <li><code>SFP-10G-ZR-SM1550,80KM</code></li>
         * </ul>
         * </li>
         * <li>40GBase-LR: <ul>
         * <li><code>QSFP-40G-LR4-WDM1300,10KM</code></li>
         * <li><code>QSFP-40G-ER4-WDM1300,40KM</code></li>
         * <li><code>QSFP-40G-ZR4-WDM1300,80KM</code></li>
         * </ul>
         * </li>
         * <li>100GBase-LR: <ul>
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

        /**
         * <p>The geographic location of the on-premises data center.</p>
         * 
         * <strong>example:</strong>
         * <p>XX街道</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The number of ports. This parameter is required only when <strong>HighReliableType</strong> is set to <strong>SingleApMultiConnection</strong>. Valid values: 2 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PortNum")
        public Integer portNum;

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
         * <p>The type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
         * 
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

        public CreateHighReliablePhysicalConnectionRequestApList setOpticalModuleModel(String opticalModuleModel) {
            this.opticalModuleModel = opticalModuleModel;
            return this;
        }
        public String getOpticalModuleModel() {
            return this.opticalModuleModel;
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
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
