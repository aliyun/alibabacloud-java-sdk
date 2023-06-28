// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of TLS policies to be queried in this call. Valid values: **1** to **100**. If you do not set this parameter, the default value **20** is used.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The operation that you want to perform. Set the value to **ListTLSCipherPolicies**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("TLSCipherPolicies")
    public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> TLSCipherPolicies;

    /**
     * <p>The ID of the CLB instance.</p>
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
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the TLS policy.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the request.</p>
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
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The listening port. Valid values: **1** to **65535**.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The listening protocol. Valid values:</p>
         * <br>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of associated listeners.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to return the information about the associated listeners. Valid values:</p>
         * <br>
         * <p>*   **true**: returns the information about the associated listeners.</p>
         * <p>*   **false** (default): does not return the information about the associated listeners.</p>
         */
        @NameInMap("RelateListeners")
        public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> relateListeners;

        /**
         * <p>Indicates whether the current page is the last page. Valid values:</p>
         * <br>
         * <p>*   **true**: The current page is the last page.</p>
         * <p>*   **false**: The current page is not the last page.</p>
         */
        @NameInMap("Status")
        public String status;

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
