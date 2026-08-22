// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateContext0PublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateContext0PublicConnectionResponseBody body;

    public static AllocateContext0PublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateContext0PublicConnectionResponse self = new AllocateContext0PublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateContext0PublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateContext0PublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateContext0PublicConnectionResponse setBody(AllocateContext0PublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateContext0PublicConnectionResponseBody getBody() {
        return this.body;
    }

}
