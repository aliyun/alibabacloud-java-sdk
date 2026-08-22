// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseContext0PublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseContext0PublicConnectionResponseBody body;

    public static ReleaseContext0PublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseContext0PublicConnectionResponse self = new ReleaseContext0PublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseContext0PublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseContext0PublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseContext0PublicConnectionResponse setBody(ReleaseContext0PublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseContext0PublicConnectionResponseBody getBody() {
        return this.body;
    }

}
