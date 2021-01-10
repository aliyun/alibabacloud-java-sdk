// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataCollectionsResponseBody body;

    public static ListDataCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCollectionsResponse self = new ListDataCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCollectionsResponse setBody(ListDataCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCollectionsResponseBody getBody() {
        return this.body;
    }

}
