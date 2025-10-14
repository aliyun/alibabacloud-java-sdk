// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStoragePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStoragePoolResponseBody body;

    public static CreateStoragePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStoragePoolResponse self = new CreateStoragePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateStoragePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStoragePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStoragePoolResponse setBody(CreateStoragePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoragePoolResponseBody getBody() {
        return this.body;
    }

}
