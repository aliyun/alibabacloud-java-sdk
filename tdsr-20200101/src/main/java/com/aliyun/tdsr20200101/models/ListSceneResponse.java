// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSceneResponseBody body;

    public static ListSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSceneResponse self = new ListSceneResponse();
        return TeaModel.build(map, self);
    }

    public ListSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSceneResponse setBody(ListSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSceneResponseBody getBody() {
        return this.body;
    }

}
