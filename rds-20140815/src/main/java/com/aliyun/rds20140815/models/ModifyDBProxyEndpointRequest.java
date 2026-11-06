// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointRequest extends TeaModel {
    /**
     * <p>The timeout period for read consistency. Unit: milliseconds. Default value: <strong>10</strong>. Valid values: <strong>0</strong> to <strong>60000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CausalConsistReadTimeout")
    public String causalConsistReadTimeout;

    /**
     * <p>The proxy features to be enabled for the proxy endpoint. Separate multiple features with semicolons (;). Format: <code>Feature 1:Status;Feature 2:Status;...</code>. Do not add a semicolon (;) at the end.</p>
     * <p>Valid values for features:</p>
     * <ul>
     * <li><strong>ReadWriteSpliting</strong>: read/write splitting</li>
     * <li><strong>ConnectionPersist</strong>: connection pool</li>
     * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: transaction splitting</li>
     * <li><strong>AZProximityAccess</strong>: nearest access</li>
     * <li><strong>CausalConsistRead</strong>: read consistency</li>
     * <li><strong>HtapFilter</strong>: HTAP automatic request distribution among row store and column store nodes</li>
     * </ul>
     * <p>Valid values for status:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL supports only <strong>ReadWriteSpliting</strong>.</li>
     * <li>The nearest access feature is supported only by dedicated database proxies for MySQL.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWriteSpliting:1;ConnectionPersist:0</p>
     */
    @NameInMap("ConfigDBProxyFeatures")
    public String configDBProxyFeatures;

    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp145737x5bi6****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID.</p>
     * <blockquote>
     * <ul>
     * <li>MySQL: This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Delete</strong> or <strong>Modify</strong>.</li>
     * <li>PostgreSQL: This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Delete</strong>, <strong>Modify</strong>, or <strong>Create</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gos787jog2wk0y****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>The database proxy engine type. This parameter is deprecated and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The description of the proxy terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>test-proxy</p>
     */
    @NameInMap("DbEndpointAliases")
    public String dbEndpointAliases;

    /**
     * <p>The execution cost threshold to execute SQL in HTAP automatic request distribution among row store and column store nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("DbEndpointCostThresholdForDuckdb")
    public String dbEndpointCostThresholdForDuckdb;

    /**
     * <p>The minimum number of reserved instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DbEndpointMinSlaveCount")
    public String dbEndpointMinSlaveCount;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><strong>Modify</strong>: Modifies the proxy terminal. This is the default value.</li>
     * <li><strong>Create</strong>: Creates a proxy terminal.</li>
     * <li><strong>Delete</strong>: Deletes a proxy terminal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Modify</p>
     */
    @NameInMap("DbEndpointOperator")
    public String dbEndpointOperator;

    /**
     * <p>The read/write mode. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: Connects to the primary instance and accepts write requests.</li>
     * <li><strong>ReadOnly</strong>: Does not connect to the primary instance and cannot accept write requests. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Create</strong>.</li>
     * <li>For an ApsaraDB RDS for MySQL instance, if you change the value of this parameter from <strong>ReadWrite</strong> to <strong>ReadOnly</strong>, the transaction splitting feature is disabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("DbEndpointReadWriteMode")
    public String dbEndpointReadWriteMode;

    /**
     * <p>The type of the proxy terminal. This parameter is reserved and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>RWSplit</p>
     */
    @NameInMap("DbEndpointType")
    public String dbEndpointType;

    /**
     * <p>The specific time when the modification takes effect. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>EffectiveTime</strong> is set to <strong>SpecificTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-05-06T07:08:09Z</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: Takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: Takes effect within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: Takes effect at a specified time.</li>
     * </ul>
     * <p>Default value: <strong>MaintainTime</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The read weight allocation pattern. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: Automatically allocates weights based on instance specifications. This is the default value.</li>
     * <li><strong>Custom</strong>: custom weight allocation</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when read/write splitting is enabled. For more information about the weight allocation pattern, see <a href="https://help.aliyun.com/document_detail/96076.html">Read weight allocation</a> for MySQL and <a href="https://help.aliyun.com/document_detail/418272.html">Enable and configure the database proxy service</a> for PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The maximum latency threshold for read-only instances in read/write splitting. If the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance. Unit: seconds. If you do not specify this parameter, the original value is retained. Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only when read/write splitting is enabled.</li>
     * <li>Default value: <strong>30</strong> when the read/write property is set to read/write (read/write splitting), and <strong>-1</strong> (shutdown) when the read/write property is set to read-only.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The custom read weight distribution. You can specify the read request weights for the primary instance and read-only instances. The weight must be a multiple of 100, and the maximum value is 10000. Format:</p>
     * <ul>
     * <li><p>Standard instance: <code>{&quot;Primary instance ID&quot;:&quot;Weight&quot;,&quot;Read-only instance ID&quot;:&quot;Weight&quot;...}</code></p>
     * <p>  Example: <code>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</code></p>
     * </li>
     * <li><p>ApsaraDB RDS for MySQL Cluster Edition instance: <code>{&quot;Read-only instance ID&quot;:&quot;Weight&quot;,&quot;DBClusterNode&quot;:{&quot;Primary node ID&quot;:&quot;Weight&quot;,&quot;Secondary node ID&quot;:&quot;Weight&quot;,&quot;Secondary node ID&quot;:&quot;Weight&quot;...}}</code></p>
     * <p>  Example: <code>{&quot;rr-tfhfgk5****&quot;:&quot;200&quot;,&quot;DBClusterNode&quot;:{&quot;rn-2z****&quot;:&quot;0&quot;,&quot;rn-2z****&quot;:&quot;400&quot;,&quot;rn-2z****&quot;:&quot;400&quot;...}}</code></p>
     * <blockquote>
     * <p><strong>DBClusterNode</strong> is a request parameter specific to Cluster Edition instances and contains the <strong>NodeID</strong> and <strong>Weight</strong> of the primary and secondary nodes.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the vSwitch in the zone of the proxy endpoint. The default value is the ID of the vSwitch associated with the default terminal of the proxy instance. You can call the DescribeVSwitches operation to query existing vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC in the zone of the proxy endpoint. The default value is the ID of the VPC associated with the default terminal of the proxy instance. You can call the DescribeDBInstanceAttribute operation to query the default VPC of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeusejj******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyDBProxyEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointRequest self = new ModifyDBProxyEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointRequest setCausalConsistReadTimeout(String causalConsistReadTimeout) {
        this.causalConsistReadTimeout = causalConsistReadTimeout;
        return this;
    }
    public String getCausalConsistReadTimeout() {
        return this.causalConsistReadTimeout;
    }

    public ModifyDBProxyEndpointRequest setConfigDBProxyFeatures(String configDBProxyFeatures) {
        this.configDBProxyFeatures = configDBProxyFeatures;
        return this;
    }
    public String getConfigDBProxyFeatures() {
        return this.configDBProxyFeatures;
    }

    public ModifyDBProxyEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyEndpointRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public ModifyDBProxyEndpointRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointAliases(String dbEndpointAliases) {
        this.dbEndpointAliases = dbEndpointAliases;
        return this;
    }
    public String getDbEndpointAliases() {
        return this.dbEndpointAliases;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointCostThresholdForDuckdb(String dbEndpointCostThresholdForDuckdb) {
        this.dbEndpointCostThresholdForDuckdb = dbEndpointCostThresholdForDuckdb;
        return this;
    }
    public String getDbEndpointCostThresholdForDuckdb() {
        return this.dbEndpointCostThresholdForDuckdb;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointMinSlaveCount(String dbEndpointMinSlaveCount) {
        this.dbEndpointMinSlaveCount = dbEndpointMinSlaveCount;
        return this;
    }
    public String getDbEndpointMinSlaveCount() {
        return this.dbEndpointMinSlaveCount;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointOperator(String dbEndpointOperator) {
        this.dbEndpointOperator = dbEndpointOperator;
        return this;
    }
    public String getDbEndpointOperator() {
        return this.dbEndpointOperator;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
        this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
        return this;
    }
    public String getDbEndpointReadWriteMode() {
        return this.dbEndpointReadWriteMode;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointType(String dbEndpointType) {
        this.dbEndpointType = dbEndpointType;
        return this;
    }
    public String getDbEndpointType() {
        return this.dbEndpointType;
    }

    public ModifyDBProxyEndpointRequest setEffectiveSpecificTime(String effectiveSpecificTime) {
        this.effectiveSpecificTime = effectiveSpecificTime;
        return this;
    }
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    public ModifyDBProxyEndpointRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBProxyEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    public ModifyDBProxyEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyEndpointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBProxyEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
