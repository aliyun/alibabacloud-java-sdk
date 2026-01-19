// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to add the virtual private cloud (VPC) CIDR block to the IP address whitelist. Valid values:</p>
     * <ul>
     * <li>1: yes.</li>
     * <li>0: no.</li>
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
     * <p>200GB</p>
     */
    @NameInMap("CacheSize")
    public Integer cacheSize;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterNodeCount")
    public Integer clusterNodeCount;

    @NameInMap("ClusterNodeType")
    public String clusterNodeType;

    @NameInMap("ConfigPatternType")
    public String configPatternType;

    /**
     * <p>The instance endpoint.</p>
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
     * <p>selectdb.xlarge</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance is created for testing.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The deployment method of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>single_az</p>
     */
    @NameInMap("DeployScheme")
    public String deployScheme;

    /**
     * <p>The database engine of the instance. Default value: <strong>selectdb</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Default value: <strong>3.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The configurations of multi-zone deployment.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect and is required only when DeployScheme is set to multi_az.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("MultiZone")
    public String multiZoneShrink;

    /**
     * <p>The unit of the subscription duration of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis.</li>
     * <li><strong>Month</strong>: subscription on a monthly basis.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzt2zaluvuvqa_fake</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScaleMax")
    public Double scaleMax;

    @NameInMap("ScaleMin")
    public Double scaleMin;

    /**
     * <p>The IP addresses in the whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The instance tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li>If Period is set to Year, valid values of UsedTime are 1, 2, 3, 4, and 5.</li>
     * <li>If Period is set to Month, valid values of UsedTime are 1 to 12.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
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
     * <p>The virtual private cloud (VPC) ID.</p>
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
