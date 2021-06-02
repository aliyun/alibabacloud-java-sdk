// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ScenePublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScenePublishResponseBody body;

    public static ScenePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        ScenePublishResponse self = new ScenePublishResponse();
        return TeaModel.build(map, self);
    }

    public ScenePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScenePublishResponse setBody(ScenePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public ScenePublishResponseBody getBody() {
        return this.body;
    }

}
