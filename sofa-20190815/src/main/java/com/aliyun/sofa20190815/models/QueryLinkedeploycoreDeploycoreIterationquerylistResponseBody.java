// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody self = new QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData extends TeaModel {
        @NameInMap("IterationId")
        public String iterationId;

        @NameInMap("IterationName")
        public String iterationName;

        public static QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData self = new QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData setIterationId(String iterationId) {
            this.iterationId = iterationId;
            return this;
        }
        public String getIterationId() {
            return this.iterationId;
        }

        public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBodyData setIterationName(String iterationName) {
            this.iterationName = iterationName;
            return this;
        }
        public String getIterationName() {
            return this.iterationName;
        }

    }

}
