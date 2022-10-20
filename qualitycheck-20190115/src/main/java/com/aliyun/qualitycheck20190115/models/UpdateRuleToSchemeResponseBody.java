// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleToSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateRuleToSchemeResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRuleToSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleToSchemeResponseBody self = new UpdateRuleToSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleToSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRuleToSchemeResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateRuleToSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateRuleToSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRuleToSchemeResponseBody setMessages(UpdateRuleToSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateRuleToSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateRuleToSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleToSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRuleToSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateRuleToSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleToSchemeResponseBodyMessages self = new UpdateRuleToSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateRuleToSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
