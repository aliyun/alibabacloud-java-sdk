// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C057647-284B-5C67-A07E-4B8F3DABA9F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of TLS security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSystemSecurityPolicyResponseBodySecurityPolicies> securityPolicies;

    public static ListSystemSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPolicyResponseBody self = new ListSystemSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemSecurityPolicyResponseBody setSecurityPolicies(java.util.List<ListSystemSecurityPolicyResponseBodySecurityPolicies> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }
    public java.util.List<ListSystemSecurityPolicyResponseBodySecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public static class ListSystemSecurityPolicyResponseBodySecurityPolicies extends TeaModel {
        /**
         * <p>The cipher suites.</p>
         * 
         * <strong>example:</strong>
         * <p>ECDHE-ECDSA-AES128-SHA</p>
         */
        @NameInMap("Ciphers")
        public String ciphers;

        /**
         * <p>The TLS policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-3fdab6dkkke10s****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The TLS policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        /**
         * <p>The version of the TLS protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.0</p>
         */
        @NameInMap("TlsVersion")
        public String tlsVersion;

        public static ListSystemSecurityPolicyResponseBodySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSystemSecurityPolicyResponseBodySecurityPolicies self = new ListSystemSecurityPolicyResponseBodySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSystemSecurityPolicyResponseBodySecurityPolicies setCiphers(String ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public String getCiphers() {
            return this.ciphers;
        }

        public ListSystemSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSystemSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        public ListSystemSecurityPolicyResponseBodySecurityPolicies setTlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public String getTlsVersion() {
            return this.tlsVersion;
        }

    }

}
