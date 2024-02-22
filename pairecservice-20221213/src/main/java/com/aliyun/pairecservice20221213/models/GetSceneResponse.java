// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSceneResponseBody body;

    public static GetSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneResponse self = new GetSceneResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSceneResponse setBody(GetSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneResponseBody getBody() {
        return this.body;
    }

}
