// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class GatherAppEnvLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GatherAppEnvLogResponseBody body;

    public static GatherAppEnvLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GatherAppEnvLogResponse self = new GatherAppEnvLogResponse();
        return TeaModel.build(map, self);
    }

    public GatherAppEnvLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GatherAppEnvLogResponse setBody(GatherAppEnvLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GatherAppEnvLogResponseBody getBody() {
        return this.body;
    }

}
