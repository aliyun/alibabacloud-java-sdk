// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSeoStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSeoStatusResponseBody body;

    public static GetAppSeoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSeoStatusResponse self = new GetAppSeoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSeoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSeoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSeoStatusResponse setBody(GetAppSeoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSeoStatusResponseBody getBody() {
        return this.body;
    }

}
