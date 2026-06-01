// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopRayHistoryServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRayHistoryServerResponseBody body;

    public static StopRayHistoryServerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRayHistoryServerResponse self = new StopRayHistoryServerResponse();
        return TeaModel.build(map, self);
    }

    public StopRayHistoryServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRayHistoryServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRayHistoryServerResponse setBody(StopRayHistoryServerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRayHistoryServerResponseBody getBody() {
        return this.body;
    }

}
