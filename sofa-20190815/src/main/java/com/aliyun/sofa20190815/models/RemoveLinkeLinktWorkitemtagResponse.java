// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktWorkitemtagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeLinktWorkitemtagResponseBody body;

    public static RemoveLinkeLinktWorkitemtagResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktWorkitemtagResponse self = new RemoveLinkeLinktWorkitemtagResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktWorkitemtagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeLinktWorkitemtagResponse setBody(RemoveLinkeLinktWorkitemtagResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeLinktWorkitemtagResponseBody getBody() {
        return this.body;
    }

}
