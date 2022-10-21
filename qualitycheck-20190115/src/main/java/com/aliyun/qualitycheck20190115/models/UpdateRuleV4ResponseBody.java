// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleV4ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateRuleV4ResponseBodyMessages messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRuleV4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleV4ResponseBody self = new UpdateRuleV4ResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleV4ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRuleV4ResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateRuleV4ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateRuleV4ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRuleV4ResponseBody setMessages(UpdateRuleV4ResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateRuleV4ResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateRuleV4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleV4ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRuleV4ResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateRuleV4ResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateRuleV4ResponseBodyMessages self = new UpdateRuleV4ResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateRuleV4ResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
