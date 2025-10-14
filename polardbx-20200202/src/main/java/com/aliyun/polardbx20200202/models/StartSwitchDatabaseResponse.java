// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class StartSwitchDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSwitchDatabaseResponseBody body;

    public static StartSwitchDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSwitchDatabaseResponse self = new StartSwitchDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public StartSwitchDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSwitchDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSwitchDatabaseResponse setBody(StartSwitchDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSwitchDatabaseResponseBody getBody() {
        return this.body;
    }

}
