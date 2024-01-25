// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePtsSceneResponseBody body;

    public static DeletePtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsSceneResponse self = new DeletePtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeletePtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePtsSceneResponse setBody(DeletePtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePtsSceneResponseBody getBody() {
        return this.body;
    }

}
