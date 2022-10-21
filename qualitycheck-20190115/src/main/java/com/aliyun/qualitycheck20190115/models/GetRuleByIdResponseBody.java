// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RulesInfo data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public java.util.List<String> messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRuleByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleByIdResponseBody self = new GetRuleByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleByIdResponseBody setData(RulesInfo data) {
        this.data = data;
        return this;
    }
    public RulesInfo getData() {
        return this.data;
    }

    public GetRuleByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRuleByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleByIdResponseBody setMessages(java.util.List<String> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<String> getMessages() {
        return this.messages;
    }

    public GetRuleByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
