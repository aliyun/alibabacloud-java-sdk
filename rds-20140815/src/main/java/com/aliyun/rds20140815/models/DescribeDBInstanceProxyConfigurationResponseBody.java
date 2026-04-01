// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the mechanism that is used to mitigate brute-force attacks is enabled:</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * <p>The return value is a JSON string. Example:</p>
     * <pre><code>{&quot;status&quot;:&quot;Disable&quot;, &quot;check_interval_seconds&quot;: 60,
     *           &quot;max_failed_login_attempts&quot;: 60, &quot;blocking_seconds&quot;: 600}
     * </code></pre>
     * <p>Description:</p>
     * <ul>
     * <li><p>Each client allows {max_failed_login_attempts} logon attempts that fail due to incorrect passwords within {check_interval_seconds} seconds. If one more such attempt is conducted, the client must wait for {blocking_seconds} seconds before you can try again.</p>
     * </li>
     * <li><p>Valid values:</p>
     * <ul>
     * <li>check_interval_seconds: <strong>30 to 600</strong>. Unit: seconds.</li>
     * <li>max_failed_login_attempts: <strong>10 to 5000</strong>. Unit: times.</li>
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
     * <p>Indicates whether the short-lived connection optimization feature is enabled.</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * <p>In this case, the return value is a JSON string. Examples:</p>
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
     * <p>Indicates whether the transparent switchover feature is enabled.</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * <p>The return value is a JSON string. Example:</p>
     * <pre><code>{&quot;status&quot;:&quot;Enable&quot;}
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
