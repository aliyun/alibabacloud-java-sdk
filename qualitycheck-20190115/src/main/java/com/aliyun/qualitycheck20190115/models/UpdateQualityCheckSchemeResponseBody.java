// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateQualityCheckSchemeResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckSchemeResponseBody self = new UpdateQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateQualityCheckSchemeResponseBody setMessages(UpdateQualityCheckSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateQualityCheckSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateQualityCheckSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateQualityCheckSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateQualityCheckSchemeResponseBodyMessages self = new UpdateQualityCheckSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateQualityCheckSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
