// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteABTestSceneResponseBody body;

    public static DeleteABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestSceneResponse self = new DeleteABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABTestSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteABTestSceneResponse setBody(DeleteABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestSceneResponseBody getBody() {
        return this.body;
    }

}
