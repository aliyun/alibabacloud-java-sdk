// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceRequest extends TeaModel {
    // description: 目的地域ID，可以通过接口[DescribeRegions](~~26243~~)查看地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 目的数据库类型，取值：**MySQL**。; 
    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    // description: 目的数据库版本，取值：* **5.6**；* **5.7**。; 
    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    // description: 目的实例规格，详见[实例规格表](~~26312~~)。; 
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    // description: 目的实例存储空间，取值： **5~2000**。每5G进行递增，单位：GB。详见[实例规格表](~~26312~~)。; 
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    // description: 目的实例的字符集，取值：* **utf8**；* **gbk**；* **latin1**；* **utf8mb4**。; 
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    // description: 目的实例的网络连接类型，取值：* **Internet**：公网连接；* **Intranet**：内网连接。; 
    @NameInMap("DBInstanceNetType")
    @Validation(required = true)
    public String DBInstanceNetType;

    // description: 目的实例名称，长度为2~256个字符。以中文、英文字母开头，可以包含数字、中文、英文、下划线（_）、短横线（-）。>不能以 http:// 和 https:// 开头。; 
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    // description: 目的实例的[IP白名单](~~43185~~)，多个IP地址请以英文逗号（,）隔开，不可重复，最多1000个。支持如下两种格式：* IP地址形式，例如：10.23.12.24；* CIDR形式，例如：10.23.12.24/24（无类域间路由，24表示了地址中前缀的长度，范围为1~32）。; 
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    public String securityIPList;

    // description: 用于保证请求的幂等性，防止重复提交请求。由客户端生成该参数值，要保证在不同请求间唯一，最大值不超过64个ASCII字符，且该参数值中不能包含非ASCII字符。; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: 目的实例的付费类型，取值：* **Postpaid**：后付费（按量付费）；* **Prepaid**：预付费（包年包月）。; 
    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    // description: 目的实例的可用区ID。多可用区用英文冒号（:）分隔。> 指定了VPC和交换机时，为匹配交换机对应的可用区，该参数必填。; 
    @NameInMap("ZoneId")
    public String zoneId;

    // description: 目的实例的网络类型，取值：* **VPC**：VPC网络；* **Classic**：经典网络。默认创建经典网络类型的实例。>当本参数值为 **VPC**时，还需要传入参数**VpcId**、**VSwitchId**。; 
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    // description: 目的实例的访问模式，取值：* **Standard**：标准访问模式；* **Safe**：数据库代理模式。默认值：**Standard**。; 
    @NameInMap("ConnectionMode")
    public String connectionMode;

    // description: 目的实例的VPC ID。当**InstanceNetworkType**=**VPC**时，本参数可用。>如果传入此参数，您还需要传入参数**ZoneId**。; 
    @NameInMap("VPCId")
    public String VPCId;

    // description: 目的实例的VSwitch ID，多个值用英文逗号（,）隔开。当**InstanceNetworkType**=**VPC**时，本参数可用。>如果传入此参数，您还需要传入参数**ZoneId**。; 
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // description: 设置目的实例的内网IP，需要在指定交换机的IP地址范围内。系统默认通过**VPCId**和**VSwitchId**自动分配。; 
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    // description: 指定购买时长，取值：* 当参数**Period**为**Year**时，UsedTime取值为**1~3**；* 当参数**Period**为**Month**时，UsedTime取值为**1~9**。> 若付费类型为**Prepaid**则该参数必须传入。; 
    @NameInMap("UsedTime")
    public String usedTime;

    // description: 指定预付费目的实例为包年或者包月类型，取值：* **Year**：包年；* **Month**：包月。> 若付费类型为**Prepaid**则该参数必须传入。; 
    @NameInMap("Period")
    public String period;

    // description: 资源组ID。; 
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // description: 恢复方式，取值：* **0**：基于备份集恢复，您还需要传入参数**BackupSetID**；* **1**：基于时间点恢复，您还需要传入参数**RestoreTime**、**SourceRegion**、**SourceDBInstanceName**。; 
    @NameInMap("RestoreType")
    @Validation(required = true)
    public String restoreType;

    // description: 基于备份集恢复时，使用的备份集的ID。可以通过接口[DescribeCrossRegionBackups](~~121733~~)查看备份集ID。>**RestoreTyp**e=**0**时必传。; 
    @NameInMap("BackupSetId")
    public String backupSetId;

    // description: 基于时间点恢复时，要恢复的时间节点，需要早于当前时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。>**RestoreType**=**1**时必传 。; 
    @NameInMap("RestoreTime")
    public String restoreTime;

    // description: 基于时间点恢复时，源地域的ID。>**RestoreType**=**1**时必传。; 
    @NameInMap("SourceRegion")
    public String sourceRegion;

    // description: 基于时间点恢复时，源实例的ID。>**RestoreType**=**1**时必传。; 
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    // description: 目的实例存储类型，当前仅支持SSD本地盘，默认值：**local_ssd**。; 
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("BinlogName")
    public String binlogName;

    @NameInMap("BinlogPosition")
    public String binlogPosition;

    @NameInMap("BinlogRole")
    public String binlogRole;

    public static CreateDdrInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceRequest self = new CreateDdrInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDdrInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDdrInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDdrInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDdrInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDdrInstanceRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDdrInstanceRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDdrInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDdrInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDdrInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDdrInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDdrInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDdrInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDdrInstanceRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDdrInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDdrInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDdrInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDdrInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDdrInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDdrInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDdrInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDdrInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDdrInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDdrInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateDdrInstanceRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public CreateDdrInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDdrInstanceRequest setBinlogName(String binlogName) {
        this.binlogName = binlogName;
        return this;
    }
    public String getBinlogName() {
        return this.binlogName;
    }

    public CreateDdrInstanceRequest setBinlogPosition(String binlogPosition) {
        this.binlogPosition = binlogPosition;
        return this;
    }
    public String getBinlogPosition() {
        return this.binlogPosition;
    }

    public CreateDdrInstanceRequest setBinlogRole(String binlogRole) {
        this.binlogRole = binlogRole;
        return this;
    }
    public String getBinlogRole() {
        return this.binlogRole;
    }

}
