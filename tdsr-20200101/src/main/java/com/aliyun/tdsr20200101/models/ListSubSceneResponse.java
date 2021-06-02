// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubSceneResponseBody body;

    public static ListSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneResponse self = new ListSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public ListSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubSceneResponse setBody(ListSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubSceneResponseBody getBody() {
        return this.body;
    }

}
