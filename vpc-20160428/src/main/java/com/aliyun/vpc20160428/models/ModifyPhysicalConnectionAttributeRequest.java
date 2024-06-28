// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeRequest extends TeaModel {
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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>efefe566754h</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Express Connect circuit.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the Express Connect circuit.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><strong>CT</strong>: China Telecom</li>
     * <li><strong>CU</strong>: China Unicom</li>
     * <li><strong>CM</strong>: China Mobile</li>
     * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
     * <li><strong>Equinix</strong>: Equinix</li>
     * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CT</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    /**
     * <p>The name of the Express Connect circuit.</p>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
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
     * <p>XX Number, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-119mfjzm******</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The port type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-T</strong> (default): 1,000 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 kilometers)</li>
     * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
     * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 kilometers)</li>
     * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
     * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
     * </ul>
     * <blockquote>
     * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000Base-LX</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-119mfjzm7</p>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The bandwidth value for the connection over the Express Connect circuit. Unit: Mbit/s. Valid values: 2 to 10240.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("bandwidth")
    public Integer bandwidth;

    public static ModifyPhysicalConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeRequest self = new ModifyPhysicalConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

    public ModifyPhysicalConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPhysicalConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhysicalConnectionAttributeRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public ModifyPhysicalConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPhysicalConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPhysicalConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPhysicalConnectionAttributeRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public ModifyPhysicalConnectionAttributeRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public ModifyPhysicalConnectionAttributeRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPhysicalConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyPhysicalConnectionAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

}
