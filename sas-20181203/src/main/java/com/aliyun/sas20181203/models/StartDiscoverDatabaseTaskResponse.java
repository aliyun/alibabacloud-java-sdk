// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartDiscoverDatabaseTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartDiscoverDatabaseTaskResponse setBody(StartDiscoverDatabaseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDiscoverDatabaseTaskResponseBody getBody() {
        return this.body;
    }

}
