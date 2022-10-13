// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetProductConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductConfigResponseBody body;

    public static GetProductConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductConfigResponse self = new GetProductConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetProductConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductConfigResponse setBody(GetProductConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductConfigResponseBody getBody() {
        return this.body;
    }

}
