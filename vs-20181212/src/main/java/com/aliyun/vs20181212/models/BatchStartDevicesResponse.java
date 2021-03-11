// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchStartDevicesResponse setBody(BatchStartDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartDevicesResponseBody getBody() {
        return this.body;
    }

}
