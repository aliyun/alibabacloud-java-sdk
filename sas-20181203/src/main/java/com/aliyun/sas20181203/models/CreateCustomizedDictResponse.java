// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomizedDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomizedDictResponseBody body;

    public static CreateCustomizedDictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedDictResponse self = new CreateCustomizedDictResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomizedDictResponse setBody(CreateCustomizedDictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedDictResponseBody getBody() {
        return this.body;
    }

}
