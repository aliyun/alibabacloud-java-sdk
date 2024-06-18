// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read/write splitting endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
     * <blockquote>
     * <p>The default prefix consists of the name of the primary instance followed by the letters rw.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-m5xxxxxxxxrw.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
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
     * <blockquote>
     * <p>You must specify at least one of <strong>MaxDelayTime</strong> and <strong>DistributionType</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The latency threshold that is allowed by the read/write splitting link. Unit: seconds. If the latency on a read-only instance exceeds the specified threshold, the system no longer routes read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained.</p>
     * <blockquote>
     * <ul>
     * <li>If the primary instance runs SQL Server 2017 on RDS Cluster Edition, the <strong>MaxDelayTime</strong> parameter is not supported.</li>
     * <li>You must specify at least one of <strong>MaxDelayTime</strong> and <strong>DistributionType</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port that is associated with the read/write splitting endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The read weights of the primary instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10,000.</p>
     * <ul>
     * <li>For ApsaraDB RDS instances, the value of this parameter is in the following format: <code>{&quot;&lt;ID of the read-only instance &gt;&quot;:&lt;Weight&gt;,&quot;master&quot;:&lt;Weight&gt;,&quot;slave&quot;:&lt;Weight&gt;}</code>.</li>
     * <li>For ApsaraDB MyBase instances, the value of this parameter is in the following format: <code>[{&quot;instanceName&quot;:&quot;&lt;ID of the primary instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;},{&quot;instanceName&quot;:&quot;&lt;ID of the primary instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;slave&quot;},{&quot;instanceName&quot;:&quot;&lt;ID of the read-only instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;}]</code></li>
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
