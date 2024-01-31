// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartDiscoverDatabaseTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDiscoverDatabaseTaskResponseBody body;

    public static StartDiscoverDatabaseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDiscoverDatabaseTaskResponse self = new StartDiscoverDatabaseTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartDiscoverDatabaseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDiscoverDatabaseTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDiscoverDatabaseTaskResponse setBody(StartDiscoverDatabaseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiscoverDatabaseTaskResponseBody getBody() {
        return this.body;
    }

}
