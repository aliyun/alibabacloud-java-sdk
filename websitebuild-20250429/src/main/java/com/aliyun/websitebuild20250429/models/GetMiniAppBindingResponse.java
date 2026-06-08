// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMiniAppBindingResponseBody body;

    public static GetMiniAppBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingResponse self = new GetMiniAppBindingResponse();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiniAppBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMiniAppBindingResponse setBody(GetMiniAppBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiniAppBindingResponseBody getBody() {
        return this.body;
    }

}
