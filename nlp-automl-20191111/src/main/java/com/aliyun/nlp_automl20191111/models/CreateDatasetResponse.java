// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatasetResponseBody body;

    public static CreateDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetResponse self = new CreateDatasetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetResponse setBody(CreateDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetResponseBody getBody() {
        return this.body;
    }

}
