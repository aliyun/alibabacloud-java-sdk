// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointRequest extends TeaModel {
    /**
     * <p>Consistency read timeout, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CausalConsistReadTimeout")
    public String causalConsistReadTimeout;

    /**
     * <p>The capabilities that you want to enable for the proxy endpoint. If you specify more than one capability, separate the capabilities with semicolons (;). Format: <code>Capability 1:Status;Capability 2:Status;...</code>. Do not add a semicolon (;) at the end of the value.</p>
     * <p>Valid capability values:</p>
     * <ul>
     * <li><strong>ReadWriteSpliting</strong>: read/write splitting</li>
     * <li><strong>ConnectionPersist</strong>: connection pooling</li>
     * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: transaction splitting</li>
     * <li><strong>AZProximityAccess</strong>: nearest access</li>
     * </ul>
     * <p>Valid status values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the instance runs PostgreSQL, you can enable only read/write splitting, which is specified by <strong>ReadWriteSpliting</strong>.</p>
     * </li>
     * <li><p>Nearest access is supported only by dedicated database proxies for RDS instances that run MySQL.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWriteSpliting:1;ConnectionPersist:0</p>
     */
    @NameInMap("ConfigDBProxyFeatures")
    public String configDBProxyFeatures;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp145737x5bi6****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the proxy endpoint ID.</p>
     * <blockquote>
     * <ul>
     * <li>If the instance runs MySQL and you set <strong>DbEndpointOperator</strong> to <strong>Delete</strong> or <strong>Modify</strong>, you must specify DBProxyEndpointId.</li>
     * <li>If the instance runs PostgreSQL and you set <strong>DbEndpointOperator</strong> to <strong>Delete</strong>, <strong>Modify</strong>, or <strong>Create</strong>, you must specify DBProxyEndpointId.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gos787jog2wk0y****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
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
     * <p>The minimum number of reserved instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DbEndpointMinSlaveCount")
    public String dbEndpointMinSlaveCount;

    /**
     * <p>The type of operation that you want to perform. Valid values:</p>
     * <ul>
     * <li><strong>Modify</strong>: Modify a proxy terminal. This is the default value.</li>
     * <li><strong>Create</strong>: Create a proxy terminal.</li>
     * <li><strong>Delete</strong>: Delete a proxy terminal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Modify</p>
     */
    @NameInMap("DbEndpointOperator")
    public String dbEndpointOperator;

    /**
     * <p>The read and write attributes of the proxy terminal. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: The proxy terminal connects to the primary instance and can receive both read and write requests.</li>
     * <li><strong>ReadOnly</strong>: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set <strong>DbEndpointOperator</strong> to <strong>Create</strong>, you must also specify DbEndpointReadWriteMode.</li>
     * <li>If the instance runs MySQL and you change the value of this parameter from <strong>ReadWrite</strong> to <strong>ReadOnly</strong>, the transaction splitting feature is disabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("DbEndpointReadWriteMode")
    public String dbEndpointReadWriteMode;

    /**
     * <p>The type of the proxy terminal. This is a reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>RWSplit</p>
     */
    @NameInMap("DbEndpointType")
    public String dbEndpointType;

    /**
     * <p>The point in time that you want to specify. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If <strong>EffectiveTime</strong> is set to <strong>SpecificTime</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-05-06T07:08:09Z</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The effective time. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The effective time is immediate.</li>
     * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The effective time is a specified point in time.</li>
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
     * <p>The policy that is used to allocate read weights. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong> (default): The system automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.</li>
     * <li><strong>Custom</strong>: You must manually allocate read weights to the primary and read-only instances.</li>
     * </ul>
     * <blockquote>
     * <p> You must specify this parameter when read/write splitting is enabled. For more information about the permission allocation policy, see <a href="https://help.aliyun.com/document_detail/96076.html">Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances</a> and <a href="https://help.aliyun.com/document_detail/418272.html">Enable and configure the database proxy feature for an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, the system no longer forwards read requests to the read-only instance. If you do not specify this parameter, the original value of this parameter is retained. Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You must specify this parameter only when read/write splitting is enabled.</p>
     * </li>
     * <li><p>If the database proxy endpoint has the read and write attributes, the default value of this parameter is <strong>30</strong> and read/write splitting is supported. If the database proxy endpoint has the read-only attribute, the default value of this parameter is <strong>-1</strong> and read/write splitting is not supported. Unit: seconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The read weights of the instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10000. Formats:</p>
     * <ul>
     * <li><p>Standard instance: <code>{&quot;ID of the primary instance&quot;:&quot;Weight&quot;,&quot;ID of the read-only instance&quot;:&quot;Weight&quot;...}</code></p>
     * <p>Example: <code>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</code></p>
     * </li>
     * <li><p>Instance on RDS Cluster Edition: <code>{&quot;ID of the read-only instance&quot;:&quot;Weight&quot;,&quot;DBClusterNode&quot;:{&quot;ID of the primary node&quot;:&quot;Weight&quot;,&quot;ID of the secondary node&quot;:&quot;Weight&quot;,&quot;ID of the secondary node&quot;:&quot;Weight&quot;...}}</code></p>
     * <p>Example: <code>{&quot;rr-tfhfgk5****&quot;:&quot;200&quot;,&quot;DBClusterNode&quot;:{&quot;rn-2z****&quot;:&quot;0&quot;,&quot;rn-2z****&quot;:&quot;400&quot;,&quot;rn-2z****&quot;:&quot;400&quot;...}}</code></p>
     * <blockquote>
     * <p><strong>DBClusterNode</strong> is required if the instance runs RDS Cluster Edition. The DBClusterNode parameter includes information about <strong>IDs</strong> and <strong>weights</strong> of the primary and secondary nodes..</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rm-uf6wjk5xxxx&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>The ID of the vSwitch in the zone in which the proxy endpoint is specified. The default value is the ID of the vSwitch that corresponds to the default terminal of the database proxy. You can call the DescribeVSwitches operation to query existing vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
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
