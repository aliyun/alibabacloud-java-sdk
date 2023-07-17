// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class WriteUsscResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WriteUsscResponseBody body;

    public static WriteUsscResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteUsscResponse self = new WriteUsscResponse();
        return TeaModel.build(map, self);
    }

    public WriteUsscResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteUsscResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteUsscResponse setBody(WriteUsscResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteUsscResponseBody getBody() {
        return this.body;
    }

}
