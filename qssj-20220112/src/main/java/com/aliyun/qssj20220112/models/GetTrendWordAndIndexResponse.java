// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendWordAndIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrendWordAndIndexResponseBody body;

    public static GetTrendWordAndIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendWordAndIndexResponse self = new GetTrendWordAndIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendWordAndIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendWordAndIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendWordAndIndexResponse setBody(GetTrendWordAndIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendWordAndIndexResponseBody getBody() {
        return this.body;
    }

}
