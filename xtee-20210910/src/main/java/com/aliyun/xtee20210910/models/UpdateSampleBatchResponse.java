// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateSampleBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSampleBatchResponseBody body;

    public static UpdateSampleBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleBatchResponse self = new UpdateSampleBatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSampleBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSampleBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSampleBatchResponse setBody(UpdateSampleBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSampleBatchResponseBody getBody() {
        return this.body;
    }

}
