// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTairInstanceResponseBody body;

    public static CreateTairInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTairInstanceResponse self = new CreateTairInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTairInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTairInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTairInstanceResponse setBody(CreateTairInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTairInstanceResponseBody getBody() {
        return this.body;
    }

}
