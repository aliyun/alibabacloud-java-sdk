// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetailProjectResponseBody body;

    public static DetailProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailProjectResponse self = new DetailProjectResponse();
        return TeaModel.build(map, self);
    }

    public DetailProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailProjectResponse setBody(DetailProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailProjectResponseBody getBody() {
        return this.body;
    }

}
