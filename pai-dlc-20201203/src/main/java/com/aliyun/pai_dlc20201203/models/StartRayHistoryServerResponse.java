// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartRayHistoryServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRayHistoryServerResponseBody body;

    public static StartRayHistoryServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRayHistoryServerResponse self = new StartRayHistoryServerResponse();
        return TeaModel.build(map, self);
    }

    public StartRayHistoryServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRayHistoryServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRayHistoryServerResponse setBody(StartRayHistoryServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRayHistoryServerResponseBody getBody() {
        return this.body;
    }

}
