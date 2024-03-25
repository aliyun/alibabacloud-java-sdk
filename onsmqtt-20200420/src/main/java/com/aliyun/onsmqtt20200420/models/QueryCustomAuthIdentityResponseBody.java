// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthIdentityResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryCustomAuthIdentityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomAuthIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthIdentityResponseBody self = new QueryCustomAuthIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthIdentityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCustomAuthIdentityResponseBody setData(QueryCustomAuthIdentityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomAuthIdentityResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomAuthIdentityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomAuthIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomAuthIdentityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomAuthIdentityResponseBodyDataResults extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("IdentityType")
        public String identityType;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("SignMode")
        public String signMode;

        @NameInMap("Username")
        public String username;

        public static QueryCustomAuthIdentityResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthIdentityResponseBodyDataResults self = new QueryCustomAuthIdentityResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthIdentityResponseBodyDataResults setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryCustomAuthIdentityResponseBodyDataResults setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }
        public String getIdentityType() {
            return this.identityType;
        }

        public QueryCustomAuthIdentityResponseBodyDataResults setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public QueryCustomAuthIdentityResponseBodyDataResults setSignMode(String signMode) {
            this.signMode = signMode;
            return this;
        }
        public String getSignMode() {
            return this.signMode;
        }

        public QueryCustomAuthIdentityResponseBodyDataResults setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class QueryCustomAuthIdentityResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Results")
        public java.util.List<QueryCustomAuthIdentityResponseBodyDataResults> results;

        public static QueryCustomAuthIdentityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthIdentityResponseBodyData self = new QueryCustomAuthIdentityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthIdentityResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryCustomAuthIdentityResponseBodyData setResults(java.util.List<QueryCustomAuthIdentityResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryCustomAuthIdentityResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
