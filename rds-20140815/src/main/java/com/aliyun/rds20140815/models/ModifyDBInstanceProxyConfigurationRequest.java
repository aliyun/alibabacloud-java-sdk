// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
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
     */
    @NameInMap("ProxyConfigurationKey")
    public String proxyConfigurationKey;

    /**
     * <p>The value of the **configuration item** for the database proxy. Valid values:</p>
     * <br>
     * <p>*   If you set the ProxyConfigurationKey parameter to **TransparentSwitch**, you can set this parameter to one of the following values:</p>
     * <br>
     * <p>    *   **Enable**. This is the default value.</p>
     * <p>    *   **Disable**. Example: {"status":"Enable"}.</p>
     * <br>
     * <p>*   If you set the ProxyConfigurationKey parameter to **PersistentConnections**, you can set this parameter to one of the following values:</p>
     * <br>
     * <p>    *   **Enable**.</p>
     * <p>    *   **Disable**. This is the default value. Example: {"status":"Disable"}.</p>
     * <br>
     * <p>*   If you set the ProxyConfigurationKey parameter to **AttacksProtection**, you can set this parameter to one of the following values:</p>
     * <br>
     * <p>    *   **Enable**.</p>
     * <p>    *   **Disable**. This is the default value. Example: {"status":"Disable"}.</p>
     * <br>
     * <p>In this case, the return value is a JSON string. Example:</p>
     * <br>
     * <p>    {"status":"Disable", "check_interval_seconds": 60,</p>
     * <p>                    "max_failed_login_attempts": 60, "blocking_seconds": 600}</p>
     * <br>
     * <p>Description and valid values:</p>
     * <br>
     * <p>*   Each client allows {max_failed_login_attempts} logon attempts upon failure within {check_interval_seconds} seconds. If the number of logon attempts exceeds the limit, the client is disabled for {blocking_seconds} seconds before the client can try again.</p>
     * <p>*   The following list describes the valid values of each field in the preceding example.</p>
     * <br>
     * <p>check_interval_seconds: **30 to 600**. Unit: seconds. max_failed_login_attempts: **10 to 5000**. Unit: number of times. blocking_seconds: **30 to 3600**. Unit: seconds.</p>
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
