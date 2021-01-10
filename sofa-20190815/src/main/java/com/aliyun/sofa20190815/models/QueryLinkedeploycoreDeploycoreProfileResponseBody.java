// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfileResponseBody extends TeaModel {
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
    public QueryLinkedeploycoreDeploycoreProfileResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfileResponseBody self = new QueryLinkedeploycoreDeploycoreProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponseBody setData(QueryLinkedeploycoreDeploycoreProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProfileResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreProfileResponseBodyData extends TeaModel {
        @NameInMap("Current")
        public Long current;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Result")
        public java.util.List<String> result;

        public static QueryLinkedeploycoreDeploycoreProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreProfileResponseBodyData self = new QueryLinkedeploycoreDeploycoreProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreProfileResponseBodyData setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public QueryLinkedeploycoreDeploycoreProfileResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryLinkedeploycoreDeploycoreProfileResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkedeploycoreDeploycoreProfileResponseBodyData setResult(java.util.List<String> result) {
            this.result = result;
            return this;
        }
        public java.util.List<String> getResult() {
            return this.result;
        }

    }

}
