// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindEsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindEsInstanceResponseBody body;

    public static BindEsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEsInstanceResponse self = new BindEsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindEsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEsInstanceResponse setBody(BindEsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEsInstanceResponseBody getBody() {
        return this.body;
    }

}
