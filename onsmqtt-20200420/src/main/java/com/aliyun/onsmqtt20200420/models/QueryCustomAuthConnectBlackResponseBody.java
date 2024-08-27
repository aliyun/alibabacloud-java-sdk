// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthConnectBlackResponseBody extends TeaModel {
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
    public QueryCustomAuthConnectBlackResponseBodyData data;

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
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
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

    public static QueryCustomAuthConnectBlackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthConnectBlackResponseBody self = new QueryCustomAuthConnectBlackResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthConnectBlackResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCustomAuthConnectBlackResponseBody setData(QueryCustomAuthConnectBlackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomAuthConnectBlackResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomAuthConnectBlackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomAuthConnectBlackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomAuthConnectBlackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomAuthConnectBlackResponseBodyDataResults extends TeaModel {
        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_TEST@@@test</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>Indicates whether to allow or deny access.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The authorized permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>CONNECT</p>
         */
        @NameInMap("PermitAction")
        public String permitAction;

        public static QueryCustomAuthConnectBlackResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthConnectBlackResponseBodyDataResults self = new QueryCustomAuthConnectBlackResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthConnectBlackResponseBodyDataResults setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryCustomAuthConnectBlackResponseBodyDataResults setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public QueryCustomAuthConnectBlackResponseBodyDataResults setPermitAction(String permitAction) {
            this.permitAction = permitAction;
            return this;
        }
        public String getPermitAction() {
            return this.permitAction;
        }

    }

    public static class QueryCustomAuthConnectBlackResponseBodyData extends TeaModel {
        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAZ0cM0HTqLXvgm7oMHWXcvc=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Results")
        public java.util.List<QueryCustomAuthConnectBlackResponseBodyDataResults> results;

        public static QueryCustomAuthConnectBlackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthConnectBlackResponseBodyData self = new QueryCustomAuthConnectBlackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthConnectBlackResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryCustomAuthConnectBlackResponseBodyData setResults(java.util.List<QueryCustomAuthConnectBlackResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryCustomAuthConnectBlackResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
