// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeRequest extends TeaModel {
    /**
     * <p>The number of days for the classic network address reservation. Valid values: <strong>1</strong> to <strong>120</strong>. Unit: days. Default value: <strong>7</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when the <strong>RetainClassic</strong> parameter is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ClassicExpiredDays")
    public String classicExpiredDays;

    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The target network type. Set the value to <strong>VPC</strong>, which indicates a virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Settings for the internal network IP address of the instance. The IP address must be within the address range of the specified vSwitch. By default, the system automatically allocates an IP address based on the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.10.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of days for the classic network address reservation for read/write splitting. Valid values: <strong>1</strong> to <strong>120</strong>. Unit: days. Default value: <strong>7</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the instance has a read/write splitting address of the classic network type and the <strong>RetainClassic</strong> parameter is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ReadWriteSplittingClassicExpiredDays")
    public Integer readWriteSplittingClassicExpiredDays;

    /**
     * <p>Settings for the internal network IP address of the read/write splitting endpoint for the instance. The IP address must be within the address range of the specified vSwitch. By default, the system automatically allocates an IP address based on the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the instance has a read/write splitting address of the classic network type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ReadWriteSplittingPrivateIpAddress")
    public String readWriteSplittingPrivateIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to retain the classic network endpoint. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Retains the classic network endpoint.</li>
     * <li><strong>False</strong>: Does not retain the classic network endpoint. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RetainClassic")
    public String retainClassic;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. This parameter is required when the <strong>VPCId</strong> parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBInstanceNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeRequest self = new ModifyDBInstanceNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkTypeRequest setClassicExpiredDays(String classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public String getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public ModifyDBInstanceNetworkTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceNetworkTypeRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public ModifyDBInstanceNetworkTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceNetworkTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceNetworkTypeRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ModifyDBInstanceNetworkTypeRequest setReadWriteSplittingClassicExpiredDays(Integer readWriteSplittingClassicExpiredDays) {
        this.readWriteSplittingClassicExpiredDays = readWriteSplittingClassicExpiredDays;
        return this;
    }
    public Integer getReadWriteSplittingClassicExpiredDays() {
        return this.readWriteSplittingClassicExpiredDays;
    }

    public ModifyDBInstanceNetworkTypeRequest setReadWriteSplittingPrivateIpAddress(String readWriteSplittingPrivateIpAddress) {
        this.readWriteSplittingPrivateIpAddress = readWriteSplittingPrivateIpAddress;
        return this;
    }
    public String getReadWriteSplittingPrivateIpAddress() {
        return this.readWriteSplittingPrivateIpAddress;
    }

    public ModifyDBInstanceNetworkTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceNetworkTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceNetworkTypeRequest setRetainClassic(String retainClassic) {
        this.retainClassic = retainClassic;
        return this;
    }
    public String getRetainClassic() {
        return this.retainClassic;
    }

    public ModifyDBInstanceNetworkTypeRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBInstanceNetworkTypeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
