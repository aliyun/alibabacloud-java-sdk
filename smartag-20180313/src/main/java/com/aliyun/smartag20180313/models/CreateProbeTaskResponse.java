// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateProbeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProbeTaskResponseBody body;

    public static CreateProbeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProbeTaskResponse self = new CreateProbeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateProbeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProbeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProbeTaskResponse setBody(CreateProbeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProbeTaskResponseBody getBody() {
        return this.body;
    }

}
