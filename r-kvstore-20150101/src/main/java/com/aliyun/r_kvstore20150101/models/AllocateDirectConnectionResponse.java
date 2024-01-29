// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AllocateDirectConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateDirectConnectionResponseBody body;

    public static AllocateDirectConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateDirectConnectionResponse self = new AllocateDirectConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateDirectConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateDirectConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateDirectConnectionResponse setBody(AllocateDirectConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateDirectConnectionResponseBody getBody() {
        return this.body;
    }

}
