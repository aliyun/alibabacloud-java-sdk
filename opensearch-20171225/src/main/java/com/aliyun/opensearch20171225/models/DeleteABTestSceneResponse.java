// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteABTestSceneResponse setBody(DeleteABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestSceneResponseBody getBody() {
        return this.body;
    }

}
