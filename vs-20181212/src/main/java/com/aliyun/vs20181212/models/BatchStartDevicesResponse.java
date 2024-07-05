// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStartDevicesResponseBody body;

    public static BatchStartDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartDevicesResponse self = new BatchStartDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStartDevicesResponse setBody(BatchStartDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartDevicesResponseBody getBody() {
        return this.body;
    }

}
