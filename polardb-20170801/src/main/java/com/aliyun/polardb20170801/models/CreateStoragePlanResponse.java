// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateStoragePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateStoragePlanResponse setBody(CreateStoragePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoragePlanResponseBody getBody() {
        return this.body;
    }

}
