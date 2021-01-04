// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyExecutionResponseBody body;

    public static NotifyExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionResponse self = new NotifyExecutionResponse();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyExecutionResponse setBody(NotifyExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyExecutionResponseBody getBody() {
        return this.body;
    }

}
