// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressBatchRequest extends TeaModel {
    /**
     * <p>The ID of the instance with which you want to associate the EIPs.</p>
     * <br>
     * <p>The instance can be a NAT gateway or a secondary ENI.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindedInstanceId")
    public String bindedInstanceId;

    /**
     * <p>The type of the instance with which you want to associate the EIPs. Valid values:</p>
     * <br>
     * <p>*   **Nat**: NAT gateway</p>
     * <p>*   **NetworkInterface**: secondary ENI</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindedInstanceType")
    public String bindedInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The EIPs to be associated with the instance.</p>
     * <br>
     * <p>You must enter at least one EIP. You can enter up to 50 EIPs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The association mode. Set the value to **MULTI_BINDED**, which specifies the Multi-EIP-to-ENI mode.</p>
     * <br>
     * <p>This parameter is required only when **BindedInstanceType** is set to **NetworkInterface**.</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the EIPs belong. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssociateEipAddressBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressBatchRequest self = new AssociateEipAddressBatchRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressBatchRequest setBindedInstanceId(String bindedInstanceId) {
        this.bindedInstanceId = bindedInstanceId;
        return this;
    }
    public String getBindedInstanceId() {
        return this.bindedInstanceId;
    }

    public AssociateEipAddressBatchRequest setBindedInstanceType(String bindedInstanceType) {
        this.bindedInstanceType = bindedInstanceType;
        return this;
    }
    public String getBindedInstanceType() {
        return this.bindedInstanceType;
    }

    public AssociateEipAddressBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateEipAddressBatchRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AssociateEipAddressBatchRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AssociateEipAddressBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateEipAddressBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateEipAddressBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
