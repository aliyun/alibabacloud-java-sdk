// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMigrationOperationsResponseBody body;

    public static ListMigrationOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationOperationsResponse self = new ListMigrationOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationOperationsResponse setBody(ListMigrationOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationOperationsResponseBody getBody() {
        return this.body;
    }

}
