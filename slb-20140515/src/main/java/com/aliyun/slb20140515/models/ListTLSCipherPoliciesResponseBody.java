// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("TLSCipherPolicies")
    public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> TLSCipherPolicies;

    public static ListTLSCipherPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTLSCipherPoliciesResponseBody self = new ListTLSCipherPoliciesResponseBody();
        return TeaModel.build(map, self);
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

    public ListTLSCipherPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTLSCipherPoliciesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListTLSCipherPoliciesResponseBody setTLSCipherPolicies(java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> TLSCipherPolicies) {
        this.TLSCipherPolicies = TLSCipherPolicies;
        return this;
    }
    public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPolicies> getTLSCipherPolicies() {
        return this.TLSCipherPolicies;
    }

    public static class ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners build(java.util.Map<String, ?> map) throws Exception {
            ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners self = new ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners();
            return TeaModel.build(map, self);
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

        public ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class ListTLSCipherPoliciesResponseBodyTLSCipherPolicies extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("RelateListeners")
        public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> relateListeners;

        @NameInMap("TLSVersions")
        public java.util.List<String> TLSVersions;

        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        public static ListTLSCipherPoliciesResponseBodyTLSCipherPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListTLSCipherPoliciesResponseBodyTLSCipherPolicies self = new ListTLSCipherPoliciesResponseBodyTLSCipherPolicies();
            return TeaModel.build(map, self);
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setRelateListeners(java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> relateListeners) {
            this.relateListeners = relateListeners;
            return this;
        }
        public java.util.List<ListTLSCipherPoliciesResponseBodyTLSCipherPoliciesRelateListeners> getRelateListeners() {
            return this.relateListeners;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setTLSVersions(java.util.List<String> TLSVersions) {
            this.TLSVersions = TLSVersions;
            return this;
        }
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

        public ListTLSCipherPoliciesResponseBodyTLSCipherPolicies setCiphers(java.util.List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

    }

}
