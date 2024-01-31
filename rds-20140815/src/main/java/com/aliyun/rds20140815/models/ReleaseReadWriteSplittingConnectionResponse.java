// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseReadWriteSplittingConnectionResponseBody body;

    public static ReleaseReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseReadWriteSplittingConnectionResponse self = new ReleaseReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseReadWriteSplittingConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseReadWriteSplittingConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseReadWriteSplittingConnectionResponse setBody(ReleaseReadWriteSplittingConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

}
