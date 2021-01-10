// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderResponseBody extends TeaModel {
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
    public QueryLinkedeploycoreDeploycoreOrderResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderResponseBody self = new QueryLinkedeploycoreDeploycoreOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponseBody setData(QueryLinkedeploycoreDeploycoreOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreOrderResponseBodyData extends TeaModel {
        @NameInMap("Current")
        public Long current;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Result")
        public java.util.List<String> result;

        public static QueryLinkedeploycoreDeploycoreOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreOrderResponseBodyData self = new QueryLinkedeploycoreDeploycoreOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreOrderResponseBodyData setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public QueryLinkedeploycoreDeploycoreOrderResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryLinkedeploycoreDeploycoreOrderResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkedeploycoreDeploycoreOrderResponseBodyData setResult(java.util.List<String> result) {
            this.result = result;
            return this;
        }
        public java.util.List<String> getResult() {
            return this.result;
        }

    }

}
