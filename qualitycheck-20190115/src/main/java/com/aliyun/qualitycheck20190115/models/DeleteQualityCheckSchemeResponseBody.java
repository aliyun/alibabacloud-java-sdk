// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public DeleteQualityCheckSchemeResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityCheckSchemeResponseBody self = new DeleteQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteQualityCheckSchemeResponseBody setMessages(DeleteQualityCheckSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public DeleteQualityCheckSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public DeleteQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteQualityCheckSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static DeleteQualityCheckSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualityCheckSchemeResponseBodyMessages self = new DeleteQualityCheckSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public DeleteQualityCheckSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
