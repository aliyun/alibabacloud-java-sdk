// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class JoinThirdCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static JoinThirdCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinThirdCallResponseBody self = new JoinThirdCallResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinThirdCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public JoinThirdCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JoinThirdCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinThirdCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
