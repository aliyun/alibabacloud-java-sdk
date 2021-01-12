// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TerminateMigrateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public TerminateMigrateTaskResponse setBody(TerminateMigrateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateMigrateTaskResponseBody getBody() {
        return this.body;
    }

}
