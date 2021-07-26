// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class RemoveImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveImageResponseBody body;

    public static RemoveImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageResponse self = new RemoveImageResponse();
        return TeaModel.build(map, self);
    }

    public RemoveImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveImageResponse setBody(RemoveImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageResponseBody getBody() {
        return this.body;
    }

}
