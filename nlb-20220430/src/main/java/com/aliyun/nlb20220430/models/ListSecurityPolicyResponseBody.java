// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of TLS security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> securityPolicies;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyResponseBody self = new ListSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecurityPolicyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityPolicyResponseBody setSecurityPolicies(java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }
    public java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public ListSecurityPolicyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners extends TeaModel {
        /**
         * <p>The ID of the listener.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listening port.</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        /**
         * <p>The listening protocol. Valid value: **TCPSSL**.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The ID of the NLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners self = new ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class ListSecurityPolicyResponseBodySecurityPoliciesTags extends TeaModel {
        /**
         * <p>The tag keys. You can specify up to 10 tag keys.</p>
         * <br>
         * <p>The tag key can be at most 64 characters in length, and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values. You can specify up to 10 tag values.</p>
         * <br>
         * <p>It can be at most 128 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSecurityPolicyResponseBodySecurityPoliciesTags build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPoliciesTags self = new ListSecurityPolicyResponseBodySecurityPoliciesTags();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSecurityPolicyResponseBodySecurityPoliciesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSecurityPolicyResponseBodySecurityPolicies extends TeaModel {
        /**
         * <p>The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.</p>
         * <br>
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <br>
         * <p>*   **ECDHE-ECDSA-AES128-SHA**</p>
         * <p>*   **ECDHE-ECDSA-AES256-SHA**</p>
         * <p>*   **ECDHE-RSA-AES128-SHA**</p>
         * <p>*   **ECDHE-RSA-AES256-SHA**</p>
         * <p>*   **AES128-SHA**</p>
         * <p>*   **AES256-SHA**</p>
         * <p>*   **DES-CBC3-SHA**</p>
         * <br>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <br>
         * <p>*   **ECDHE-ECDSA-AES128-SHA**</p>
         * <p>*   **ECDHE-ECDSA-AES256-SHA**</p>
         * <p>*   **ECDHE-RSA-AES128-SHA**</p>
         * <p>*   **ECDHE-RSA-AES256-SHA**</p>
         * <p>*   **AES128-SHA**</p>
         * <p>*   **AES256-SHA**</p>
         * <p>*   **DES-CBC3-SHA**</p>
         * <p>*   **ECDHE-ECDSA-AES128-GCM-SHA256**</p>
         * <p>*   **ECDHE-ECDSA-AES256-GCM-SHA384**</p>
         * <p>*   **ECDHE-ECDSA-AES128-SHA256**</p>
         * <p>*   **ECDHE-ECDSA-AES256-SHA384**</p>
         * <p>*   **ECDHE-RSA-AES128-GCM-SHA256**</p>
         * <p>*   **ECDHE-RSA-AES256-GCM-SHA384**</p>
         * <p>*   **ECDHE-RSA-AES128-SHA256**</p>
         * <p>*   **ECDHE-RSA-AES256-SHA384**</p>
         * <p>*   **AES128-GCM-SHA256**</p>
         * <p>*   **AES256-GCM-SHA384**</p>
         * <p>*   **AES128-SHA256**</p>
         * <p>*   **AES256-SHA256**</p>
         * <br>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <br>
         * <p>*   **TLS_AES\_128\_GCM_SHA256**</p>
         * <p>*   **TLS_AES\_256\_GCM_SHA384**</p>
         * <p>*   **TLS_CHACHA20\_POLY1305\_SHA256**</p>
         * <p>*   **TLS_AES\_128\_CCM_SHA256**</p>
         * <p>*   **TLS_AES\_128\_CCM\_8\_SHA256**</p>
         */
        @NameInMap("Ciphers")
        public String ciphers;

        /**
         * <p>The ID of the region where the NLB instance is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The listeners that are associated with the NLB instance.</p>
         */
        @NameInMap("RelatedListeners")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> relatedListeners;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the TLS security policy.</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The name of the TLS security policy.</p>
         */
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        /**
         * <p>The status of the TLS security policy. Valid values:</p>
         * <br>
         * <p>*   **Configuring**: The security policy is being configured.</p>
         * <p>*   **Available**: The security policy is available.</p>
         */
        @NameInMap("SecurityPolicyStatus")
        public String securityPolicyStatus;

        /**
         * <p>The tags that are added to the NLB instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> tags;

        /**
         * <p>The supported versions of the TLS protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.</p>
         */
        @NameInMap("TlsVersion")
        public String tlsVersion;

        public static ListSecurityPolicyResponseBodySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodySecurityPolicies self = new ListSecurityPolicyResponseBodySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setCiphers(String ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public String getCiphers() {
            return this.ciphers;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setRelatedListeners(java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setSecurityPolicyStatus(String securityPolicyStatus) {
            this.securityPolicyStatus = securityPolicyStatus;
            return this;
        }
        public String getSecurityPolicyStatus() {
            return this.securityPolicyStatus;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setTags(java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> getTags() {
            return this.tags;
        }

        public ListSecurityPolicyResponseBodySecurityPolicies setTlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public String getTlsVersion() {
            return this.tlsVersion;
        }

    }

}
