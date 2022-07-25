// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckUserPropertyResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Match")
    public Boolean match;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckUserPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserPropertyResponseBody self = new CheckUserPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserPropertyResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CheckUserPropertyResponseBody setMatch(Boolean match) {
        this.match = match;
        return this;
    }
    public Boolean getMatch() {
        return this.match;
    }

    public CheckUserPropertyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUserPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
