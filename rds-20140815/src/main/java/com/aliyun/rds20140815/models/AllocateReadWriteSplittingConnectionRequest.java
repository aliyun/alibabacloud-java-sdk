// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the read-only endpoint. The prefix must be unique, can contain lowercase letters and hyphens (-), must start with a letter, and cannot exceed 30 characters in length.</p>
     * <blockquote>
     * <p>By default, the prefix is in the format of &quot;instance name + rw&quot;.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rr-m5e****-rw.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the primary instance. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The mode of read weight distribution. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: Read weights are automatically assigned based on instance specifications.</li>
     * <li><strong>Custom</strong>: Read weights are manually assigned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("DistributionType")
    public String distributionType;

    /**
     * <p>The latency threshold. Valid values: 0 to 7200. Unit: seconds. Default value: 30.</p>
     * <blockquote>
     * <p>When the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    /**
     * <p>The network type of the read-only endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: public endpoint.</li>
     * <li><strong>Intranet</strong>: internal endpoint.</li>
     * </ul>
     * <blockquote>
     * <p>The default value is Intranet, and the network type of the internal endpoint is the same as that of the primary instance.</p>
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
     * <p>The port of the read-only endpoint. Valid values: 1000 to 5999. Default value: 1433.</p>
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
     * <p>The read weight distribution, which specifies the ratio of read requests that are routed to the primary instance and read-only instances. The value is incremented in steps of 100. Maximum value: 10000.</p>
     * <ul>
     * <li>Format for ApsaraDB RDS instances: <code>{&quot;&lt;Read-only instance ID&gt;&quot;:&lt;Weight&gt;,&quot;master&quot;:&lt;Weight&gt;,&quot;slave&quot;:&lt;Weight&gt;}</code></li>
     * <li>Format for MyBASE instances: <code>[{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;},{&quot;instanceName&quot;:&quot;&lt;Primary instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;slave&quot;},{&quot;instanceName&quot;:&quot;&lt;Read-only instance ID&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;}]</code></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>DistributionType</strong> is set to <strong>Custom</strong>.</li>
     * <li>This parameter is invalid when <strong>DistributionType</strong> is set to <strong>Standard</strong>.</li>
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
