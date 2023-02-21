// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointRequest extends TeaModel {
    /**
     * <p>The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: `Feature 1:Status;Feature 2:Status;...`. Do not add a semicolon (;) at the end of the last value.</p>
     * <br>
     * <p>Valid feature values:</p>
     * <br>
     * <p>*   **ReadWriteSpliting**: read/write splitting</p>
     * <p>*   **ConnectionPersist**: connection pooling</p>
     * <p>*   **TransactionReadSqlRouteOptimizeStatus**: transaction splitting</p>
     * <br>
     * <p>Valid status values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     * <br>
     * <p>>  If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by **ReadWriteSpliting**.</p>
     */
    @NameInMap("ConfigDBProxyFeatures")
    public String configDBProxyFeatures;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the proxy endpoint. You can call the [DescribeDBProxyEndpoint](~~140955~~) operation to query the proxy endpoints of a proxy terminal.</p>
     * <br>
     * <p>> * If the instance runs MySQL and you set the **DbEndpointOperator** parameter to **Delete** or **Modify**, you must specify the DBProxyEndpointId parameter.</p>
     * <p>> * If the instance runs PostgreSQL and you set the **DbEndpointOperator** parameter to **Delete**, **Modify**, or **Create**, you must specify the DBProxyEndpointId parameter.</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The description of the proxy terminal.</p>
     */
    @NameInMap("DbEndpointAliases")
    public String dbEndpointAliases;

    /**
     * <p>The type of the operation that you want to perform. Valid values:</p>
     * <br>
     * <p>*   **Modify**: Modify a proxy terminal. This is the default value.</p>
     * <p>*   **Create**: Create a proxy terminal.</p>
     * <p>*   **Delete**: Delete a proxy terminal.</p>
     */
    @NameInMap("DbEndpointOperator")
    public String dbEndpointOperator;

    /**
     * <p>The read and write attributes of the proxy terminal. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: The proxy terminal connects to the primary instance and can receive both read and write requests.</p>
     * <p>*   **ReadOnly**: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.</p>
     * <br>
     * <p>> *   If you set the **DbEndpointOperator** parameter to **Create**, you must specify the DbEndpointReadWriteMode parameter.</p>
     * <p>> *   If the instance runs MySQL and you change the value of this parameter from **ReadWrite** to **ReadOnly**, the transaction splitting feature is disabled.</p>
     */
    @NameInMap("DbEndpointReadWriteMode")
    public String dbEndpointReadWriteMode;

    /**
     * <p>The type of the proxy terminal. This is a reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DbEndpointType")
    public String dbEndpointType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy that is used to allocate read weights. Valid values:</p>
     * <br>
     * <p>*   **Standard**: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.</p>
     * <p>*   **Custom**: You must manually allocate read weights to the instance and its read-only instances.</p>
     * <br>
     * <p>>  You must specify this parameter only when the read/write splitting feature is enabled.</p>
     * <br>
     * <p>For more information about the permission allocation policy, see [Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances](~~96076~~) and [Enable and configure the database proxy feature for an ApsaraDB RDS for PostgreSQL instance](~~418272~~).</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: **30** to **3600**. Default value: **30**.</p>
     * <br>
     * <p>>  You must specify this parameter only when the read/write splitting feature is enabled.</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The read weights of the instance and its read-only instances. Read weights increase in increments of 100, and the maximum read weight is 10000. Format: `{"Instance ID 1":"Read weight","Instance ID 2":"Read weight"...}`.</p>
     * <br>
     * <p>>  If you set the **ReadOnlyInstanceDistributionType** parameter to **Custom**, you must specify the ReadOnlyInstanceWeight parameter.</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBProxyEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointRequest self = new ModifyDBProxyEndpointRequest();
        return TeaModel.build(map, self);
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

}
