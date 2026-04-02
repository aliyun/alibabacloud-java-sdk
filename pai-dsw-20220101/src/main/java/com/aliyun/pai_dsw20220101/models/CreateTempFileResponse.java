// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateTempFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTempFileResponseBody body;

    public static CreateTempFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileResponse self = new CreateTempFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateTempFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTempFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTempFileResponse setBody(CreateTempFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTempFileResponseBody getBody() {
        return this.body;
    }

}
