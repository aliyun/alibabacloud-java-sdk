// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DelAppResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DelAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelAppResponseBody self = new DelAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DelAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DelAppResponseBody setData(DelAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DelAppResponseBodyData getData() {
        return this.data;
    }

    public DelAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DelAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DelAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DelAppResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static DelAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DelAppResponseBodyData self = new DelAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DelAppResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
