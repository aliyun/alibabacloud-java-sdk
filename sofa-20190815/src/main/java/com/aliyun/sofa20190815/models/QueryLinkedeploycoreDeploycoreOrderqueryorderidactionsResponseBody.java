// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody self = new QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody setData(QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData extends TeaModel {
        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Actions")
        public java.util.List<String> actions;

        public static QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData self = new QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBodyData setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

    }

}
