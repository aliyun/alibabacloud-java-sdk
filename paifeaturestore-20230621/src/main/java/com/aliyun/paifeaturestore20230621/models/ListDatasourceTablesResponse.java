// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasourceTablesResponseBody body;

    public static ListDatasourceTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceTablesResponse self = new ListDatasourceTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasourceTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasourceTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasourceTablesResponse setBody(ListDatasourceTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasourceTablesResponseBody getBody() {
        return this.body;
    }

}
