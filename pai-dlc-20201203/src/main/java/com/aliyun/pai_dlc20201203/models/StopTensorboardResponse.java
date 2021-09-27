// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTensorboardResponseBody body;

    public static StopTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTensorboardResponse self = new StopTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public StopTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTensorboardResponse setBody(StopTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTensorboardResponseBody getBody() {
        return this.body;
    }

}
