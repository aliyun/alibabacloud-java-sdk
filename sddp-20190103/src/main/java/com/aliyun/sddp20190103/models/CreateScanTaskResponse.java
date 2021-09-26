// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScanTaskResponseBody body;

    public static CreateScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScanTaskResponse self = new CreateScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScanTaskResponse setBody(CreateScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScanTaskResponseBody getBody() {
        return this.body;
    }

}
