// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceShutdownTimerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceShutdownTimerResponseBody body;

    public static DeleteInstanceShutdownTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceShutdownTimerResponse self = new DeleteInstanceShutdownTimerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceShutdownTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceShutdownTimerResponse setBody(DeleteInstanceShutdownTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

}
