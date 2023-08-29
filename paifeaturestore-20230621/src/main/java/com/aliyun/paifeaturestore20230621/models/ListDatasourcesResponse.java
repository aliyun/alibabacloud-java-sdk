// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasourcesResponseBody body;

    public static ListDatasourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourcesResponse self = new ListDatasourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasourcesResponse setBody(ListDatasourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasourcesResponseBody getBody() {
        return this.body;
    }

}
