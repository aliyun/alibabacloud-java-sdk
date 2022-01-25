// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class EnableJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableJobResponseBody body;

    public static EnableJobResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableJobResponse self = new EnableJobResponse();
        return TeaModel.build(map, self);
    }

    public EnableJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableJobResponse setBody(EnableJobResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableJobResponseBody getBody() {
        return this.body;
    }

}
