// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StartOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartOfflineTaskResponseBody body;

    public static StartOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartOfflineTaskResponse self = new StartOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartOfflineTaskResponse setBody(StartOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
