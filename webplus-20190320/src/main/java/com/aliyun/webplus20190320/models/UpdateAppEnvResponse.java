// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppEnvResponseBody body;

    public static UpdateAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppEnvResponse self = new UpdateAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppEnvResponse setBody(UpdateAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppEnvResponseBody getBody() {
        return this.body;
    }

}
