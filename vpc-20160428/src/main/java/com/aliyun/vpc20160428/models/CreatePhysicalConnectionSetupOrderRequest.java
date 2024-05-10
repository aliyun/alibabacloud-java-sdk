// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionSetupOrderRequest extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables automatic payment.</p>
     * <p>*   **true**: enables automatic payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
     * <br>
     * <p>*   **CT**: China Telecom</p>
     * <p>*   **CU**: China Unicom</p>
     * <p>*   **CM**: China Mobile</p>
     * <p>*   **CO**: other connectivity providers in the Chinese mainland</p>
     * <p>*   **Equinix**: Equinix</p>
     * <p>*   **Other**: other connectivity providers outside the Chinese mainland</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LineOperator")
    public String lineOperator;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port type. Valid values:</p>
     * <br>
     * <p>*   **100Base-T**: 100 Mbit/s copper Ethernet port</p>
     * <p>*   **1000Base-T** (default): 1,000 Mbit/s copper Ethernet port</p>
     * <p>*   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)</p>
     * <p>*   **10GBase-T**: 10,000 Mbit/s copper Ethernet port</p>
     * <p>*   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)</p>
     * <p>*   **40GBase-LR**: 40,000 Mbit/s single-mode optical port</p>
     * <p>*   **100GBase-LR**: 100,000 Mbit/s single-mode optical port</p>
     * <br>
     * <p>>  Whether 40GBase-LR and 100GBase-LR ports can be created is based on resource supplies. For more information, contact your business manager.</p>
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
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
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
