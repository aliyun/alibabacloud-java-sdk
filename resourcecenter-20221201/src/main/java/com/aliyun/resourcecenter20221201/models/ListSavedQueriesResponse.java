// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListSavedQueriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSavedQueriesResponseBody body;

    public static ListSavedQueriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueriesResponse self = new ListSavedQueriesResponse();
        return TeaModel.build(map, self);
    }

    public ListSavedQueriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavedQueriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSavedQueriesResponse setBody(ListSavedQueriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSavedQueriesResponseBody getBody() {
        return this.body;
    }

}
