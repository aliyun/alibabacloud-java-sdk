// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGADInstanceResponseBody body;

    public static CreateGADInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGADInstanceResponse self = new CreateGADInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGADInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGADInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGADInstanceResponse setBody(CreateGADInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGADInstanceResponseBody getBody() {
        return this.body;
    }

}
