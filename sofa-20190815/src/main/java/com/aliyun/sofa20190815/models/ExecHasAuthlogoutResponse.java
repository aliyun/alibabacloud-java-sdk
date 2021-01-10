// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasAuthlogoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasAuthlogoutResponseBody body;

    public static ExecHasAuthlogoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasAuthlogoutResponse self = new ExecHasAuthlogoutResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasAuthlogoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasAuthlogoutResponse setBody(ExecHasAuthlogoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasAuthlogoutResponseBody getBody() {
        return this.body;
    }

}
