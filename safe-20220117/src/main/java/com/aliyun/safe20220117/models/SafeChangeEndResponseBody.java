// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeEndResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeEndResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeEndResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeEndResponseBody self = new SafeChangeEndResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeEndResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeEndResponseBody setData(SafeChangeEndResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeEndResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeEndResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeEndResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeEndResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeEndResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static SafeChangeEndResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeEndResponseBodyData self = new SafeChangeEndResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeEndResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
