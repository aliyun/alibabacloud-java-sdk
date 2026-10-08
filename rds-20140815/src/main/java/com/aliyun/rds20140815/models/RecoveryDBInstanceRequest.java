// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceRequest extends TeaModel {
    /**
     * <p>The backup set ID. You can call the DescribeBackups operation to query backup sets.</p>
     * <p>If you specify this parameter, the <strong>DBInstanceId</strong> parameter is optional.</p>
     * <blockquote>
     * <p>You must specify at least one of <strong>BackupId</strong> and <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>29304****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The instance type of the new instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mssql.x4.medium.s1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID of the original instance.</p>
     * <blockquote>
     * <ul>
     * <li>If you want to recover data by backup set (by specifying the BackupId parameter), this parameter is optional.</li>
     * <li>If you want to recover data to a point in time (by specifying the RestoreTime parameter), this parameter is required.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp18****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance storage capacity of the new instance. Unit: GB. For details, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <blockquote>
     * <p>The disk space of the new instance cannot be smaller than that of the original instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd/ephemeral_ssd</strong>: local SSD.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD cloud disk.</li>
     * <li><strong>cloud_essd</strong>: Enterprise SSD (ESSD) cloud disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The database name. To restore data to a new instance, use the following format: <code>Original database name 1,New database name 2</code>.</p>
     * <blockquote>
     * <p>To restore data to an existing instance, see <a href="https://help.aliyun.com/document_detail/2628854.html">CopyDatabaseBetweenInstances</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The network type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong>: classic network.</li>
     * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
     * </ul>
     * <p>Default value: the network type of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: year.</li>
     * <li><strong>Month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance. The IP address must be within the IP address range of the specified vSwitch. By default, the system automatically assigns an IP address based on the values of <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.69</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Any point in time within the backup retention period. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <p>If you specify this parameter, the <strong>DBInstanceId</strong> parameter is required.</p>
     * <blockquote>
     * <p>You must specify at least one of <strong>BackupId</strong> and <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2011-06-11T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The instance ID of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp17****</p>
     */
    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    /**
     * <p>The subscription duration of the new instance. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the value of <strong>UsedTime</strong> ranges from <strong>1 to 3</strong>.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the value of <strong>UsedTime</strong> ranges from <strong>1 to 9</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID of the new instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the new instance. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
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
