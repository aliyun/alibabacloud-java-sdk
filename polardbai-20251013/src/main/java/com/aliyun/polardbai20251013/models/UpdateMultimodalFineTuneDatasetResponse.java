// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UpdateMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultimodalFineTuneDatasetResponseBody body;

    public static UpdateMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultimodalFineTuneDatasetResponse self = new UpdateMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultimodalFineTuneDatasetResponse setBody(UpdateMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
