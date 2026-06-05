// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateHiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHiveResponseBody body;

    public static CreateHiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHiveResponse self = new CreateHiveResponse();
        return TeaModel.build(map, self);
    }

    public CreateHiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHiveResponse setBody(CreateHiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHiveResponseBody getBody() {
        return this.body;
    }

}
