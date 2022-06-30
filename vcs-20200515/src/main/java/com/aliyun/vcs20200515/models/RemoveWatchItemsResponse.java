// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveWatchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveWatchItemsResponseBody body;

    public static RemoveWatchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWatchItemsResponse self = new RemoveWatchItemsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWatchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWatchItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveWatchItemsResponse setBody(RemoveWatchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWatchItemsResponseBody getBody() {
        return this.body;
    }

}
