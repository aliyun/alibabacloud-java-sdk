// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteOSSMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOSSMultimodalFineTuneDatasetResponseBody body;

    public static DeleteOSSMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOSSMultimodalFineTuneDatasetResponse self = new DeleteOSSMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOSSMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponse setBody(DeleteOSSMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOSSMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
