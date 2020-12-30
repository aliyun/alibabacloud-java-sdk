// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStorageResponseBody body;

    public static CreateStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageResponse self = new CreateStorageResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageResponse setBody(CreateStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageResponseBody getBody() {
        return this.body;
    }

}
