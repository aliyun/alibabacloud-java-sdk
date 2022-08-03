// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountsResponseBody body;

    public static ListAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponse self = new ListAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountsResponse setBody(ListAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountsResponseBody getBody() {
        return this.body;
    }

}
