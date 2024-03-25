// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthPermissionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryCustomAuthPermissionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomAuthPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthPermissionResponseBody self = new QueryCustomAuthPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthPermissionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCustomAuthPermissionResponseBody setData(QueryCustomAuthPermissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustomAuthPermissionResponseBodyData getData() {
        return this.data;
    }

    public QueryCustomAuthPermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomAuthPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomAuthPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomAuthPermissionResponseBodyDataResults extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("IdentityType")
        public String identityType;

        @NameInMap("PermitAction")
        public String permitAction;

        @NameInMap("Topic")
        public String topic;

        public static QueryCustomAuthPermissionResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthPermissionResponseBodyDataResults self = new QueryCustomAuthPermissionResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthPermissionResponseBodyDataResults setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public QueryCustomAuthPermissionResponseBodyDataResults setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public QueryCustomAuthPermissionResponseBodyDataResults setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }
        public String getIdentityType() {
            return this.identityType;
        }

        public QueryCustomAuthPermissionResponseBodyDataResults setPermitAction(String permitAction) {
            this.permitAction = permitAction;
            return this;
        }
        public String getPermitAction() {
            return this.permitAction;
        }

        public QueryCustomAuthPermissionResponseBodyDataResults setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryCustomAuthPermissionResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Results")
        public java.util.List<QueryCustomAuthPermissionResponseBodyDataResults> results;

        public static QueryCustomAuthPermissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomAuthPermissionResponseBodyData self = new QueryCustomAuthPermissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomAuthPermissionResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryCustomAuthPermissionResponseBodyData setResults(java.util.List<QueryCustomAuthPermissionResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryCustomAuthPermissionResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
