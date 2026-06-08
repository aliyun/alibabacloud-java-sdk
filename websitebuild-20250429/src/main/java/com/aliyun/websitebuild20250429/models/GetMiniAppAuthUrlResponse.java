// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppAuthUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMiniAppAuthUrlResponseBody body;

    public static GetMiniAppAuthUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppAuthUrlResponse self = new GetMiniAppAuthUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMiniAppAuthUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiniAppAuthUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMiniAppAuthUrlResponse setBody(GetMiniAppAuthUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiniAppAuthUrlResponseBody getBody() {
        return this.body;
    }

}
