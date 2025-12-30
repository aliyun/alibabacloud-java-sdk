// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultimodalDatasetResponseBody body;

    public static DeleteMultimodalDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalDatasetResponse self = new DeleteMultimodalDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultimodalDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultimodalDatasetResponse setBody(DeleteMultimodalDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultimodalDatasetResponseBody getBody() {
        return this.body;
    }

}
