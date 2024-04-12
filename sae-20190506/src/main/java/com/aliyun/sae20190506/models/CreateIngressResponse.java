// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIngressResponseBody body;

    public static CreateIngressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressResponse self = new CreateIngressResponse();
        return TeaModel.build(map, self);
    }

    public CreateIngressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIngressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIngressResponse setBody(CreateIngressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIngressResponseBody getBody() {
        return this.body;
    }

}
