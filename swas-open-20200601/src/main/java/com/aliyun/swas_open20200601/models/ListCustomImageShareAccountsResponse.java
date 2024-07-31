// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImageShareAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomImageShareAccountsResponseBody body;

    public static ListCustomImageShareAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImageShareAccountsResponse self = new ListCustomImageShareAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomImageShareAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomImageShareAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomImageShareAccountsResponse setBody(ListCustomImageShareAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomImageShareAccountsResponseBody getBody() {
        return this.body;
    }

}
