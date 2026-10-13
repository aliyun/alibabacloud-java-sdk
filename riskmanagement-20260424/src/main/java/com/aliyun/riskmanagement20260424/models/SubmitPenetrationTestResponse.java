// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitPenetrationTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPenetrationTestResponseBody body;

    public static SubmitPenetrationTestResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPenetrationTestResponse self = new SubmitPenetrationTestResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPenetrationTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPenetrationTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPenetrationTestResponse setBody(SubmitPenetrationTestResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPenetrationTestResponseBody getBody() {
        return this.body;
    }

}
