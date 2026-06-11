// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppTransitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateMmAppTransitionResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMmAppTransitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppTransitionResponseBody self = new UpdateMmAppTransitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppTransitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMmAppTransitionResponseBody setData(UpdateMmAppTransitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMmAppTransitionResponseBodyData getData() {
        return this.data;
    }

    public UpdateMmAppTransitionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMmAppTransitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMmAppTransitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMmAppTransitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMmAppTransitionResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMmAppTransitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmAppTransitionResponseBodyData self = new UpdateMmAppTransitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMmAppTransitionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
