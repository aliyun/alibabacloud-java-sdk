// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListExampleQueriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExampleQueriesResponseBody body;

    public static ListExampleQueriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExampleQueriesResponse self = new ListExampleQueriesResponse();
        return TeaModel.build(map, self);
    }

    public ListExampleQueriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExampleQueriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExampleQueriesResponse setBody(ListExampleQueriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExampleQueriesResponseBody getBody() {
        return this.body;
    }

}
