// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateABTestSceneResponseBody body;

    public static CreateABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneResponse self = new CreateABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABTestSceneResponse setBody(CreateABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABTestSceneResponseBody getBody() {
        return this.body;
    }

}
