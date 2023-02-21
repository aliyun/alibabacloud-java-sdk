// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read-only routing endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
     * <br>
     * <p>>  The default prefix consists of the name of the primary instance followed by the letters rw.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the primary instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method that is used to assign read weights. Valid values:</p>
     * <br>
     * <p>*   **Standard**: ApsaraDB RDS automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.</p>
     * <p>*   **Custom**: You must manually assign a read weight to each instance.</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The threshold of the latency that is allowed on the read-only instances. Valid values: 0 to 7200. Default value: 30. Unit: seconds.</p>
     * <br>
     * <p>>  If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS does not forward read requests to the read-only instance.</p>
     */
    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    /**
     * <p>The network type of the read-only routing endpoint. Valid values:</p>
     * <br>
     * <p>*   **Internet**: Internet</p>
     * <p>*   **Intranet**: internal network</p>
     * <br>
     * <p>>  The default value is Intranet. Make sure that the network type of the read-only routing endpoint is the same as that of the primary instance.</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port that is associated with the read-only routing endpoint. Valid values: 1000 to 5999. Default value: 1433.</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The read weights of the primary instance and its read-only instances. The read weight is increased in increments of 100. The maximum value is 10000.</p>
     * <br>
     * <p>* For ApsaraDB RDS instances, the value of this parameter is in the following format: `{"<ID of the read-only instance >":<Weight>,"master":<Weight>,"slave":<Weight>}`.</p>
     * <p>* For ApsaraDB MyBase instances, the value of this parameter is in the following format: `[{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"master"},{"instanceName":"<ID of the primary instance>","weight":<Weight>,"role":"slave"},{"instanceName":"<ID of the read-only instance>","weight":<Weight>,"role":"master"}]`</p>
     * <br>
     * <p>> * If you set the **DistributionType** parameter to **Custom**, you must also specify this parameter.</p>
     * <p>> * If you set the **DistributionType** parameter to **Standard**, this parameter is invalid.</p>
     */
    @NameInMap("Weight")
    public String weight;

    public static AllocateReadWriteSplittingConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateReadWriteSplittingConnectionRequest self = new AllocateReadWriteSplittingConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateReadWriteSplittingConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateReadWriteSplittingConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AllocateReadWriteSplittingConnectionRequest setDistributionType(String distributionType) {
        this.distributionType = distributionType;
        return this;
    }
    public String getDistributionType() {
        return this.distributionType;
    }

    public AllocateReadWriteSplittingConnectionRequest setMaxDelayTime(String maxDelayTime) {
        this.maxDelayTime = maxDelayTime;
        return this;
    }
    public String getMaxDelayTime() {
        return this.maxDelayTime;
    }

    public AllocateReadWriteSplittingConnectionRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public AllocateReadWriteSplittingConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateReadWriteSplittingConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateReadWriteSplittingConnectionRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AllocateReadWriteSplittingConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateReadWriteSplittingConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateReadWriteSplittingConnectionRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
