// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddWatchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddWatchItemsResponseBody body;

    public static AddWatchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatchItemsResponse self = new AddWatchItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddWatchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWatchItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWatchItemsResponse setBody(AddWatchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWatchItemsResponseBody getBody() {
        return this.body;
    }

}
