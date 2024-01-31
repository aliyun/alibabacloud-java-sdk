// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCheckResponseBody body;

    public static SubmitCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCheckResponse self = new SubmitCheckResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCheckResponse setBody(SubmitCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCheckResponseBody getBody() {
        return this.body;
    }

}
