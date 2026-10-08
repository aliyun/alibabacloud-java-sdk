// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>The TDS port number for Babelfish for RDS PostgreSQL.</p>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for RDS PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Introduction to Babelfish</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1433</p>
     */
    @NameInMap("BabelfishPort")
    public String babelfishPort;

    /**
     * <p>The prefix of the endpoint. You can modify only the prefix of the value specified by the <strong>CurrentConnectionString</strong> parameter.</p>
     * <blockquote>
     * <p>The prefix must be 8 to 64 characters in length and cannot contain Chinese characters or special characters (~!#%^&amp;*=+\|{};:\&quot;&quot;,&lt;&gt;/?). The prefix can contain letters, digits, and hyphens (-).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The current endpoint of the instance. The endpoint can be a public endpoint or internal endpoint, or a classic network connectivity endpoint in hybrid access mode.</p>
     * <blockquote>
     * <p>Modification of read/write splitting connection endpoints is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5x****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the group to which the dedicated cluster MySQL general-purpose instance belongs.</p>
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
     * <p>The PgBouncer port number.</p>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. If PgBouncer is enabled, you can modify the PgBouncer port number.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6432</p>
     */
    @NameInMap("PGBouncerPort")
    public String PGBouncerPort;

    /**
     * <p>The target port.</p>
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

    /**
     * <p>Specifies whether to retain the virtual IP address (VIP) when swapping the endpoint.</p>
     * <ul>
     * <li><strong>true</strong>: The VIP is retained.</li>
     * <li><strong>false</strong> (default): The VIP is not retained.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RetainVip")
    public Boolean retainVip;

    /**
     * <p>The instance ID of the target ApsaraDB RDS for PostgreSQL instance with which you want to swap the endpoint.</p>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1206s14p3o****</p>
     */
    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

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

    public ModifyDBInstanceConnectionStringRequest setRetainVip(Boolean retainVip) {
        this.retainVip = retainVip;
        return this;
    }
    public Boolean getRetainVip() {
        return this.retainVip;
    }

    public ModifyDBInstanceConnectionStringRequest setTargetDBInstanceId(String targetDBInstanceId) {
        this.targetDBInstanceId = targetDBInstanceId;
        return this;
    }
    public String getTargetDBInstanceId() {
        return this.targetDBInstanceId;
    }

}
