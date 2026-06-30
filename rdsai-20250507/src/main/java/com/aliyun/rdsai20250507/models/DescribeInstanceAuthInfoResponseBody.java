// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceAuthInfoResponseBody extends TeaModel {
    /**
     * <p>API Keys。</p>
     */
    @NameInMap("ApiKeys")
    public DescribeInstanceAuthInfoResponseBodyApiKeys apiKeys;

    /**
     * <p>The list of authentication configurations.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceAuthInfoResponseBodyConfigList> configList;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The JWT secret.</p>
     * 
     * <strong>example:</strong>
     * <p>g7jgepleljS8nxAwsOd2EDWkBWi7JcU1m2Gj****</p>
     */
    @NameInMap("JwtSecret")
    public String jwtSecret;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAuthInfoResponseBody self = new DescribeInstanceAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAuthInfoResponseBody setApiKeys(DescribeInstanceAuthInfoResponseBodyApiKeys apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public DescribeInstanceAuthInfoResponseBodyApiKeys getApiKeys() {
        return this.apiKeys;
    }

    public DescribeInstanceAuthInfoResponseBody setConfigList(java.util.List<DescribeInstanceAuthInfoResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeInstanceAuthInfoResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeInstanceAuthInfoResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceAuthInfoResponseBody setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
        return this;
    }
    public String getJwtSecret() {
        return this.jwtSecret;
    }

    public DescribeInstanceAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAuthInfoResponseBodyApiKeys extends TeaModel {
        /**
         * <p>The ANON_KEY of Supabase.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUz<strong><strong>J9.eyJpc3MiOiJzdXBhYmFzZSIsInJvbGUiOiJhbm9uIiwiaWF0IjoxNzU1Nzg1ODc1LCJleHAiOjEzMjY2NDI1ODc1fQ.EGNFdeWRZBsdB051EzQsBwvDJveC9IMEXWUCDLX</strong></strong></p>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        @NameInMap("E2bApiKey")
        public String e2bApiKey;

        /**
         * <p>The SERVICE_ROLE_KEY of Supabase.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUz<strong><strong>J9.eyJpc3MiOiJzdXBhYmFzZSIsInJvbGUiOiJzZXJ2aWNlX3JvbGUiLCJpYXQiOjE3NTU3ODU4NzUsImV4cCI6MTMyNjY0MjU4NzV9.oJt4UF8cpSDOvjW39IM4fLp2750rEvxFnkNqcVM</strong></strong></p>
         */
        @NameInMap("ServiceKey")
        public String serviceKey;

        public static DescribeInstanceAuthInfoResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAuthInfoResponseBodyApiKeys self = new DescribeInstanceAuthInfoResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAuthInfoResponseBodyApiKeys setAnonKey(String anonKey) {
            this.anonKey = anonKey;
            return this;
        }
        public String getAnonKey() {
            return this.anonKey;
        }

        public DescribeInstanceAuthInfoResponseBodyApiKeys setE2bApiKey(String e2bApiKey) {
            this.e2bApiKey = e2bApiKey;
            return this;
        }
        public String getE2bApiKey() {
            return this.e2bApiKey;
        }

        public DescribeInstanceAuthInfoResponseBodyApiKeys setServiceKey(String serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }
        public String getServiceKey() {
            return this.serviceKey;
        }

    }

    public static class DescribeInstanceAuthInfoResponseBodyConfigList extends TeaModel {
        /**
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>GOTRUE_EXTERNAL_EMAIL_ENABLED</strong>: Specifies whether to allow external email addresses.</li>
         * <li><strong>GOTRUE_SITE_URL</strong>: The website URL displayed when the AI application sends emails.</li>
         * <li><strong>GOTRUE_SMTP_PORT</strong>: The port of the SMTP provider.</li>
         * <li><strong>GOTRUE_SMTP_SENDER_NAME</strong>: The name of the email sender.</li>
         * <li><strong>GOTRUE_SMTP_USER</strong>: The username of the SMTP provider.</li>
         * <li><strong>GOTRUE_SMTP_PASS</strong>: The secret key of the SMTP provider.</li>
         * <li><strong>GOTRUE_SMTP_ADMIN_EMAIL</strong>: The email address of the SMTP provider.</li>
         * <li><strong>GOTRUE_SMTP_HOST</strong>: The host address of the SMTP provider.</li>
         * <li><strong>GOTRUE_MAILER_AUTOCONFIRM</strong>: Specifies whether to enable automatic confirmation.</li>
         * <li><strong>GOTRUE_MAILER_OTP_EXP</strong>: The validity period of the one-time password (OTP). Unit: seconds.</li>
         * <li><strong>GOTRUE_MAILER_OTP_LENGTH</strong>: The length of the one-time password (OTP) verification code. The value must be an integer greater than or equal to 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GOTRUE_SITE_URL</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://8.152">http://8.152</a>. XXX.XXX</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceAuthInfoResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAuthInfoResponseBodyConfigList self = new DescribeInstanceAuthInfoResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAuthInfoResponseBodyConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceAuthInfoResponseBodyConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
