// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthPermissionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
    public QueryCustomAuthPermissionResponseBodyData data;

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
     * <p>63309FDB-ED6C-46AE-B31C-A172FBA0****</p>
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
        /**
         * <p>Indicates whether to allow or deny access.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The username or client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Identity")
        public String identity;

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
         * <p>The authorized permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_SUB</p>
         */
        @NameInMap("PermitAction")
        public String permitAction;

        /**
         * <p>The topic name. Multi-level topics and wildcard characters are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV/vsqTyeMlX1MIk7/b6NrZLIlsSVf49O04ac7HAmlBoaYspakK7ZZkR3vRDp5Y9Nz0EmuWYrtF+1qkUwuJzPk/qEto/FGxl5Kd+qdwNt3t8</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The response results.</p>
         */
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
