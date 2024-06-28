// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderRequest extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-beijing-ft-A</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disables automatic payment.</li>
     * <li><strong>true</strong>: enables automatic payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system automatically uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>318BB676-0A2B-43A0-9AD8-F1D34E93750F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CT</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port type. Valid values:</p>
     * <ul>
     * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-T</strong> (default): 1,000 Mbit/s copper Ethernet port</li>
     * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
     * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
     * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
     * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
     * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
     * </ul>
     * <blockquote>
     * <p> Whether 40GBase-LR and 100GBase-LR ports can be created is based on resource supplies. For more information, contact your business manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10zsv5ntp****</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreatePhysicalConnectionSetupOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionSetupOrderRequest self = new CreatePhysicalConnectionSetupOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionSetupOrderRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreatePhysicalConnectionSetupOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalConnectionSetupOrderRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public CreatePhysicalConnectionSetupOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePhysicalConnectionSetupOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreatePhysicalConnectionSetupOrderRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionSetupOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhysicalConnectionSetupOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
