// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultimodalFineTuneDatasetResponseBody body;

    public static DeleteMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalFineTuneDatasetResponse self = new DeleteMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultimodalFineTuneDatasetResponse setBody(DeleteMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
