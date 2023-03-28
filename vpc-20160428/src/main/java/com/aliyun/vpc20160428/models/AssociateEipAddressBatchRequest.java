// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressBatchRequest extends TeaModel {
    /**
     * <p>The ID of the instance to be associated with EIPs.</p>
     * <br>
     * <p>The instance can be a NAT gateway or a secondary ENI.</p>
     */
    @NameInMap("BindedInstanceId")
    public String bindedInstanceId;

    /**
     * <p>The type of instance with which you want to associate the EIPs. Valid values:</p>
     * <br>
     * <p>*   **Nat**: a NAT gateway</p>
     * <p>*   **NetworkInterface**: a secondary ENI</p>
     */
    @NameInMap("BindedInstanceType")
    public String bindedInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can only contain ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** might be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The association mode. Set the value to **MULTI_BINDED**, which specifies the Multi-EIP-to-ENI mode.</p>
     * <br>
     * <p>This parameter is required only if **InstanceType** is set to **NetworkInterface**.</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the EIPs belong.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.</p>
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
