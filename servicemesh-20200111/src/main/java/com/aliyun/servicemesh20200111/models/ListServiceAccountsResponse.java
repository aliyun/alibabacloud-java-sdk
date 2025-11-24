// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListServiceAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceAccountsResponseBody body;

    public static ListServiceAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceAccountsResponse self = new ListServiceAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceAccountsResponse setBody(ListServiceAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceAccountsResponseBody getBody() {
        return this.body;
    }

}
