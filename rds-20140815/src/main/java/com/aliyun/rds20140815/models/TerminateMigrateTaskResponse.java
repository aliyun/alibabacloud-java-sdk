// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TerminateMigrateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateMigrateTaskResponseBody body;

    public static TerminateMigrateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateMigrateTaskResponse self = new TerminateMigrateTaskResponse();
        return TeaModel.build(map, self);
    }

    public TerminateMigrateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateMigrateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateMigrateTaskResponse setBody(TerminateMigrateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateMigrateTaskResponseBody getBody() {
        return this.body;
    }

}
