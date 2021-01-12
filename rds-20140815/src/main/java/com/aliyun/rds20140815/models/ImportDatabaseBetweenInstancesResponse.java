// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ImportDatabaseBetweenInstancesResponse setBody(ImportDatabaseBetweenInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDatabaseBetweenInstancesResponseBody getBody() {
        return this.body;
    }

}
