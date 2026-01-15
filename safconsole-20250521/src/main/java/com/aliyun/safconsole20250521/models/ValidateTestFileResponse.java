// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateTestFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateTestFileResponseBody body;

    public static ValidateTestFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTestFileResponse self = new ValidateTestFileResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTestFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTestFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateTestFileResponse setBody(ValidateTestFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTestFileResponseBody getBody() {
        return this.body;
    }

}
