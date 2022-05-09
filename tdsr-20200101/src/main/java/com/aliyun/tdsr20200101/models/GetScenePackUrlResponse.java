// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePackUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetScenePackUrlResponseBody body;

    public static GetScenePackUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenePackUrlResponse self = new GetScenePackUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetScenePackUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenePackUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenePackUrlResponse setBody(GetScenePackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenePackUrlResponseBody getBody() {
        return this.body;
    }

}
