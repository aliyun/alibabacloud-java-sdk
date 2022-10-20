// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSchemeTaskConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateSchemeTaskConfigResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSchemeTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemeTaskConfigResponseBody self = new UpdateSchemeTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSchemeTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSchemeTaskConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateSchemeTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSchemeTaskConfigResponseBody setMessages(UpdateSchemeTaskConfigResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateSchemeTaskConfigResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateSchemeTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSchemeTaskConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSchemeTaskConfigResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateSchemeTaskConfigResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemeTaskConfigResponseBodyMessages self = new UpdateSchemeTaskConfigResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateSchemeTaskConfigResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
