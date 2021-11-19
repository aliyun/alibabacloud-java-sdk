// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePtsSceneResponseBody body;

    public static CreatePtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePtsSceneResponse self = new CreatePtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreatePtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePtsSceneResponse setBody(CreatePtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePtsSceneResponseBody getBody() {
        return this.body;
    }

}
