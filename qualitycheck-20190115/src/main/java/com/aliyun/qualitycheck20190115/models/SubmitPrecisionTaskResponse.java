// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitPrecisionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPrecisionTaskResponseBody body;

    public static SubmitPrecisionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPrecisionTaskResponse self = new SubmitPrecisionTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPrecisionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPrecisionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPrecisionTaskResponse setBody(SubmitPrecisionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPrecisionTaskResponseBody getBody() {
        return this.body;
    }

}
