// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchDeleteDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDevicesResponseBody body;

    public static BatchDeleteDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDevicesResponse self = new BatchDeleteDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDevicesResponse setBody(BatchDeleteDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDevicesResponseBody getBody() {
        return this.body;
    }

}
