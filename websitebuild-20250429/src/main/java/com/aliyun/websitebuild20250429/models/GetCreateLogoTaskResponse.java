// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetCreateLogoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCreateLogoTaskResponseBody body;

    public static GetCreateLogoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateLogoTaskResponse self = new GetCreateLogoTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateLogoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateLogoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateLogoTaskResponse setBody(GetCreateLogoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateLogoTaskResponseBody getBody() {
        return this.body;
    }

}
