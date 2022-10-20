// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateRuleByIdResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRuleByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleByIdResponseBody self = new UpdateRuleByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRuleByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateRuleByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRuleByIdResponseBody setMessages(UpdateRuleByIdResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateRuleByIdResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateRuleByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRuleByIdResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateRuleByIdResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleByIdResponseBodyMessages self = new UpdateRuleByIdResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateRuleByIdResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
