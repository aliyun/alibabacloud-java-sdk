// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneBaseLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPtsSceneBaseLineResponse setBody(GetPtsSceneBaseLineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

}
