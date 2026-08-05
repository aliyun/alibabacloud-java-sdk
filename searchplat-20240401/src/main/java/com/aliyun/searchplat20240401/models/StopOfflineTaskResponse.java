// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StopOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopOfflineTaskResponseBody body;

    public static StopOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOfflineTaskResponse self = new StopOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopOfflineTaskResponse setBody(StopOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
