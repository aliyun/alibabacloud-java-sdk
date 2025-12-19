// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHighReliablePhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The language to display the results. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong> (default): Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The access points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApList")
    public java.util.List<CreateHighReliablePhysicalConnectionRequestApList> apList;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The advanced features of the device.</p>
     */
    @NameInMap("DeviceAdvancedCapacity")
    public java.util.List<String> deviceAdvancedCapacity;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The high availability mode. Valid values:</p>
     * <ul>
     * <li><strong>MultiApMultiDevice</strong> : This mode supports two access points and two devices, and provides the maximum disaster recovery capability.</li>
     * <li><strong>MultiApSingleDevice</strong> : This mode supports two access points and one device, and provides robust disaster recovery capability.</li>
     * <li><strong>SingleApMultiDevice</strong> : This mode supports one access point and two devices, and is recommended for non-critical business test and development.</li>
     * <li><strong>SingleApMultiConnection</strong> : This mode supports one access point, one device, and multiple physical ports. Only users in the whitelist can use this mode. To use this mode, contact your account manager.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
         * <p>The ID of the access point that is associated with the Express Connect circuit.</p>
         * <blockquote>
         * <p>Two access points must be specified when <strong>HighReliableType</strong> is set to <strong>MultiApMultiDevice</strong> or <strong>MultiApSingleDevice</strong>. One access point must be specified when <strong>HighReliableType</strong> is set to <strong>SingleApMultiDevice</strong> or <strong>SingleApMultiConnection</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-beijing-ft-A</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The maximum bandwidth of the hosted connection. Unit: Mbit/s.</p>
         * <p>Valid values: 50, 100, 200, 300, 400, 500, 1000, 2000, 4000, 5000, 8000, and 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The circuit code of the Express Connect circuit, which is provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The description of the Express Connect circuit.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or<code> https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OpticalModuleModel")
        public String opticalModuleModel;

        /**
         * <p>The geographical location of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-test</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The number of ports. Valid values: 2 to 16. This parameter is required only when <strong>HighReliableType</strong> is set to <strong>SingleApMultiConnection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PortNum")
        public Integer portNum;

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
         * <p>The key of tag N to add to the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value cannot be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
