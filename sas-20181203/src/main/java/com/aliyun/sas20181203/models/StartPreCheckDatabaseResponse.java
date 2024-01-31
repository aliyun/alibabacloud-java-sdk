// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartPreCheckDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartPreCheckDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPreCheckDatabaseResponse setBody(StartPreCheckDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPreCheckDatabaseResponseBody getBody() {
        return this.body;
    }

}
