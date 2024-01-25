// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneBaseLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsSceneBaseLineResponseBody body;

    public static GetPtsSceneBaseLineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneBaseLineResponse self = new GetPtsSceneBaseLineResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneBaseLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsSceneBaseLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsSceneBaseLineResponse setBody(GetPtsSceneBaseLineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

}
