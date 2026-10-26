// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read/write splitting endpoint. The prefix must be unique and can contain only lowercase letters and hyphens. It must start with a letter and be up to 30 characters in length.</p>
     * <blockquote>
     * <p>By default, the prefix consists of the instance name and the &quot;rw&quot; string.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-m5****rw.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>Instance ID of the primary instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The read weight distribution mode. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: automatically distributes weights based on instance specifications.</li>
     * <li><strong>Custom</strong>: uses custom weights.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of the <strong>MaxDelayTime</strong> and <strong>DistributionType</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The latency threshold, in seconds. If the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance. If you do not specify this parameter, the original value is retained.</p>
     * <blockquote>
     * <ul>
     * <li>The <strong>MaxDelayTime</strong> parameter does not apply to SQL Server 2017 Cluster Edition instances.</li>
     * <li>You must specify at least one of the <strong>MaxDelayTime</strong> and <strong>DistributionType</strong> parameters.</li>
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
     * <p>The port number of the read/write splitting endpoint.</p>
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
     * <p>The read weights of the primary and read-only instances. The weight value must be a multiple of 100 and can be up to 10000.</p>
     * <ul>
     * <li>Format for ApsaraDB RDS instances: <code>{&quot;&lt;Read-only instance ID&gt;&quot;:&lt;Weight&gt;,&quot;master&quot;:&lt;Weight&gt;,&quot;slave&quot;:&lt;Weight&gt;}</code></li>
     * <li>Format for MyBase instances: <code>[{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;},{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;slave&quot;},{&quot;instanceName&quot;:&quot;&lt;Read-only instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;}]</code></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>DistributionType</strong> is set to <strong>Custom</strong>.</li>
     * <li>This parameter does not take effect when <strong>DistributionType</strong> is set to <strong>Standard</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;rm-bp1****&quot;: 800,
     *       &quot;master&quot;: 400,
     *       &quot;slave&quot;: 400
     * }</p>
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
