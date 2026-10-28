// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>The reserved cache size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public String cacheSize;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of nodes in the cluster. This parameter takes effect only in Serverless mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterNodeCount")
    public Integer clusterNodeCount;

    /**
     * <p>The node type of the cluster. This parameter takes effect only in Serverless mode.</p>
     * 
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("ClusterNodeType")
    public String clusterNodeType;

    /**
     * <p>The cluster specifications. Valid values:</p>
     * <ul>
     * <li><strong>selectdb.xlarge</strong>: 4 cores and 32 GB memory</li>
     * <li><strong>selectdb.2xlarge</strong>: 8 cores and 64 GB memory</li>
     * <li><strong>selectdb.4xlarge</strong>: 16 cores and 128 GB memory</li>
     * <li><strong>selectdb.8xlarge</strong>: 32 cores and 256 GB memory</li>
     * <li><strong>selectdb.16xlarge</strong>: 64 cores and 512 GB memory</li>
     * <li><strong>selectdb.24xlarge</strong>: 96 cores and 768 GB memory</li>
     * <li><strong>selectdb.32xlarge</strong>: 128 cores and 1024 GB memory</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.2xlarge</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The cluster description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database type.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether the subscription cluster is billed on a yearly or monthly basis. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly</li>
     * <li><strong>Month</strong>: monthly<blockquote>
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

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum value of the auto-scaling range for the instance RCU (RDS Capacity Unit).</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public Double scaleMax;

    /**
     * <p>The minimum value of the auto-scaling range for the instance RCU (RDS Capacity Unit).</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleMin")
    public Double scaleMin;

    /**
     * <p>Specifies the purchase duration of the subscription cluster. The unit is specified by Period: Year indicates years, and Month indicates months. Valid values:</p>
     * <ul>
     * <li>If Period is set to Year, valid values for UsedTime are 1, 2, 3, and 5.</li>
     * <li>If Period is set to Month, valid values for UsedTime are 1 to 9.<blockquote>
     * <p>This parameter takes effect and is required only when ChargeType is set to Prepaid.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

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
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterRequest self = new CreateDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterRequest setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public String getCacheSize() {
        return this.cacheSize;
    }

    public CreateDBClusterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDBClusterRequest setClusterNodeCount(Integer clusterNodeCount) {
        this.clusterNodeCount = clusterNodeCount;
        return this;
    }
    public Integer getClusterNodeCount() {
        return this.clusterNodeCount;
    }

    public CreateDBClusterRequest setClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
        return this;
    }
    public String getClusterNodeType() {
        return this.clusterNodeType;
    }

    public CreateDBClusterRequest setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public CreateDBClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateDBClusterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBClusterRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterRequest setScaleMax(Double scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Double getScaleMax() {
        return this.scaleMax;
    }

    public CreateDBClusterRequest setScaleMin(Double scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Double getScaleMin() {
        return this.scaleMin;
    }

    public CreateDBClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
