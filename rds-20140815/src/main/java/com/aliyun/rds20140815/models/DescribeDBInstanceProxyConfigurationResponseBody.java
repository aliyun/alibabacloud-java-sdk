// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether brute-force attacks protection is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.</li>
     * </ul>
     * <p>The return value is a JSON character string in the following format:</p>
     * <pre><code>{&quot;status&quot;:&quot;Disable&quot;, &quot;check_interval_seconds&quot;: 60,
     *           &quot;max_failed_login_attempts&quot;: 60, &quot;blocking_seconds&quot;: 600}
     * </code></pre>
     * <p>Parameter description and value ranges:</p>
     * <ul>
     * <li>For each client, a maximum of max_failed_login_attempts fault password logon attempts are allowed within check_interval_seconds seconds. If the limit is exceeded, the client IP address is blocked for blocking_seconds seconds.</li>
     * <li>Value ranges:<ul>
     * <li>check_interval_seconds: <strong>30 to 600</strong>. Unit: seconds.</li>
     * <li>max_failed_login_attempts: <strong>10 to 5000</strong>. Unit: attempts.</li>
     * <li>blocking_seconds: <strong>30 to 3600</strong>. Unit: seconds.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;check_interval_seconds\&quot;:\&quot;0\&quot;,\&quot;max_failed_login_attempts\&quot;:\&quot;0\&quot;,\&quot;blocking_seconds\&quot;:\&quot;0\&quot;,\&quot;status\&quot;:\&quot;Disable\&quot;}</p>
     */
    @NameInMap("AttacksProtectionConfiguration")
    public String attacksProtectionConfiguration;

    /**
     * <p>Indicates whether short-lived connection optimization is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.</li>
     * </ul>
     * <p>The return value is a JSON string in the following format:</p>
     * <pre><code>{&quot;status&quot;:&quot;Disable&quot;}.
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;status\&quot;:\&quot;Disable\&quot;}</p>
     */
    @NameInMap("PersistentConnectionsConfiguration")
    public String persistentConnectionsConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether transparent switchover is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.</li>
     * </ul>
     * <p>The return value is a JSON string in the following format:</p>
     * <pre><code>{&quot;status&quot;:&quot;Enable&quot;}.
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;status\&quot;:\&quot;Enable\&quot;}</p>
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
