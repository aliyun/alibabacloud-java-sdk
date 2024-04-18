// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateParameterResponseBody body;

    public static CreateParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterResponse self = new CreateParameterResponse();
        return TeaModel.build(map, self);
    }

    public CreateParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParameterResponse setBody(CreateParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParameterResponseBody getBody() {
        return this.body;
    }

}
