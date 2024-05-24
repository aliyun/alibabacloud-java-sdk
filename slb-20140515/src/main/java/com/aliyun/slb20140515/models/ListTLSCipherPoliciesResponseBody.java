// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the current page is the last page. Valid values:</p>
     * <br>
     * <p>*   **true**: The current page is the last page.</p>
     * <p>*   **false**: The current page is not the last page.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, it indicates that no next query is to be sent.</p>
     * <p>*   If **NextToken** is not empty, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of TLS policies.</p>
     */
    @NameInMap("TLSCipherPolicies")
    public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> TLSCipherPolicies;

    /**
     * <p>The total number of TLS policies returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTLSCipherPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTLSCipherPoliciesResponseBody self = new ListTLSCipherPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTLSCipherPoliciesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListTLSCipherPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTLSCipherPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTLSCipherPoliciesResponseBody setTLSCipherPolicies(java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> TLSCipherPolicies) {
        this.TLSCipherPolicies = TLSCipherPolicies;
        return this;
    }
    public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> getTLSCipherPolicies() {
        return this.TLSCipherPolicies;
    }

    public ListTLSCipherPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners extends TeaModel {
        /**
         * <p>The ID of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The listening port. Valid values: **1** to **65535**.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The listening protocol. Valid values:</p>
         * <br>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners build(java.util.Map<String, ?> map) throws Exception {
            ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners self = new ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners();
            return TeaModel.build(map, self);
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ListTLSCipherPoliciesResponseBodyTLSCipherPolicies extends TeaModel {
        /**
         * <p>The cipher suites supported by the TLS version.</p>
         * <br>
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <br>
         * <p>*   ECDHE-ECDSA-AES128-SHA</p>
         * <p>*   ECDHE-ECDSA-AES256-SHA</p>
         * <p>*   ECDHE-RSA-AES128-SHA</p>
         * <p>*   ECDHE-RSA-AES256-SHA</p>
         * <p>*   AES128-SHA AES256-SHA</p>
         * <p>*   DES-CBC3-SHA</p>
         * <br>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <br>
         * <p>*   ECDHE-ECDSA-AES128-SHA</p>
         * <p>*   ECDHE-ECDSA-AES256-SHA</p>
         * <p>*   ECDHE-RSA-AES128-SHA</p>
         * <p>*   ECDHE-RSA-AES256-SHA</p>
         * <p>*   AES128-SHA AES256-SHA</p>
         * <p>*   DES-CBC3-SHA</p>
         * <p>*   ECDHE-ECDSA-AES128-GCM-SHA256</p>
         * <p>*   ECDHE-ECDSA-AES256-GCM-SHA384</p>
         * <p>*   ECDHE-ECDSA-AES128-SHA256</p>
         * <p>*   ECDHE-ECDSA-AES256-SHA384</p>
         * <p>*   ECDHE-RSA-AES128-GCM-SHA256</p>
         * <p>*   ECDHE-RSA-AES256-GCM-SHA384</p>
         * <p>*   ECDHE-RSA-AES128-SHA256</p>
         * <p>*   ECDHE-RSA-AES256-SHA384</p>
         * <p>*   AES128-GCM-SHA256</p>
         * <p>*   AES256-GCM-SHA384</p>
         * <p>*   AES128-SHA256 AES256-SHA256</p>
         * <br>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <br>
         * <p>*   TLS_AES_128_GCM_SHA256</p>
         * <p>*   TLS_AES_256_GCM_SHA384</p>
         * <p>*   TLS_CHACHA20_POLY1305_SHA256</p>
         * <p>*   TLS_AES_128_CCM_SHA256</p>
         * <p>*   TLS_AES_128_CCM_8_SHA256</p>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The timestamp generated when the TLS policy is created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the TLS policy.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the TLS policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of associated listeners.</p>
         */
        @NameInMap("RelateListeners")
        public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> relateListeners;

        /**
         * <p>The status of the TLS policy. Valid values:</p>
         * <br>
         * <p>*   **configuring**: The TLS policy is being configured.</p>
         * <p>*   **normal**: The TLS policy works as expected.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version of the TLS protocol.</p>
         */
        @NameInMap("TLSVersions")
        public java.util.List<String> TLSVersions;

        public static ListTLSCipherPoliciesResponseBodyTLSCipherPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListTLSCipherPoliciesResponseBodyTLSCipherPolicies self = new ListTLSCipherPoliciesResponseBodyTLSCipherPolicies();
            return TeaModel.build(map, self);
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setCiphers(java.util.List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setRelateListeners(java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> relateListeners) {
            this.relateListeners = relateListeners;
            return this;
        }
        public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> getRelateListeners() {
            return this.relateListeners;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setTLSVersions(java.util.List<String> TLSVersions) {
            this.TLSVersions = TLSVersions;
            return this;
        }
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

    }

}
