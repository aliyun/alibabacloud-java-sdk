// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRestoreJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRestoreJobResponseBody body;

    public static CreateRestoreJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreJobResponse self = new CreateRestoreJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateRestoreJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRestoreJobResponse setBody(CreateRestoreJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRestoreJobResponseBody getBody() {
        return this.body;
    }

}
