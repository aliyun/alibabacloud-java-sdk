// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateWarningConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWarningConfigResponseBody body;

    public static CreateWarningConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningConfigResponse self = new CreateWarningConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarningConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarningConfigResponse setBody(CreateWarningConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarningConfigResponseBody getBody() {
        return this.body;
    }

}
