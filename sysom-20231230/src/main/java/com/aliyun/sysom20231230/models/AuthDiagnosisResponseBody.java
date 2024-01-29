// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class AuthDiagnosisResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Object data;

    @NameInMap("message")
    public String message;

    @NameInMap("request_id")
    public String requestId;

    public static AuthDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthDiagnosisResponseBody self = new AuthDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthDiagnosisResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AuthDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
