// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceShutdownTimerResponseBody body;

    public static CreateInstanceShutdownTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerResponse self = new CreateInstanceShutdownTimerResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceShutdownTimerResponse setBody(CreateInstanceShutdownTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

}
