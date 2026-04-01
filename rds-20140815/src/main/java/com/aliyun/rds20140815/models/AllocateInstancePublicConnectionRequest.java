// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionRequest extends TeaModel {
    /**
     * <p>The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.</p>
     * <blockquote>
     * <p>This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Introduction to Babelfish</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1433</p>
     */
    @NameInMap("BabelfishPort")
    public String babelfishPort;

    /**
     * <p>The prefix of the public endpoint. A valid public endpoint is in the following format: <code>Prefix.Database engine.rds.aliyuncs.com</code>. Example: <code>test1234.mysql.rds.aliyuncs.com</code>.</p>
     * <blockquote>
     * <p>The value can be 5 to 40 characters in length and can contain letters, digits, and hyphens (-). The value cannot contain any of the following characters: ~ ! # % ^ &amp; \* = + | {} ; : \&quot; &quot; , &lt;&gt; / ?</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1234</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the dedicated cluster to which the instance belongs. This parameter is available only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>rgc-bp1tkv8*****</p>
     */
    @NameInMap("GeneralGroupName")
    public String generalGroupName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The PgBouncer port.</p>
     * <blockquote>
     * <p>This parameter is available only for instances that run PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6432</p>
     */
    @NameInMap("PGBouncerPort")
    public String PGBouncerPort;

    /**
     * <p>The public port of the instance. Valid values: <strong>1000 to 5999</strong>.</p>
     * <p>This parameter is required.</p>
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

    public static AllocateInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionRequest self = new AllocateInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionRequest setBabelfishPort(String babelfishPort) {
        this.babelfishPort = babelfishPort;
        return this;
    }
    public String getBabelfishPort() {
        return this.babelfishPort;
    }

    public AllocateInstancePublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateInstancePublicConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AllocateInstancePublicConnectionRequest setGeneralGroupName(String generalGroupName) {
        this.generalGroupName = generalGroupName;
        return this;
    }
    public String getGeneralGroupName() {
        return this.generalGroupName;
    }

    public AllocateInstancePublicConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateInstancePublicConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateInstancePublicConnectionRequest setPGBouncerPort(String PGBouncerPort) {
        this.PGBouncerPort = PGBouncerPort;
        return this;
    }
    public String getPGBouncerPort() {
        return this.PGBouncerPort;
    }

    public AllocateInstancePublicConnectionRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AllocateInstancePublicConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateInstancePublicConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
