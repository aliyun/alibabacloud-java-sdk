// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DisableSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSceneResponseBody body;

    public static DisableSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneResponse self = new DisableSceneResponse();
        return TeaModel.build(map, self);
    }

    public DisableSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSceneResponse setBody(DisableSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSceneResponseBody getBody() {
        return this.body;
    }

}
