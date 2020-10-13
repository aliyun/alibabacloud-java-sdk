// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropDatabaseResponseBody body;

    public static DropDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DropDatabaseResponse self = new DropDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DropDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropDatabaseResponse setBody(DropDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DropDatabaseResponseBody getBody() {
        return this.body;
    }

}
