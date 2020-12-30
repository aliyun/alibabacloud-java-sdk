// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RebuildAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebuildAppEnvResponseBody body;

    public static RebuildAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppEnvResponse self = new RebuildAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public RebuildAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildAppEnvResponse setBody(RebuildAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildAppEnvResponseBody getBody() {
        return this.body;
    }

}
