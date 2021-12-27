// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateIngestionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIngestionJobResponseBody body;

    public static CreateIngestionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIngestionJobResponse self = new CreateIngestionJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateIngestionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIngestionJobResponse setBody(CreateIngestionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIngestionJobResponseBody getBody() {
        return this.body;
    }

}
