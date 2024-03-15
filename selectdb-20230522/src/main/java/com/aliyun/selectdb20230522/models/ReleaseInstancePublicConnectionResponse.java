// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseInstancePublicConnectionResponseBody body;

    public static ReleaseInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionResponse self = new ReleaseInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstancePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseInstancePublicConnectionResponse setBody(ReleaseInstancePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
