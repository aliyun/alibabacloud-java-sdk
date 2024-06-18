// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the <strong>configuration item</strong> for the database proxy. Valid values:</p>
     * <ul>
     * <li><strong>TransparentSwitch</strong>: transparent switchover</li>
     * <li><strong>PersistentConnections</strong>: short-lived connection optimization</li>
     * <li><strong>AttacksProtection</strong>: brute-force attack protection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TransparentSwitch</p>
     */
    @NameInMap("ProxyConfigurationKey")
    public String proxyConfigurationKey;

    /**
     * <p>The features and status of the database proxy:</p>
     * <ul>
     * <li><p><strong>TransparentSwitch</strong>: transparent switchover. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: The feature is enabled. This is the default value.</li>
     * <li><strong>Disable</strong>: The feature is disabled.</li>
     * </ul>
     * </li>
     * <li><p><strong>PersistentConnections</strong>: short-lived connection optimization. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: The feature is enabled.</li>
     * <li><strong>Disable</strong>: The feature is disabled. This is the default value.</li>
     * </ul>
     * </li>
     * <li><p><strong>AttacksProtection</strong>: brute-force attack protection. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: The feature is enabled.</li>
     * <li><strong>Disable</strong>: The feature is disabled. This is the default value.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Format: {&quot;Feature 1&quot;:&quot;Status 1&quot;,&quot;Feature 2&quot;:&quot;Status 2&quot;...}</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:&quot;Enable&quot;}</p>
     */
    @NameInMap("ProxyConfigurationValue")
    public String proxyConfigurationValue;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceProxyConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationRequest self = new ModifyDBInstanceProxyConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceProxyConfigurationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceProxyConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceProxyConfigurationRequest setProxyConfigurationKey(String proxyConfigurationKey) {
        this.proxyConfigurationKey = proxyConfigurationKey;
        return this;
    }
    public String getProxyConfigurationKey() {
        return this.proxyConfigurationKey;
    }

    public ModifyDBInstanceProxyConfigurationRequest setProxyConfigurationValue(String proxyConfigurationValue) {
        this.proxyConfigurationValue = proxyConfigurationValue;
        return this;
    }
    public String getProxyConfigurationValue() {
        return this.proxyConfigurationValue;
    }

    public ModifyDBInstanceProxyConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceProxyConfigurationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
