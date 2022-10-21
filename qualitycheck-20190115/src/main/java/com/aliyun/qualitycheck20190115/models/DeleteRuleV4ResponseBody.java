// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteRuleV4ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public DeleteRuleV4ResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteRuleV4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleV4ResponseBody self = new DeleteRuleV4ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRuleV4ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRuleV4ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteRuleV4ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRuleV4ResponseBody setMessages(DeleteRuleV4ResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public DeleteRuleV4ResponseBodyMessages getMessages() {
        return this.messages;
    }

    public DeleteRuleV4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRuleV4ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRuleV4ResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static DeleteRuleV4ResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            DeleteRuleV4ResponseBodyMessages self = new DeleteRuleV4ResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public DeleteRuleV4ResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
