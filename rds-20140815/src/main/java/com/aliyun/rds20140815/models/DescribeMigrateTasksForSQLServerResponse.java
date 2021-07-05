// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksForSQLServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrateTasksForSQLServerResponseBody body;

    public static DescribeMigrateTasksForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksForSQLServerResponse self = new DescribeMigrateTasksForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTasksForSQLServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrateTasksForSQLServerResponse setBody(DescribeMigrateTasksForSQLServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrateTasksForSQLServerResponseBody getBody() {
        return this.body;
    }

}
