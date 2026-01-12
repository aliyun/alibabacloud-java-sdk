// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceAuthInfoResponseBody extends TeaModel {
    /**
     * <p>The API keys.</p>
     */
    @NameInMap("ApiKeys")
    public DescribeInstanceAuthInfoResponseBodyApiKeys apiKeys;

    /**
     * <p>The authentication configurations.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceAuthInfoResponseBodyConfigList> configList;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The JWT key.</p>
     * 
     * <strong>example:</strong>
     * <p>i5o1XAp4sR*****oyOb3O</p>
     */
    @NameInMap("JwtSecret")
    public String jwtSecret;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>87249A6F-xxx-804C-E1E0AD1FAD90</p>
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
         * <p>eyxxxJ9.ey****</p>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        /**
         * <p>The SERVICE_ROLE_KEY of Supabase.</p>
         * 
         * <strong>example:</strong>
         * <p>eyxxxJ9.ey****KfQ.DaYxxxt4Q</p>
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
         * <li><strong>GOTRUE_EXTERNAL_EMAIL_ENABLED</strong>: Enables authentication via external email addresses.</li>
         * <li><strong>GOTRUE_SITE_URL</strong>: the URL that is displayed in the emails sent from the instance.</li>
         * <li><strong>GOTRUE_SMTP_PORT</strong>: the port of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_SENDER_NAME</strong>: the name of the sender of the email.</li>
         * <li><strong>GOTRUE_SMTP_USER</strong>: the username of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_PASS</strong>: the key of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_ADMIN_EMAIL</strong>: the email address of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_HOST</strong>: The host address of the SMTP service provider.</li>
         * <li><strong>GOTRUE_MAILER_AUTOCONFIRM</strong>: specifies whether to enable automatic confirmation.</li>
         * <li><strong>GOTRUE_MAILER_OTP_EXP</strong>: The validity period of the one-time password (OTP). Unit: seconds.</li>
         * <li><strong>GOTRUE_MAILER_OTP_LENGTH</strong>: The verification code length of the one-time password (OTP). The value must be an integer greater than or equal to 6.</li>
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
