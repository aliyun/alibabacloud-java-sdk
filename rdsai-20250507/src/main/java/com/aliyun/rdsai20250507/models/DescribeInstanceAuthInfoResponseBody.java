// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceAuthInfoResponseBody extends TeaModel {
    /**
     * <p>API Keys</p>
     */
    @NameInMap("ApiKeys")
    public DescribeInstanceAuthInfoResponseBodyApiKeys apiKeys;

    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceAuthInfoResponseBodyConfigList> configList;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>i5o1XAp4sR*****oyOb3O</p>
     */
    @NameInMap("JwtSecret")
    public String jwtSecret;

    /**
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
         * <p>Supabase ANON_KEY</p>
         * 
         * <strong>example:</strong>
         * <p>eyxxxJ9.ey****</p>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        /**
         * <p>Supabase SERVICE_ROLE_KEY</p>
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
        @NameInMap("Name")
        public String name;

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
