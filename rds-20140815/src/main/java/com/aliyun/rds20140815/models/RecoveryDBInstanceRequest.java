// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the data backup file from which you want to restore databases. You can call the [DescribeBackups](~~26273~~) operation to query the most recent data backup file list.</p>
     * <br>
     * <p>If you specify this parameter, you can choose not to specify the **DBInstanceId** parameter.</p>
     * <br>
     * <p>>  You must specify either the **BackupId** or **RestoreTime** parameter.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The type of the new instance. For more information, see [Primary instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the original instance.</p>
     * <br>
     * <p>> * You do not need to specify this parameter when you restore databases from the data backup file specified by the BackupId parameter.</p>
     * <p>> * This parameter must be specified when you restore databases to the point in time specified by the RestoreTime parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance. Unit: GB. For more information, see [Primary instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the new instance. Valid values:</p>
     * <br>
     * <p>*   **local\_ssd** or **ephemeral_ssd:** specifies to use local SSDs.</p>
     * <p>*   **cloud_ssd:** specifies to use standard SSDs.</p>
     * <p>*   **cloud_essd:** specifies to use enhanced SSDs</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The name of the database you want to restore. If you specify more than one database, separate their names in the following format: {"Original Database Name 1":"New Database Name 1","Original Database Name 2":"New Database Name 2"}</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The network type of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Classic**</p>
     * <p>*   **VPC**</p>
     * <br>
     * <p>The new instance has the same network type as the original instance by default.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid:** specifies to use pay-as-you-go billing.</p>
     * <p>*   **Prepaid:** specifies to use subscription billing.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>>  This parameter must be specified when the **PayType** parameter is set to **Prepaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The private IP address of the new instance. The private IP address must be within the CIDR block supported by the specified vSwitch. The system automatically assigns a private IP address based on the **VPCId** and **VSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore databases. The point in time you specify must be within the log backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>If you specify this parameter, you must also specify the **DBInstanceId** parameter.</p>
     * <br>
     * <p>>  You must specify either the **BackupId** or **RestoreTime** parameter.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of the destination instance.</p>
     */
    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    /**
     * <p>The duration of the new instance if the new instance uses subscription billing. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1 to 3**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1 to 9**.</p>
     * <br>
     * <p>>  This parameter must be specified when the PayType parameter is set to **Prepaid**.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the VPC to which the new instance belongs.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch associated with the specified VPC. If you specify more than one vSwitch, separate their IDs with commas (,).</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static RecoveryDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDBInstanceRequest self = new RecoveryDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RecoveryDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public RecoveryDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public RecoveryDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RecoveryDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public RecoveryDBInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public RecoveryDBInstanceRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public RecoveryDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public RecoveryDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public RecoveryDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RecoveryDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RecoveryDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RecoveryDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public RecoveryDBInstanceRequest setTargetDBInstanceId(String targetDBInstanceId) {
        this.targetDBInstanceId = targetDBInstanceId;
        return this;
    }
    public String getTargetDBInstanceId() {
        return this.targetDBInstanceId;
    }

    public RecoveryDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public RecoveryDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public RecoveryDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
