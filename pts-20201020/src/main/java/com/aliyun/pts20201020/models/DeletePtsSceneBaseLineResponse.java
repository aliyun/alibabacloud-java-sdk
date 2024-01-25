// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsSceneBaseLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePtsSceneBaseLineResponseBody body;

    public static DeletePtsSceneBaseLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsSceneBaseLineResponse self = new DeletePtsSceneBaseLineResponse();
        return TeaModel.build(map, self);
    }

    public DeletePtsSceneBaseLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePtsSceneBaseLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePtsSceneBaseLineResponse setBody(DeletePtsSceneBaseLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

}
