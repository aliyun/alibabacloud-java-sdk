// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateIngressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIngressResponse setBody(UpdateIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIngressResponseBody getBody() {
        return this.body;
    }

}
