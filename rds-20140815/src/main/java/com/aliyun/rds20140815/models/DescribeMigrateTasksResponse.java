// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrateTasksResponseBody body;

    public static DescribeMigrateTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksResponse self = new DescribeMigrateTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrateTasksResponse setBody(DescribeMigrateTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrateTasksResponseBody getBody() {
        return this.body;
    }

}
