// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFilterResponseBody body;

    public static CreateFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFilterResponse self = new CreateFilterResponse();
        return TeaModel.build(map, self);
    }

    public CreateFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFilterResponse setBody(CreateFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFilterResponseBody getBody() {
        return this.body;
    }

}
