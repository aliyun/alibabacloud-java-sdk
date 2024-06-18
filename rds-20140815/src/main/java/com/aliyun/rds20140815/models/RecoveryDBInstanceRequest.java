// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceRequest extends TeaModel {
    /**
     * <p>The backup set ID. You can call the DescribeBackups operation to query the backup set ID.</p>
     * <p>If you specify this parameter, you do not need to specify <strong>DBInstanceId</strong>.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameters.</p>
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
     * <p>rds.mysql.s2.large</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the original instance.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify BackupId, you do not need to specify this parameter.</li>
     * <li>If you specify RestoreTime, you must also specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxxxxxx1</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance. Unit: GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <blockquote>
     * <p> You must set this parameter to a value that is greater than or equal to the storage capacity of the original instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd/ephemeral_ssd</strong>: local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The name of the database.</p>
     * <ul>
     * <li>If you want to restore databases to a new instance, the value is in the format of <code>Original database name 1,New database name 2</code>.</li>
     * <li>If you want to restore databases to an existing instance, the value is in the format of <code>{&quot;Original database name 1&quot;:&quot;New database name 1&quot;,&quot;Original database name 2&quot;:&quot;New database name 2&quot;</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Restore databases to a new instance: test1,test2. Restore databases to an existing instance: {&quot;test1&quot;:&quot;newtest1&quot;,&quot;test2&quot;:&quot;newtest2&quot;}</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The network type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong></li>
     * <li><strong>VPC</strong></li>
     * </ul>
     * <p>By default, the new instance uses the same network type as the original instance.</p>
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
     * <p>The unit that is used to calculate the billing cycle of the new instance. This parameter takes effect only when you select the subscription billing method for the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance. The internal IP address must be within the CIDR block that is supported by the specified vSwitch. The system automatically assigns an internal IP address based on the values of the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XXX.XXX.69</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The point in time must fall within the specified log backup retention period. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>If you specify this parameter, you must also specify <strong>DBInstanceId</strong>.</p>
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
     * <p>The ID of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li>Valid values when <strong>Period</strong> is set to <strong>Year</strong>: <strong>1 to 3</strong>.****</li>
     * <li>Valid values when <strong>Period</strong> is set to <strong>Month</strong>: <strong>1 to 9</strong>.****</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be specified when PayType is set to <strong>Prepaid</strong>.</p>
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
     * <p>vpc-xxxxxxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the new instance. If you specify more than one vSwitch ID, you must separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxx</p>
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
