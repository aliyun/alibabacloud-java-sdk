// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMigrateTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrateTasksResponse setBody(DescribeMigrateTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrateTasksResponseBody getBody() {
        return this.body;
    }

}
