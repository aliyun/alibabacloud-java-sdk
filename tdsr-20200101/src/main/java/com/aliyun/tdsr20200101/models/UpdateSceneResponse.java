// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneResponseBody body;

    public static UpdateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneResponse self = new UpdateSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneResponse setBody(UpdateSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneResponseBody getBody() {
        return this.body;
    }

}
