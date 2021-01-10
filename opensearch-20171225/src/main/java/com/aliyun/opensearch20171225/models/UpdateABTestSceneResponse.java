// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateABTestSceneResponseBody body;

    public static UpdateABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestSceneResponse self = new UpdateABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABTestSceneResponse setBody(UpdateABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABTestSceneResponseBody getBody() {
        return this.body;
    }

}
