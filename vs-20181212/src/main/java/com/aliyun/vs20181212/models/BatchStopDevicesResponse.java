// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStopDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopDevicesResponseBody body;

    public static BatchStopDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopDevicesResponse self = new BatchStopDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopDevicesResponse setBody(BatchStopDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopDevicesResponseBody getBody() {
        return this.body;
    }

}
