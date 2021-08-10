// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class FinishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishResponseBody body;

    public static FinishResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishResponse self = new FinishResponse();
        return TeaModel.build(map, self);
    }

    public FinishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishResponse setBody(FinishResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishResponseBody getBody() {
        return this.body;
    }

}
