// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteExtendServiceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Data")
    public ExecuteExtendServiceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteExtendServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteExtendServiceResponseBody self = new ExecuteExtendServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteExtendServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteExtendServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteExtendServiceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteExtendServiceResponseBody setData(ExecuteExtendServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteExtendServiceResponseBodyData getData() {
        return this.data;
    }

    public ExecuteExtendServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteExtendServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteExtendServiceResponseBodyData extends TeaModel {
        @NameInMap("InvokeResult")
        public String invokeResult;

        public static ExecuteExtendServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteExtendServiceResponseBodyData self = new ExecuteExtendServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteExtendServiceResponseBodyData setInvokeResult(String invokeResult) {
            this.invokeResult = invokeResult;
            return this;
        }
        public String getInvokeResult() {
            return this.invokeResult;
        }

    }

}
