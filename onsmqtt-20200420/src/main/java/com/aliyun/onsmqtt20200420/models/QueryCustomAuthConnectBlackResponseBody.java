// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthConnectBlackResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryCustomAuthConnectBlackResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Effect")
        public String effect;

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
        @NameInMap("NextToken")
        public String nextToken;

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
