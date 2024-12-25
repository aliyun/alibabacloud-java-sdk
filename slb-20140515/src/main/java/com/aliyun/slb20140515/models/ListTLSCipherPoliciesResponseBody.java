// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the current page is the last page. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The current page is the last page.</li>
     * <li><strong>false</strong>: The current page is not the last page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
     * <li>If <strong>NextToken</strong> is not empty, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
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
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa08ex****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The listening port. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The listening protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
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
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * </ul>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * <li>ECDHE-ECDSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-ECDSA-AES128-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-SHA384</li>
         * <li>ECDHE-RSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-RSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-RSA-AES128-SHA256</li>
         * <li>ECDHE-RSA-AES256-SHA384</li>
         * <li>AES128-GCM-SHA256</li>
         * <li>AES256-GCM-SHA384</li>
         * <li>AES128-SHA256 AES256-SHA256</li>
         * </ul>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <ul>
         * <li>TLS_AES_128_GCM_SHA256</li>
         * <li>TLS_AES_256_GCM_SHA384</li>
         * <li>TLS_CHACHA20_POLY1305_SHA256</li>
         * <li>TLS_AES_128_CCM_SHA256</li>
         * <li>TLS_AES_128_CCM_8_SHA256</li>
         * </ul>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The timestamp generated when the TLS policy is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1608273800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the TLS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp17elso1h323r****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the TLS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSPolicy-test****</p>
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
         * <ul>
         * <li><strong>configuring</strong>: The TLS policy is being configured.</li>
         * <li><strong>normal</strong>: The TLS policy works as expected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
