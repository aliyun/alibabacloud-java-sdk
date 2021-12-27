// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class CreateImportIngestionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImportIngestionJobResponseBody body;

    public static CreateImportIngestionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImportIngestionJobResponse self = new CreateImportIngestionJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateImportIngestionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImportIngestionJobResponse setBody(CreateImportIngestionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImportIngestionJobResponseBody getBody() {
        return this.body;
    }

}
