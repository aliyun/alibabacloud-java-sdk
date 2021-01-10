// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartMsRcSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartMsRcSyncTaskResponseBody body;

    public static StartMsRcSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMsRcSyncTaskResponse self = new StartMsRcSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartMsRcSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMsRcSyncTaskResponse setBody(StartMsRcSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMsRcSyncTaskResponseBody getBody() {
        return this.body;
    }

}
