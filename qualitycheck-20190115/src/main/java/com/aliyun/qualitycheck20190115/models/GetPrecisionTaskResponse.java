// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetPrecisionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrecisionTaskResponseBody body;

    public static GetPrecisionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrecisionTaskResponse self = new GetPrecisionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetPrecisionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrecisionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrecisionTaskResponse setBody(GetPrecisionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrecisionTaskResponseBody getBody() {
        return this.body;
    }

}
