// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RollbackSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackSubSceneResponseBody body;

    public static RollbackSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackSubSceneResponse self = new RollbackSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public RollbackSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackSubSceneResponse setBody(RollbackSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackSubSceneResponseBody getBody() {
        return this.body;
    }

}
