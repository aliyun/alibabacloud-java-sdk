// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read-only routing endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
     * <blockquote>
     * <p> The default prefix consists of the name of the primary instance followed by the letters rw.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rr-m5exxxxx-rw.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The primary instance ID. You can call the DescribeDBInstances operation to query the primary instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method that is used to assign read weights. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: The system automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.</li>
     * <li><strong>Custom</strong>: You must manually assign a read weight to each instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The threshold of the latency that is allowed on the read-only instances. Valid values: 0 to 7200. Default value: 30. Unit: seconds.</p>
     * <blockquote>
     * <p> If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS does not forward read requests to the read-only instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    /**
     * <p>The network type of the read-only routing endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong></li>
     * <li><strong>Intranet</strong></li>
     * </ul>
     * <blockquote>
     * <p> The default value is Intranet. Make sure that the network type of the read-only routing endpoint is the same as that of the primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port that is associated with the read-only routing endpoint. Valid values: 1000 to 5999. Default value: 1433.</p>
     * 
     * <strong>example:</strong>
     * <p>1433</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The read weights of the primary instance and its read-only instances. The read weight is increased in increments of 100. The maximum value is 10000.</p>
     * <ul>
     * <li>For ApsaraDB RDS instances, the value of this parameter is in the following format: <code>{&quot;&lt;ID of the read-only instance &gt;&quot;:&lt;Weight&gt;,&quot;master&quot;:&lt;Weight&gt;,&quot;slave&quot;:&lt;Weight&gt;}</code>.</li>
     * <li>For ApsaraDB MyBase instances, the value of this parameter is in the following format: <code>[{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;},{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;slave&quot;},{&quot;instanceName&quot;:&quot;&lt;Read-only instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;}]</code></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified when <strong>DistributionType</strong> is set to <strong>Custom</strong>.</p>
     * </li>
     * <li><p>If <strong>DistributionType</strong> is set to <strong>Standard</strong>, this parameter is invalid.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rm-bp1**********&quot;:800,&quot;master&quot;:400,&quot;slave&quot;:400}</p>
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
