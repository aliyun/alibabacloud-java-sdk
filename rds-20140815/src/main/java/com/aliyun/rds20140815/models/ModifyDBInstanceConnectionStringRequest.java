// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
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
     * <p>The prefix of the endpoint after the change. Only the prefix of the value of <strong>CurrentConnectionString</strong> can be changed.</p>
     * <blockquote>
     * <p>The value must be 8 to 64 characters in length and can contain letters, digits, and hyphens (-). The value cannot contain any of the following special characters: ! # % ^ &amp; \* = + | {} ; : \&quot; &quot; ,&lt;&gt; / ?</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The endpoint of the instance. It can be an internal endpoint, a public endpoint, or a classic network endpoint in hybrid access mode.</p>
     * <blockquote>
     * <p>The read/write splitting endpoint cannot be changed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5x****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>rgc-bp1tkv8****</p>
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
     * <p>This parameter is suitable only for ApsaraDB RDS for PostgreSQL instances. If you enable PgBouncer for your instance, you can change the PgBouncer port of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6432</p>
     */
    @NameInMap("PGBouncerPort")
    public String PGBouncerPort;

    /**
     * <p>The port number after the change.</p>
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

    public static ModifyDBInstanceConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringRequest self = new ModifyDBInstanceConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringRequest setBabelfishPort(String babelfishPort) {
        this.babelfishPort = babelfishPort;
        return this;
    }
    public String getBabelfishPort() {
        return this.babelfishPort;
    }

    public ModifyDBInstanceConnectionStringRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyDBInstanceConnectionStringRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ModifyDBInstanceConnectionStringRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConnectionStringRequest setGeneralGroupName(String generalGroupName) {
        this.generalGroupName = generalGroupName;
        return this;
    }
    public String getGeneralGroupName() {
        return this.generalGroupName;
    }

    public ModifyDBInstanceConnectionStringRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceConnectionStringRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceConnectionStringRequest setPGBouncerPort(String PGBouncerPort) {
        this.PGBouncerPort = PGBouncerPort;
        return this;
    }
    public String getPGBouncerPort() {
        return this.PGBouncerPort;
    }

    public ModifyDBInstanceConnectionStringRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyDBInstanceConnectionStringRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceConnectionStringRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
