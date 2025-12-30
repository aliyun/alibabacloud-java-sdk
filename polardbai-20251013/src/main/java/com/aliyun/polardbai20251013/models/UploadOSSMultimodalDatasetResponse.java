// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UploadOSSMultimodalDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadOSSMultimodalDatasetResponseBody body;

    public static UploadOSSMultimodalDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadOSSMultimodalDatasetResponse self = new UploadOSSMultimodalDatasetResponse();
        return TeaModel.build(map, self);
    }

    public UploadOSSMultimodalDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadOSSMultimodalDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadOSSMultimodalDatasetResponse setBody(UploadOSSMultimodalDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadOSSMultimodalDatasetResponseBody getBody() {
        return this.body;
    }

}
