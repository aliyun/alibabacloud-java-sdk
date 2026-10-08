// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the configuration item to modify. This parameter is used together with ConfigValue.</p>
     * <details>
     * <summary>ApsaraDB RDS for PostgreSQL configuration items</summary>
     * 
     * <ul>
     * <li><strong>pgbouncer</strong>: Modifies the PgBouncer feature.</li>
     * <li><strong>encryptionKey</strong>: Modifies the cloud disk encryption feature.</li>
     * <li><strong>duckdb_create_databases</strong>: Configures databases of the primary instance as DuckDB column store databases in batches.</li>
     * <li><strong>duckdb_prepare_dependency</strong>: Configures the primary instance with one click so that its parameters and minor engine version meet the <a href="https://help.aliyun.com/document_detail/2977241.html">prerequisites</a> for creating a DuckDB-based analytical instance. If the primary instance already has read-only instances, the read-only instances are also updated.</li>
     * <li><strong>enable_db_visible_by_connect_rls</strong>: Enables CONNECT RLS on the instance to control database visibility.</li>
     * <li><strong>set_db_visible_by_connect_rls</strong>: Enables CONNECT RLS on a database to control database visibility. This can be called only after CONNECT RLS is enabled on the instance.</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>ApsaraDB RDS for SQL Server configuration items</summary>
     * 
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>clear_errorlog</strong>: Clears error logs.</li>
     * <li><strong>encryptionKey</strong>: Modifies the cloud disk encryption feature. Serverless instances and shared instance types do not support this feature.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>backup_recovery_model</strong>: Enables the simple recovery model feature. Only Basic Edition instances support this feature. <strong>This feature cannot be disabled after it is enabled</strong>.</li>
     * <li><strong>clear_errorlog</strong>: Clears error logs.</li>
     * <li><strong>encryptionKey</strong>: Modifies the cloud disk encryption feature. Serverless instances and shared instance types do not support this feature.</li>
     * </ul>
     * </details>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgbouncer</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <p>The value of the configuration item to modify. This parameter is used together with ConfigName.</p>
     * <details>
     * <summary>ApsaraDB RDS for PostgreSQL configuration item values</summary>
     * 
     * <ul>
     * <li>PgBouncer feature: <strong>true</strong> (enable) or <strong>false</strong> (disable).</li>
     * <li>Cloud disk encryption feature:<ul>
     * <li><strong>ServiceKey</strong>: Uses an automatically generated key from Alibaba Cloud, which is the RDS-managed service key (Default Service CMK), to enable cloud disk encryption.</li>
     * <li><strong><Key></strong>: Uses a custom key to enable cloud disk encryption or replaces the current key. Example: <code>494c98ce-f2b5-48ab-96ab-36c986b6****</code>.</li>
     * <li><strong>disabled</strong>: Disables cloud disk encryption.</li>
     * </ul>
     * </li>
     * <li>One-click fix for prerequisites to create a DuckDB-based analytical instance: <strong>duckdb_prepare_dependency</strong></li>
     * <li>Configure databases of the primary instance as DuckDB column store databases in batches. The value is a JSON string. Example: <code>{&quot;dbNames&quot;: &quot;db1,db2,db3&quot;, &quot;accountName&quot;: &quot;yourSuperAccountName&quot;}</code>, where:<ul>
     * <li><strong>dbNames</strong>: The names of databases to convert to DuckDB column store databases. Separate multiple database names with commas (,).</li>
     * <li><strong>accountName</strong>: The privileged user. Specify only one privileged user.</li>
     * </ul>
     * </li>
     * <li>Enable CONNECT RLS on the instance to control database visibility: <strong>true</strong> to enable.</li>
     * <li>Enable CONNECT RLS on a database to control database visibility: The <strong>database names</strong> managed by CONNECT RLS. Separate multiple database names with commas (,). Example: <strong>testdb1,testdb2</strong>. When a client connects to a database with CONNECT RLS enabled, the database list is displayed based on whether the client has CONNECT permissions on other databases.</details>
     * <details>
     * <summary>ApsaraDB RDS for SQL Server configuration item values</summary></li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Error log cleanup feature: <strong>1</strong> (confirm cleanup).</li>
     * <li>Cloud disk encryption feature (<strong>this feature cannot be disabled after it is enabled</strong>):<ul>
     * <li><strong>serviceKey</strong>: Uses an automatically generated key from Alibaba Cloud, which is the RDS-managed service key (Default Service CMK), to enable cloud disk encryption.</li>
     * <li><strong><Key></strong>: Uses a custom key to enable cloud disk encryption or replaces the current key. Example: <code>494c98ce-f2b5-48ab-96ab-36c986b6****</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Simple recovery feature: <strong>simple</strong> (enable simple recovery).</li>
     * <li>Error log cleanup feature: <strong>1</strong> (confirm cleanup).</li>
     * <li>Cloud disk encryption feature (<strong>this feature cannot be disabled after it is enabled</strong>):<ul>
     * <li><strong>serviceKey</strong>: Uses an automatically generated key from Alibaba Cloud, which is the RDS-managed service key (Default Service CMK), to enable cloud disk encryption.</li>
     * <li><strong><Key></strong>: Uses a custom key to enable cloud disk encryption or replaces the current key. Example: <code>494c98ce-f2b5-48ab-96ab-36c986b6****</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * </details>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID. You can call DescribeDBInstanceAttribute to obtain the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time at which the modification takes effect. We recommend that you perform specification changes during off-peak hours. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-06T09:24:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The switchover time. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The modification takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The modification takes effect during the maintenance window. You can call ModifyDBInstanceMaintainTime to modify the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static ModifyDBInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigRequest self = new ModifyDBInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBInstanceConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ModifyDBInstanceConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public ModifyDBInstanceConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBInstanceConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceConfigRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyDBInstanceConfigRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
