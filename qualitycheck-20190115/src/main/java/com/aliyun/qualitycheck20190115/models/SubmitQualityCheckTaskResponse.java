// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitQualityCheckTaskResponseBody body;

    public static SubmitQualityCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityCheckTaskResponse self = new SubmitQualityCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitQualityCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitQualityCheckTaskResponse setBody(SubmitQualityCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitQualityCheckTaskResponseBody getBody() {
        return this.body;
    }

}
