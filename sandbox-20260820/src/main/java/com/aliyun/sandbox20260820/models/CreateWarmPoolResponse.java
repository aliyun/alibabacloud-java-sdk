// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateWarmPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarmPoolResponseBody body;

    public static CreateWarmPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarmPoolResponse self = new CreateWarmPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarmPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarmPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarmPoolResponse setBody(CreateWarmPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarmPoolResponseBody getBody() {
        return this.body;
    }

}
