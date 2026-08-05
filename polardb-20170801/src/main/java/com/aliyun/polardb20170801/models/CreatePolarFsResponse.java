// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarFsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolarFsResponseBody body;

    public static CreatePolarFsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarFsResponse self = new CreatePolarFsResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarFsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarFsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolarFsResponse setBody(CreatePolarFsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarFsResponseBody getBody() {
        return this.body;
    }

}
