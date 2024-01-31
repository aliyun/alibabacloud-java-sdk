// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckInstanceResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyCheckInstanceResultResponseBody body;

    public static VerifyCheckInstanceResultResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckInstanceResultResponse self = new VerifyCheckInstanceResultResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCheckInstanceResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCheckInstanceResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCheckInstanceResultResponse setBody(VerifyCheckInstanceResultResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCheckInstanceResultResponseBody getBody() {
        return this.body;
    }

}
