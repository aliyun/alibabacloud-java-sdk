// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopHasInspectTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopHasInspectTaskResponseBody body;

    public static StopHasInspectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopHasInspectTaskResponse self = new StopHasInspectTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopHasInspectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopHasInspectTaskResponse setBody(StopHasInspectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopHasInspectTaskResponseBody getBody() {
        return this.body;
    }

}
