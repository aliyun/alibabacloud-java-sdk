// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseInstanceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseInstanceConnectionResponseBody body;

    public static ReleaseInstanceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceConnectionResponse self = new ReleaseInstanceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstanceConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseInstanceConnectionResponse setBody(ReleaseInstanceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstanceConnectionResponseBody getBody() {
        return this.body;
    }

}
