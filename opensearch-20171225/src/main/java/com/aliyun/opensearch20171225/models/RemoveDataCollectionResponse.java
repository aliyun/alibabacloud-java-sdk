// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveDataCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDataCollectionResponseBody body;

    public static RemoveDataCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataCollectionResponse self = new RemoveDataCollectionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataCollectionResponse setBody(RemoveDataCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataCollectionResponseBody getBody() {
        return this.body;
    }

}
