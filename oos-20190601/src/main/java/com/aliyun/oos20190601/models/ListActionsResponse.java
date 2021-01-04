// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListActionsResponseBody body;

    public static ListActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionsResponse self = new ListActionsResponse();
        return TeaModel.build(map, self);
    }

    public ListActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionsResponse setBody(ListActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionsResponseBody getBody() {
        return this.body;
    }

}
