// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropProjectResponseBody body;

    public static DropProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DropProjectResponse self = new DropProjectResponse();
        return TeaModel.build(map, self);
    }

    public DropProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropProjectResponse setBody(DropProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DropProjectResponseBody getBody() {
        return this.body;
    }

}
