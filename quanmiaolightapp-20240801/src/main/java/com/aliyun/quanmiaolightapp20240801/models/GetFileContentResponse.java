// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetFileContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileContentResponseBody body;

    public static GetFileContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentResponse self = new GetFileContentResponse();
        return TeaModel.build(map, self);
    }

    public GetFileContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileContentResponse setBody(GetFileContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileContentResponseBody getBody() {
        return this.body;
    }

}
