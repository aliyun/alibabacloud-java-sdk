// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderRequest extends TeaModel {
    /**
     * <p>The access point ID.</p>
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
     * <li><strong>false</strong> (default): Automatic payment is disabled.</li>
     * <li><strong>true</strong>: Automatic payment is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>318BB676-0A2B-43A0-9AD8-F1D34E93750F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The carrier that provides the physical connection. Valid values:</p>
     * <ul>
     * <li><p><strong>CT</strong>: China Telecom</p>
     * </li>
     * <li><p><strong>CU</strong>: China Unicom</p>
     * </li>
     * <li><p><strong>CM</strong>: China Mobile</p>
     * </li>
     * <li><p><strong>CO</strong>: Other carriers in the Chinese mainland</p>
     * </li>
     * <li><p><strong>Equinix</strong>: Equinix</p>
     * </li>
     * <li><p><strong>Other</strong>: Other carriers outside the Chinese mainland</p>
     * </li>
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
     * <p>The port type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><p><strong>100Base-T</strong>: 100M Ethernet port.</p>
     * </li>
     * <li><p><strong>1000Base-T</strong> (default): 1 GE electrical port.</p>
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
     * <p>The default value <strong>1000Base-T</strong> is available only at access points that support this port type. Before calling this operation, call ListBusinessAccessPoints to query the <strong>SupportPortTypes</strong> of the target access point. For optical ports, also verify the <strong>OpticalModuleModels</strong>.</p>
     * <blockquote>
     * <p>40GBase-LR and 100GBase-LR must be created based on the actual backend port availability. Contact your account manager for details.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the redundant Express Connect circuit. The circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10zsv5ntp****</p>
     */
    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
