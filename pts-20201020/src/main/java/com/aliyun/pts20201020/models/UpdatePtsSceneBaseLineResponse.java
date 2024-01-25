// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class UpdatePtsSceneBaseLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePtsSceneBaseLineResponseBody body;

    public static UpdatePtsSceneBaseLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePtsSceneBaseLineResponse self = new UpdatePtsSceneBaseLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePtsSceneBaseLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePtsSceneBaseLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePtsSceneBaseLineResponse setBody(UpdatePtsSceneBaseLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

}
