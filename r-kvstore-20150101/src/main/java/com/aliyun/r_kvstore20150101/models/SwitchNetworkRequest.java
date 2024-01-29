// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchNetworkRequest extends TeaModel {
    /**
     * <p>The retention period of the endpoint for the classic network. Valid values: **14**, **30**, **60**, and **120**. Unit: days.</p>
     * <br>
     * <p>> *   This parameter is required when **RetainClassic** is set to **True**.</p>
     * <p>> *   After you complete the switchover operation, you can also call the [ModifyInstanceNetExpireTime](~~ModifyInstanceNetExpireTime~~) operation to modify the retention period of the endpoint for the classic network.</p>
     */
    @NameInMap("ClassicExpiredDays")
    public String classicExpiredDays;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~DescribeInstances~~) operation to query instance IDs.</p>
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

    /**
     * <p>Specifies whether to retain the original endpoint for the classic network after you switch the instance from classic network to VPC. Valid values:</p>
     * <br>
     * <p>*   **True**: retains the original endpoint.</p>
     * <p>*   **False**: does not retain the original endpoint. This is the default value.</p>
     * <br>
     * <p>>  This parameter can be used only when the network type of the instance is classic network.</p>
     */
    @NameInMap("RetainClassic")
    public String retainClassic;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The network type to which you want to switch. Set the value to **VPC**.</p>
     */
    @NameInMap("TargetNetworkType")
    public String targetNetworkType;

    /**
     * <p>The ID of the vSwitch that belongs to the VPC to which you want to switch. You can call the [DescribeVpcs](~~35739~~) operation to query vSwitch IDs.</p>
     * <br>
     * <p>>  The vSwitch and the ApsaraDB for Redis instance must belong to the same zone.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which you want to switch. You can call the [DescribeVpcs](~~35739~~) operation to query VPC IDs.</p>
     * <br>
     * <p>> *   The VPC and the ApsaraDB for Redis instance must be deployed in the same region.</p>
     * <p>> *   After you set this parameter, you must also set the **VSwitchId** parameter.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SwitchNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchNetworkRequest self = new SwitchNetworkRequest();
        return TeaModel.build(map, self);
    }

    public SwitchNetworkRequest setClassicExpiredDays(String classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public String getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public SwitchNetworkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchNetworkRequest setRetainClassic(String retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public String getRetainClassic() {
        return this.retainClassic;
    }

    public SwitchNetworkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchNetworkRequest setTargetNetworkType(String targetNetworkType) {
        this.targetNetworkType = targetNetworkType;
        return this;
    }
    public String getTargetNetworkType() {
        return this.targetNetworkType;
    }

    public SwitchNetworkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public SwitchNetworkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
