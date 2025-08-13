// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleBatchMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSampleBatchMetaResponseBody body;

    public static DeleteSampleBatchMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleBatchMetaResponse self = new DeleteSampleBatchMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSampleBatchMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSampleBatchMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSampleBatchMetaResponse setBody(DeleteSampleBatchMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSampleBatchMetaResponseBody getBody() {
        return this.body;
    }

}
