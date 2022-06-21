// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrendIndexResponseBody body;

    public static GetTrendIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendIndexResponse self = new GetTrendIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendIndexResponse setBody(GetTrendIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendIndexResponseBody getBody() {
        return this.body;
    }

}
