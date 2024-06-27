// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFieldResponseBody body;

    public static CreateFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFieldResponse self = new CreateFieldResponse();
        return TeaModel.build(map, self);
    }

    public CreateFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFieldResponse setBody(CreateFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFieldResponseBody getBody() {
        return this.body;
    }

}
