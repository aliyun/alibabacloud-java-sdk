// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSecurityPolicyResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyResponseBody self = new ListSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecurityPolicyResponseBody setData(ListSecurityPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSecurityPolicyResponseBodyData getData() {
        return this.data;
    }

    public ListSecurityPolicyResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListSecurityPolicyResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListSecurityPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityPolicyResponseBodyDataSecurityPolicies extends TeaModel {
        // 加密套件
        @NameInMap("Ciphers")
        public String ciphers;

        // 业务location
        @NameInMap("RegionId")
        public String regionId;

        // tls策略ID
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        // 名称
        @NameInMap("SecurityPolicyName")
        public String securityPolicyName;

        // tls版本
        @NameInMap("TlsVersion")
        public String tlsVersion;

        public static ListSecurityPolicyResponseBodyDataSecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodyDataSecurityPolicies self = new ListSecurityPolicyResponseBodyDataSecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodyDataSecurityPolicies setCiphers(String ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public String getCiphers() {
            return this.ciphers;
        }

        public ListSecurityPolicyResponseBodyDataSecurityPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSecurityPolicyResponseBodyDataSecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSecurityPolicyResponseBodyDataSecurityPolicies setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        public ListSecurityPolicyResponseBodyDataSecurityPolicies setTlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public String getTlsVersion() {
            return this.tlsVersion;
        }

    }

    public static class ListSecurityPolicyResponseBodyData extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("SecurityPolicies")
        public java.util.List<ListSecurityPolicyResponseBodyDataSecurityPolicies> securityPolicies;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSecurityPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyResponseBodyData self = new ListSecurityPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListSecurityPolicyResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListSecurityPolicyResponseBodyData setSecurityPolicies(java.util.List<ListSecurityPolicyResponseBodyDataSecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }
        public java.util.List<ListSecurityPolicyResponseBodyDataSecurityPolicies> getSecurityPolicies() {
            return this.securityPolicies;
        }

        public ListSecurityPolicyResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
