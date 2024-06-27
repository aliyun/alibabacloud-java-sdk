// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateCustVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustVariableResponseBody body;

    public static CreateCustVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustVariableResponse self = new CreateCustVariableResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustVariableResponse setBody(CreateCustVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustVariableResponseBody getBody() {
        return this.body;
    }

}
