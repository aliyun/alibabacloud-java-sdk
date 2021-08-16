// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartPreCheckDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartPreCheckDatabaseResponseBody body;

    public static StartPreCheckDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPreCheckDatabaseResponse self = new StartPreCheckDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public StartPreCheckDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPreCheckDatabaseResponse setBody(StartPreCheckDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPreCheckDatabaseResponseBody getBody() {
        return this.body;
    }

}
