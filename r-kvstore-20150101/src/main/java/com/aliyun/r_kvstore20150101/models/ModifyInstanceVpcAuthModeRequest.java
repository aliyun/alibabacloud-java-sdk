// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ModifyInstanceVpcAuthMode**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to enable password authentication for access in the VPC. Valid values:</p>
     * <br>
     * <p>*   **Open**: enables password authentication.</p>
     * <p>*   **Close**: disables password authentication.</p>
     * <br>
     * <p>>  Default value: **Open**.</p>
     */
    @NameInMap("VpcAuthMode")
    public String vpcAuthMode;

    public static ModifyInstanceVpcAuthModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeRequest self = new ModifyInstanceVpcAuthModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVpcAuthModeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceVpcAuthModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceVpcAuthModeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceVpcAuthModeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceVpcAuthModeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyInstanceVpcAuthModeRequest setVpcAuthMode(String vpcAuthMode) {
        this.vpcAuthMode = vpcAuthMode;
        return this;
    }
    public String getVpcAuthMode() {
        return this.vpcAuthMode;
    }

}
