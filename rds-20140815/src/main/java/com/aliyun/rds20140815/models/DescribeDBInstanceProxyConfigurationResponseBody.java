// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the mechanism that is used to mitigate brute-force attacks is enabled:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable**</p>
     * <br>
     * <p>The return value is a JSON string. Example:</p>
     * <br>
     * <p>    {"status":"Disable", "check_interval_seconds": 60,</p>
     * <p>              "max_failed_login_attempts": 60, "blocking_seconds": 600}</p>
     * <br>
     * <p>Description:</p>
     * <br>
     * <p>*   Each client allows {max_failed_login_attempts} logon attempts that fail due to incorrect passwords within {check_interval_seconds} seconds. If one more such attempt is conducted, the client must wait for {blocking_seconds} seconds before you can try again.</p>
     * <br>
     * <p>*   Valid values:</p>
     * <br>
     * <p>    *   check_interval_seconds: **30 to 600**. Unit: seconds.</p>
     * <p>    *   max_failed_login_attempts: **10 to 5000**. Unit: times.</p>
     * <p>    *   blocking_seconds: **30 to 3600**. Unit: seconds.</p>
     */
    @NameInMap("AttacksProtectionConfiguration")
    public String attacksProtectionConfiguration;

    /**
     * <p>Indicates whether the short-lived connection optimization feature is enabled.</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable**</p>
     * <br>
     * <p>In this case, the return value is a JSON string. Examples:</p>
     * <br>
     * <p>    {"status":"Disable"}.</p>
     */
    @NameInMap("PersistentConnectionsConfiguration")
    public String persistentConnectionsConfiguration;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the transparent switchover feature is enabled.</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable**</p>
     * <br>
     * <p>The return value is a JSON string. Example:</p>
     * <br>
     * <p>    {"status":"Enable"}</p>
     */
    @NameInMap("TransparentSwitchConfiguration")
    public String transparentSwitchConfiguration;

    public static DescribeDBInstanceProxyConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceProxyConfigurationResponseBody self = new DescribeDBInstanceProxyConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setAttacksProtectionConfiguration(String attacksProtectionConfiguration) {
        this.attacksProtectionConfiguration = attacksProtectionConfiguration;
        return this;
    }
    public String getAttacksProtectionConfiguration() {
        return this.attacksProtectionConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setPersistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
        this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
        return this;
    }
    public String getPersistentConnectionsConfiguration() {
        return this.persistentConnectionsConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceProxyConfigurationResponseBody setTransparentSwitchConfiguration(String transparentSwitchConfiguration) {
        this.transparentSwitchConfiguration = transparentSwitchConfiguration;
        return this;
    }
    public String getTransparentSwitchConfiguration() {
        return this.transparentSwitchConfiguration;
    }

}
