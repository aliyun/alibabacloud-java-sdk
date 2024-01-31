// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTaskByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMigrateTaskByIdResponseBody body;

    public static DescribeMigrateTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTaskByIdResponse self = new DescribeMigrateTaskByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTaskByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrateTaskByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrateTaskByIdResponse setBody(DescribeMigrateTaskByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrateTaskByIdResponseBody getBody() {
        return this.body;
    }

}
