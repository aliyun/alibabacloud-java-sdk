// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeRequest extends TeaModel {
    /**
     * <p>The number of days for which you want to retain the classic network endpoint. Valid values: **1 to 120**. Default value: **7**.</p>
     * <br>
     * <p>> If you set the **RetainClassic** parameter to **True**, you must also specify this parameter.</p>
     */
    @NameInMap("ClassicExpiredDays")
    public String classicExpiredDays;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type after the modification. Set the value to **VPC**.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The internal IP address of the instance. The internal IP address must be within the CIDR block supported by the specified vSwitch. ApsaraDB RDS automatically assigns an internal IP address to the instance based on the values of the **VPCId** and **VSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of days for which you want to retain the read/write splitting endpoint of the classic network type. Valid values: **1 to 120**. Default value: **7**.</p>
     * <br>
     * <p>> This parameter takes effect only when a read/write splitting endpoint of the classic network type exists and the **RetainClassic** parameter is set to **True**.</p>
     */
    @NameInMap("ReadWriteSplittingClassicExpiredDays")
    public Integer readWriteSplittingClassicExpiredDays;

    /**
     * <p>The internal IP address that corresponds to the read/write splitting endpoint of the instance. The internal IP address must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address to the read-only instance based on the values of the **VPCId** and **VSwitchId** parameters.</p>
     * <br>
     * <p>> This value is valid when a read/write splitting endpoint of the classic network type exists.</p>
     */
    @NameInMap("ReadWriteSplittingPrivateIpAddress")
    public String readWriteSplittingPrivateIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to retain the classic network endpoint. Valid values:</p>
     * <br>
     * <p>*   **True**: retains the classic network endpoint.</p>
     * <p>*   **False**: does not retain the classic network endpoint.</p>
     * <br>
     * <p>Default value: **False**.</p>
     */
    @NameInMap("RetainClassic")
    public String retainClassic;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. This parameter is required if the **VPCId** parameter is specified.</p>
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
