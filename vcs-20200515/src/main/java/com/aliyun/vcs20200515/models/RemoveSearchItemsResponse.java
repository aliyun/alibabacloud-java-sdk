// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveSearchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSearchItemsResponseBody body;

    public static RemoveSearchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSearchItemsResponse self = new RemoveSearchItemsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSearchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSearchItemsResponse setBody(RemoveSearchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSearchItemsResponseBody getBody() {
        return this.body;
    }

}
