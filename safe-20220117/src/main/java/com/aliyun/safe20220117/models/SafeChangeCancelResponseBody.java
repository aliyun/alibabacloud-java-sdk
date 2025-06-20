// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCancelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeCancelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCancelResponseBody self = new SafeChangeCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeCancelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeCancelResponseBody setData(SafeChangeCancelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeCancelResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeCancelResponseBodyData extends TeaModel {
        @NameInMap("SourceOrderId")
        public String sourceOrderId;

        public static SafeChangeCancelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCancelResponseBodyData self = new SafeChangeCancelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeCancelResponseBodyData setSourceOrderId(String sourceOrderId) {
            this.sourceOrderId = sourceOrderId;
            return this;
        }
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

    }

}
