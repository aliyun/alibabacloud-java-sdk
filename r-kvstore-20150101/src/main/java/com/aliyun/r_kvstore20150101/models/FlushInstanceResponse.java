// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FlushInstanceResponseBody body;

    public static FlushInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        FlushInstanceResponse self = new FlushInstanceResponse();
        return TeaModel.build(map, self);
    }

    public FlushInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlushInstanceResponse setBody(FlushInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public FlushInstanceResponseBody getBody() {
        return this.body;
    }

}
