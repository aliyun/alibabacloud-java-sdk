// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no next page exists.</li>
     * <li>If a value is returned for NextToken, specify the value in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7A8875F-373A-5F48-8484-25B07A61F2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of TLS security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSecurityPolicyResponseBodySecurityPolicies> securityPolicies;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        /**
         * <p>The listener protocol. Valid value: <strong>TCPSSL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TCPSSL</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The NLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
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
         * <p>The tag key. You can specify up to 10 tag keys.</p>
         * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
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
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <ul>
         * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
         * <li><strong>AES128-SHA</strong></li>
         * <li><strong>AES256-SHA</strong></li>
         * <li><strong>DES-CBC3-SHA</strong></li>
         * </ul>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <ul>
         * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
         * <li><strong>AES128-SHA</strong></li>
         * <li><strong>AES256-SHA</strong></li>
         * <li><strong>DES-CBC3-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES128-GCM-SHA256</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-GCM-SHA384</strong></li>
         * <li><strong>ECDHE-ECDSA-AES128-SHA256</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA384</strong></li>
         * <li><strong>ECDHE-RSA-AES128-GCM-SHA256</strong></li>
         * <li><strong>ECDHE-RSA-AES256-GCM-SHA384</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA256</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA384</strong></li>
         * <li><strong>AES128-GCM-SHA256</strong></li>
         * <li><strong>AES256-GCM-SHA384</strong></li>
         * <li><strong>AES128-SHA256</strong></li>
         * <li><strong>AES256-SHA256</strong></li>
         * </ul>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <ul>
         * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
         * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
         * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECDHE-ECDSA-AES128-SHA</p>
         */
        @NameInMap("Ciphers")
        public String ciphers;

        /**
         * <p>The region ID of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The listeners that are associated with the NLB instance.</p>
         */
        @NameInMap("RelatedListeners")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesRelatedListeners> relatedListeners;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the TLS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp14bb1e7dll4f****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The name of the TLS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSCipherPolicy</p>
         */
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        /**
         * <p>The status of the TLS security policy. Valid values:</p>
         * <ul>
         * <li><strong>Configuring</strong></li>
         * <li><strong>Available</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("SecurityPolicyStatus")
        public String securityPolicyStatus;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListSecurityPolicyResponseBodySecurityPoliciesTags> tags;

        /**
         * <p>The supported versions of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.0</p>
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
