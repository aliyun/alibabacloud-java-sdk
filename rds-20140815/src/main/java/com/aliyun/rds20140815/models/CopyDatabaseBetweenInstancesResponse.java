// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyDatabaseBetweenInstancesResponseBody body;

    public static CopyDatabaseBetweenInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesResponse self = new CopyDatabaseBetweenInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseBetweenInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyDatabaseBetweenInstancesResponse setBody(CopyDatabaseBetweenInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyDatabaseBetweenInstancesResponseBody getBody() {
        return this.body;
    }

}
