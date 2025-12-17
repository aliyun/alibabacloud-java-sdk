// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateSanityCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSanityCheckTaskResponseBody body;

    public static CreateSanityCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSanityCheckTaskResponse self = new CreateSanityCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSanityCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSanityCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSanityCheckTaskResponse setBody(CreateSanityCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSanityCheckTaskResponseBody getBody() {
        return this.body;
    }

}
