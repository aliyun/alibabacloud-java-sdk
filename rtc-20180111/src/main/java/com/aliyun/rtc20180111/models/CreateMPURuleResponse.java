// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPURuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMPURuleResponseBody body;

    public static CreateMPURuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMPURuleResponse self = new CreateMPURuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateMPURuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMPURuleResponse setBody(CreateMPURuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMPURuleResponseBody getBody() {
        return this.body;
    }

}
