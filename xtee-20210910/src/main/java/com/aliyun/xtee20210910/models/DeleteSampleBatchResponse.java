// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSampleBatchResponseBody body;

    public static DeleteSampleBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleBatchResponse self = new DeleteSampleBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSampleBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSampleBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSampleBatchResponse setBody(DeleteSampleBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSampleBatchResponseBody getBody() {
        return this.body;
    }

}
