// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateColdStorageInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateColdStorageInstanceResponseBody body;

    public static CreateColdStorageInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateColdStorageInstanceResponse self = new CreateColdStorageInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateColdStorageInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateColdStorageInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateColdStorageInstanceResponse setBody(CreateColdStorageInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateColdStorageInstanceResponseBody getBody() {
        return this.body;
    }

}
