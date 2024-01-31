// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateHcWarningsResponseBody body;

    public static ValidateHcWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateHcWarningsResponse self = new ValidateHcWarningsResponse();
        return TeaModel.build(map, self);
    }

    public ValidateHcWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateHcWarningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateHcWarningsResponse setBody(ValidateHcWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateHcWarningsResponseBody getBody() {
        return this.body;
    }

}
