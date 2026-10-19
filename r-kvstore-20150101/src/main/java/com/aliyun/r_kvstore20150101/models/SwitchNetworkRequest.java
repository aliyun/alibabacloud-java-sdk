// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchNetworkRequest extends TeaModel {
    /**
     * <p>The retention period of the classic network connectivity endpoint. Valid values: <strong>14</strong>, <strong>30</strong>, <strong>60</strong>, and <strong>120</strong>. Unit: days.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is active and required only when <strong>RetainClassic</strong> is set to <strong>True</strong>.</li>
     * <li>After the switchover is complete, you can invoke <a href="https://help.aliyun.com/document_detail/473793.html">ModifyInstanceNetExpireTime</a> to modify the retention period of the classic network connectivity endpoint.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ClassicExpiredDays")
    public String classicExpiredDays;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
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
     * <p>Specifies whether to retain the classic network connectivity endpoint when you switch the instance from the classic network to a VPC. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The classic network endpoint is retained.</li>
     * <li><strong>False</strong>: The classic network endpoint is not retained. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is active only when the network type of the instance is classic network.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RetainClassic")
    public String retainClassic;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The network type to which you want to switch. Set the value to <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TargetNetworkType")
    public String targetNetworkType;

    /**
     * <p>The ID of the vSwitch in the destination VPC. You can call <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> to query vSwitch IDs.</p>
     * <blockquote>
     * <p>The vSwitch must be in the same zone as the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which you want to switch. You can call <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> to query VPC IDs.</p>
     * <blockquote>
     * <ul>
     * <li>The VPC must be in the same region as the instance.</li>
     * <li>After you specify this parameter, you must also specify the <strong>VSwitchId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
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
