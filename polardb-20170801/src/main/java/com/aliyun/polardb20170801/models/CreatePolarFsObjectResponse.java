// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarFsObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolarFsObjectResponseBody body;

    public static CreatePolarFsObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarFsObjectResponse self = new CreatePolarFsObjectResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarFsObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarFsObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolarFsObjectResponse setBody(CreatePolarFsObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarFsObjectResponseBody getBody() {
        return this.body;
    }

}
