// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleasePxfsPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleasePxfsPublicConnectionResponseBody body;

    public static ReleasePxfsPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePxfsPublicConnectionResponse self = new ReleasePxfsPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePxfsPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePxfsPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePxfsPublicConnectionResponse setBody(ReleasePxfsPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePxfsPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
