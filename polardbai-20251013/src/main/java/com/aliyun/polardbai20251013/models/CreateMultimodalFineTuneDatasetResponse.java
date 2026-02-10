// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultimodalFineTuneDatasetResponseBody body;

    public static CreateMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalFineTuneDatasetResponse self = new CreateMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultimodalFineTuneDatasetResponse setBody(CreateMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
