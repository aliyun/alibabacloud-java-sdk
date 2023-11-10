// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read/write splitting endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
     * <br>
     * <p>> The default prefix consists of the name of the primary instance followed by the letters rw.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method that is used to assign read weights. Valid values:</p>
     * <br>
     * <p>*   **Standard**: The system automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.</p>
     * <p>*   **Custom**: You must manually assign a read weight to each instance.</p>
     * <br>
     * <p>> You must specify at least one of **MaxDelayTime** and **DistributionType**.</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The latency threshold that is allowed by the read/write splitting link. Unit: seconds. If the latency on a read-only instance exceeds the specified threshold, the system no longer routes read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained.</p>
     * <br>
     * <p>> *   If the primary instance runs SQL Server 2017 on RDS Cluster Edition, the **MaxDelayTime** parameter is not supported.</p>
     * <p>> *   You must specify at least one of **MaxDelayTime** and **DistributionType**.</p>
     */
    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port that is associated with the read/write splitting endpoint.</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The read weights of the primary instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10,000.</p>
     * <br>
     * <p>*   For ApsaraDB RDS instances, the value of this parameter is in the following format: `{"<ID of the read-only instance >":<Weight>,"master":<Weight>,"slave":<Weight>}`.</p>
     * <p>*   For ApsaraDB MyBase instances, the value of this parameter is in the following format: `[{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"master"},{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"slave"},{"instanceName":"<ID of the read-only instance>","weight":<Weight>,"role":"master"}]`</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when **DistributionType** is set to **Custom**.</p>
     * <br>
     * <p>*   If **DistributionType** is set to **Standard**, this parameter is invalid.</p>
     */
    @NameInMap("Weight")
    public String weight;

    public static ModifyReadWriteSplittingConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadWriteSplittingConnectionRequest self = new ModifyReadWriteSplittingConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReadWriteSplittingConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyReadWriteSplittingConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyReadWriteSplittingConnectionRequest setDistributionType(String distributionType) {
        this.distributionType = distributionType;
        return this;
    }
    public String getDistributionType() {
        return this.distributionType;
    }

    public ModifyReadWriteSplittingConnectionRequest setMaxDelayTime(String maxDelayTime) {
        this.maxDelayTime = maxDelayTime;
        return this;
    }
    public String getMaxDelayTime() {
        return this.maxDelayTime;
    }

    public ModifyReadWriteSplittingConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyReadWriteSplittingConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReadWriteSplittingConnectionRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyReadWriteSplittingConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReadWriteSplittingConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyReadWriteSplittingConnectionRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
