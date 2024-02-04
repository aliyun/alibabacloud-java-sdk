// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateStoragePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStoragePlanResponseBody body;

    public static CreateStoragePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStoragePlanResponse self = new CreateStoragePlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateStoragePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStoragePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStoragePlanResponse setBody(CreateStoragePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoragePlanResponseBody getBody() {
        return this.body;
    }

}
