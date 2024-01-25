// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsSceneResponseBody body;

    public static GetPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneResponse self = new GetPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsSceneResponse setBody(GetPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsSceneResponseBody getBody() {
        return this.body;
    }

}
