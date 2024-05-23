// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the **configuration item** for the database proxy. Valid values:</p>
     * <br>
     * <p>*   **TransparentSwitch**: transparent switchover</p>
     * <p>*   **PersistentConnections**: short-lived connection optimization</p>
     * <p>*   **AttacksProtection**: brute-force attack protection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyConfigurationKey")
    public String proxyConfigurationKey;

    /**
     * <p>The features and status of the database proxy:</p>
     * <br>
     * <p>*   **TransparentSwitch**: transparent switchover. Valid values:</p>
     * <br>
     * <p>    *   **Enable**: The feature is enabled. This is the default value.</p>
     * <p>    *   **Disable**: The feature is disabled.</p>
     * <br>
     * <p>*   **PersistentConnections**: short-lived connection optimization. Valid values:</p>
     * <br>
     * <p>    *   **Enable**: The feature is enabled.</p>
     * <p>    *   **Disable**: The feature is disabled. This is the default value.</p>
     * <br>
     * <p>*   **AttacksProtection**: brute-force attack protection. Valid values:</p>
     * <br>
     * <p>    *   **Enable**: The feature is enabled.</p>
     * <p>    *   **Disable**: The feature is disabled. This is the default value.</p>
     * <br>
     * <p>Format: {"Feature 1":"Status 1","Feature 2":"Status 2"...}</p>
     * <br>
     * <p>This parameter is required.</p>
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
