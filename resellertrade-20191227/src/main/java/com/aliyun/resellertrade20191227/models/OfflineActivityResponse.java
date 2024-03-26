// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class OfflineActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineActivityResponseBody body;

    public static OfflineActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineActivityResponse self = new OfflineActivityResponse();
        return TeaModel.build(map, self);
    }

    public OfflineActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineActivityResponse setBody(OfflineActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineActivityResponseBody getBody() {
        return this.body;
    }

}
