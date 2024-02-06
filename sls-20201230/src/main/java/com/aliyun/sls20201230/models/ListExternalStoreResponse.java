// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListExternalStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalStoreResponseBody body;

    public static ListExternalStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalStoreResponse self = new ListExternalStoreResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalStoreResponse setBody(ListExternalStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalStoreResponseBody getBody() {
        return this.body;
    }

}
