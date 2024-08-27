// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthIdentityResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request is successful. Other status codes indicate that the request failed. For a list of error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryCustomAuthIdentityResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11568B5B-13A8-4E72-9DBA-3A14F7D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>The client ID if IdentityType is set to CLIENT.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_ICP@@@4d378084</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The identity type. Valid values:</p>
         * <ul>
         * <li>USER</li>
         * <li>CLIENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("IdentityType")
        public String identityType;

        /**
         * <p>The AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>62a5916d71767185b48907d85c2efae2</p>
         */
        @NameInMap("Secret")
        public String secret;

        /**
         * <p>The signature verification mode. ORIGIN: compares the password and the AccessKey secret. SIGNED: uses the HMAC_SHA1 algorithm to sign the client ID to obtain a password and then compares the password.</p>
         * 
         * <strong>example:</strong>
         * <p>SIGNED</p>
         */
        @NameInMap("SignMode")
        public String signMode;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAXA+GzVqTutYpgkFjBrchKzuvSbpuTqtt6OF9tsC9QnJ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The returned results.</p>
         */
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
