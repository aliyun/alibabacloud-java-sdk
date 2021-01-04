// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerExecutionResponseBody body;

    public static TriggerExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerExecutionResponse self = new TriggerExecutionResponse();
        return TeaModel.build(map, self);
    }

    public TriggerExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerExecutionResponse setBody(TriggerExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerExecutionResponseBody getBody() {
        return this.body;
    }

}
