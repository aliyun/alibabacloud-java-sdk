// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateCheckTypeToSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateCheckTypeToSchemeResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateCheckTypeToSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckTypeToSchemeResponseBody self = new UpdateCheckTypeToSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCheckTypeToSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCheckTypeToSchemeResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateCheckTypeToSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateCheckTypeToSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCheckTypeToSchemeResponseBody setMessages(UpdateCheckTypeToSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateCheckTypeToSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateCheckTypeToSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCheckTypeToSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCheckTypeToSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateCheckTypeToSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckTypeToSchemeResponseBodyMessages self = new UpdateCheckTypeToSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateCheckTypeToSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
