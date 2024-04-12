// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIngressResponseBody body;

    public static DeleteIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressResponse self = new DeleteIngressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIngressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIngressResponse setBody(DeleteIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIngressResponseBody getBody() {
        return this.body;
    }

}
