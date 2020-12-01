// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIngressResponseBody body;

    public static UpdateIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressResponse self = new UpdateIngressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIngressResponse setBody(UpdateIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIngressResponseBody getBody() {
        return this.body;
    }

}
