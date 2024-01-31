// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackSuspEventQuaraFileResponseBody body;

    public static RollbackSuspEventQuaraFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileResponse self = new RollbackSuspEventQuaraFileResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackSuspEventQuaraFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackSuspEventQuaraFileResponse setBody(RollbackSuspEventQuaraFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackSuspEventQuaraFileResponseBody getBody() {
        return this.body;
    }

}
