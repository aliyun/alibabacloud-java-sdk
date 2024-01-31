// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDatabaseBetweenInstancesResponseBody body;

    public static ImportDatabaseBetweenInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesResponse self = new ImportDatabaseBetweenInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseBetweenInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDatabaseBetweenInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDatabaseBetweenInstancesResponse setBody(ImportDatabaseBetweenInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDatabaseBetweenInstancesResponseBody getBody() {
        return this.body;
    }

}
