// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLabelsetResponseBody body;

    public static GetLabelsetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelsetResponse self = new GetLabelsetResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelsetResponse setBody(GetLabelsetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelsetResponseBody getBody() {
        return this.body;
    }

}
