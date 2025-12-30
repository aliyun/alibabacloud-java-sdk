// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultimodalDatasetResponseBody body;

    public static CreateMultimodalDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalDatasetResponse self = new CreateMultimodalDatasetResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultimodalDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultimodalDatasetResponse setBody(CreateMultimodalDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultimodalDatasetResponseBody getBody() {
        return this.body;
    }

}
