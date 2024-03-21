// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class PutMeasureReadyFlagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutMeasureReadyFlagResponseBody body;

    public static PutMeasureReadyFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureReadyFlagResponse self = new PutMeasureReadyFlagResponse();
        return TeaModel.build(map, self);
    }

    public PutMeasureReadyFlagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMeasureReadyFlagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutMeasureReadyFlagResponse setBody(PutMeasureReadyFlagResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMeasureReadyFlagResponseBody getBody() {
        return this.body;
    }

}
