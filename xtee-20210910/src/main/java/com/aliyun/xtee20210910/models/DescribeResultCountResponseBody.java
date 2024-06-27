// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeResultCountResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeResultCountResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeResultCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultCountResponseBody self = new DescribeResultCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResultCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResultCountResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeResultCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResultCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResultCountResponseBody setResultObject(java.util.List<DescribeResultCountResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeResultCountResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeResultCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResultCountResponseBodyResultObject extends TeaModel {
        @NameInMap("result")
        public String result;

        @NameInMap("total")
        public String total;

        public static DescribeResultCountResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeResultCountResponseBodyResultObject self = new DescribeResultCountResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeResultCountResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeResultCountResponseBodyResultObject setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
