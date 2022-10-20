// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public CreateQualityCheckSchemeResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckSchemeResponseBody self = new CreateQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateQualityCheckSchemeResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateQualityCheckSchemeResponseBody setMessages(CreateQualityCheckSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public CreateQualityCheckSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public CreateQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateQualityCheckSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static CreateQualityCheckSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateQualityCheckSchemeResponseBodyMessages self = new CreateQualityCheckSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateQualityCheckSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
