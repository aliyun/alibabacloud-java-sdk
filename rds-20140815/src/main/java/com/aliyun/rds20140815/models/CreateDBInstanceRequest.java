// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    // description: 地域ID，可以通过接口[DescribeRegions](~~26243~~)查看可用的地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 数据库类型，取值：* **MySQL**；* **SQLServer**；* **PostgreSQL**；* **PPAS**；* **MariaDB**。; 
    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    // description: 数据库版本，取值：* MySQL：**5.5/5.6/5.7/8.0**；* SQL Server：**2008r2/2012/2012_ent_ha/2012_std_ha/2012_web/2016_ent_ha/2016_std_ha/2016_web/2017_ent**；* PostgreSQL：**9.4/10.0**；* PPAS：**9.3/10.0**；* MariaDB：**10.3**。; 
    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    // description: 实例规格，详见[实例规格表](~~26312~~)。; 
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    // description: 实例存储空间，单位：GB。每5GB进行递增，详见[实例规格表](~~26312~~)。; 
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    // description: 字符集，取值：* MySQL/MariaDB实例：**utf8、gbk、latin1、utf8mb4**；* SQL Server实例：**Chinese_PRC_CI_AS、Chinese_PRC_CS_AS、SQL_Latin1_General_CP1_CI_AS、SQL_Latin1_General_CP1_CS_AS、Chinese_PRC_BIN**。; 
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    // description: 实例的网络连接类型，取值：* **Internet**：公网连接；* **Intranet**：内网连接。; 
    @NameInMap("DBInstanceNetType")
    @Validation(required = true)
    public String DBInstanceNetType;

    // description: 实例名称，长度为2~256个字符。以中文、英文字母开头，可以包含数字、中文、英文、下划线（_）、短横线（-）。>不能以 http:// 和 https:// 开头。; 
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    // description: 该实例的[IP白名单](~~43185~~)，多个IP地址请以英文逗号（,）隔开，不可重复，最多1000个。支持如下两种格式：* IP地址形式，例如：10.23.12.24；* CIDR形式，例如：10.23.12.24/24（无类域间路由，24表示了地址中前缀的长度，范围为1~32）。; 
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    public String securityIPList;

    // description: 用于保证请求的幂等性，防止重复提交请求。由客户端生成该参数值，要保证在不同请求间唯一，最大值不超过64个ASCII字符，且该参数值中不能包含非ASCII字符。; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: 实例的付费类型，取值：* **Postpaid**：后付费（按量付费）；* **Prepaid**：预付费（包年包月）。; 
    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    // description: 可用区ID。多可用区用英文冒号（:）分隔。> 指定了VPC和交换机时，为匹配交换机对应的可用区，该参数必填。; 
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    // description: 实例的网络类型，取值：* **VPC**：VPC网络；* **Classic**：经典网络。默认创建经典网络类型的实例。> * SQL Server2017集群版只支持VPC网络；* 如果数据库类型为MariaDB，该参数必填。; 
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    // description: 实例的访问模式，取值：* **Standard**：标准访问模式；* **Safe**：数据库代理模式。默认为RDS系统分配。> SQL Server 2012/2016/2017只支持标准访问模式。; 
    @NameInMap("ConnectionMode")
    public String connectionMode;

    // description: VPC ID。>如果数据库类型为MariaDB，该参数必填。; 
    @NameInMap("VPCId")
    public String VPCId;

    // description: VSwitch ID，多个值用英文逗号（,）隔开。>如果数据库类型为MariaDB，该参数必填。; 
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // description: 设置实例的内网IP，需要在指定交换机的IP地址范围内。系统默认通过**VPCId**和**VSwitchId**自动分配。; 
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    // description: 指定购买时长，取值：* 当参数**Period**为**Year**时，UsedTime取值为**1~3**；* 当参数**Period**为**Month**时，UsedTime取值为**1~9**。> 若付费类型为**Prepaid**则该参数必须传入。; 
    @NameInMap("UsedTime")
    public String usedTime;

    // description: 指定预付费实例为包年或者包月类型，取值：* **Year**：包年；* **Month**：包月。> 若付费类型为**Prepaid**则该参数必须传入。; 
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // description: 实例存储类型，取值：* **local_ssd**/**ephemeral_ssd**：本地SSD盘（推荐）；* **cloud_ssd**：SSD云盘；* **cloud_essd**：ESSD云盘。; 
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    // description: 业务扩展参数。; 
    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("RoleARN")
    public String roleARN;

    // description: 实例是否自动续费，取值：**true | false**>* 按月购买，则自动续费周期为1个月；* 按年购买，则自动续费周期为1年。; 
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("Category")
    public String category;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDBInstanceRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateDBInstanceRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public CreateDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDBInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public CreateDBInstanceRequest setDBParamGroupId(String DBParamGroupId) {
        this.DBParamGroupId = DBParamGroupId;
        return this;
    }
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    public CreateDBInstanceRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceRequest setDBIsIgnoreCase(String DBIsIgnoreCase) {
        this.DBIsIgnoreCase = DBIsIgnoreCase;
        return this;
    }
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    public CreateDBInstanceRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public CreateDBInstanceRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateDBInstanceRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public CreateDBInstanceRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

}
