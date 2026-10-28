// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to add the VPC CIDR block to the whitelist. Valid values:</p>
     * <ul>
     * <li>1: yes</li>
     * <li>0: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddVPCIPs")
    public String addVPCIPs;

    /**
     * <p>The reserved cache size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public Integer cacheSize;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of cluster nodes. This parameter takes effect only in Serverless mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterNodeCount")
    public Integer clusterNodeCount;

    /**
     * <p>The cluster node type. This parameter takes effect only in Serverless mode.</p>
     * 
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("ClusterNodeType")
    public String clusterNodeType;

    /**
     * <p>The configuration template applied to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ConfigPatternType")
    public String configPatternType;

    /**
     * <p>The database endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8y****-public.selectdbfe.pre.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/2853363.html">DescribeAllDBInstanceClass</a> operation to query instance types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.g.2xlarge</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>New instance test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The deployment mode of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>single_az</p>
     */
    @NameInMap("DeployScheme")
    public String deployScheme;

    /**
     * <p>The database engine type. Default value: <strong>selectdb</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Default value: <strong>4.1</strong>. Valid values:</p>
     * <ul>
     * <li><p>4.0</p>
     * </li>
     * <li><p>4.1</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.1</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The node specifications of a single node in the frontend (FE) cluster. This parameter takes effect only when you create a pay-as-you-go or subscription instance. Default value: selectdb_fe.xlarge16.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb_fe.xlarge16</p>
     */
    @NameInMap("FEClassCode")
    public String FEClassCode;

    /**
     * <p>The number of nodes in the FE cluster. This parameter takes effect only when you create a pay-as-you-go or subscription instance. Default value: 3. Valid values: 1 to 11. The value must be an odd number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FENodeCount")
    public String FENodeCount;

    /**
     * <p>The multi-zone configuration.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect and is required when DeployScheme is set to multi_az.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiZone")
    public String multiZoneShrink;

    /**
     * <p>Specifies the billing cycle of the subscription cluster. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly.</li>
     * <li><strong>Month</strong>: monthly.<blockquote>
     * <p>This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzt2zaluvuvqa_fake</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum value of the automatic scaling range for the RCU (RDS Capacity Unit) of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public Double scaleMax;

    /**
     * <p>The minimum value of the automatic scaling range for the RCU (RDS Capacity Unit) of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleMin")
    public Double scaleMin;

    /**
     * <p>The IP address whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The tag list information of the instance.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>Specifies whether to enable TDE on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("TdeEnabled")
    public String tdeEnabled;

    /**
     * <p>The mode for enabling Transparent Data Encryption (TDE) on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("TdeMode")
    public String tdeMode;

    /**
     * <p>The subscription duration of the instance. The unit is specified by the Period parameter. Year indicates years, and Month indicates months. Valid values:</p>
     * <ul>
     * <li>If Period is set to Year, valid values are 1, 2, 3, 4, and 5.</li>
     * <li>If Period is set to Month, valid values are 1 to 12.<blockquote>
     * <p>This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1gzt31twhlo0sa5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceShrinkRequest self = new CreateDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceShrinkRequest setAddVPCIPs(String addVPCIPs) {
        this.addVPCIPs = addVPCIPs;
        return this;
    }
    public String getAddVPCIPs() {
        return this.addVPCIPs;
    }

    public CreateDBInstanceShrinkRequest setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public Integer getCacheSize() {
        return this.cacheSize;
    }

    public CreateDBInstanceShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceShrinkRequest setClusterNodeCount(Integer clusterNodeCount) {
        this.clusterNodeCount = clusterNodeCount;
        return this;
    }
    public Integer getClusterNodeCount() {
        return this.clusterNodeCount;
    }

    public CreateDBInstanceShrinkRequest setClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
        return this;
    }
    public String getClusterNodeType() {
        return this.clusterNodeType;
    }

    public CreateDBInstanceShrinkRequest setConfigPatternType(String configPatternType) {
        this.configPatternType = configPatternType;
        return this;
    }
    public String getConfigPatternType() {
        return this.configPatternType;
    }

    public CreateDBInstanceShrinkRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceShrinkRequest setDeployScheme(String deployScheme) {
        this.deployScheme = deployScheme;
        return this;
    }
    public String getDeployScheme() {
        return this.deployScheme;
    }

    public CreateDBInstanceShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceShrinkRequest setFEClassCode(String FEClassCode) {
        this.FEClassCode = FEClassCode;
        return this;
    }
    public String getFEClassCode() {
        return this.FEClassCode;
    }

    public CreateDBInstanceShrinkRequest setFENodeCount(String FENodeCount) {
        this.FENodeCount = FENodeCount;
        return this;
    }
    public String getFENodeCount() {
        return this.FENodeCount;
    }

    public CreateDBInstanceShrinkRequest setMultiZoneShrink(String multiZoneShrink) {
        this.multiZoneShrink = multiZoneShrink;
        return this;
    }
    public String getMultiZoneShrink() {
        return this.multiZoneShrink;
    }

    public CreateDBInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceShrinkRequest setScaleMax(Double scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Double getScaleMax() {
        return this.scaleMax;
    }

    public CreateDBInstanceShrinkRequest setScaleMin(Double scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Double getScaleMin() {
        return this.scaleMin;
    }

    public CreateDBInstanceShrinkRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateDBInstanceShrinkRequest setTdeEnabled(String tdeEnabled) {
        this.tdeEnabled = tdeEnabled;
        return this;
    }
    public String getTdeEnabled() {
        return this.tdeEnabled;
    }

    public CreateDBInstanceShrinkRequest setTdeMode(String tdeMode) {
        this.tdeMode = tdeMode;
        return this;
    }
    public String getTdeMode() {
        return this.tdeMode;
    }

    public CreateDBInstanceShrinkRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
