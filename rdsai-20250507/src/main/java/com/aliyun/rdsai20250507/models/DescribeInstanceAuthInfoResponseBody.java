// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceAuthInfoResponseBody extends TeaModel {
    /**
     * <p>API Keys</p>
     */
    @NameInMap("ApiKeys")
    public DescribeInstanceAuthInfoResponseBodyApiKeys apiKeys;

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

}
