// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateModelFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateModelFileResponseBody body;

    public static ValidateModelFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateModelFileResponse self = new ValidateModelFileResponse();
        return TeaModel.build(map, self);
    }

    public ValidateModelFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateModelFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateModelFileResponse setBody(ValidateModelFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateModelFileResponseBody getBody() {
        return this.body;
    }

}
