// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopMsRcSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopMsRcSyncTaskResponseBody body;

    public static StopMsRcSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMsRcSyncTaskResponse self = new StopMsRcSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopMsRcSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMsRcSyncTaskResponse setBody(StopMsRcSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMsRcSyncTaskResponseBody getBody() {
        return this.body;
    }

}
