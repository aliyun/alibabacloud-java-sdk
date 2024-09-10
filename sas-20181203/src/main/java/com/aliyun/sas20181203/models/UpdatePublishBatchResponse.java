// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublishBatchResponseBody body;

    public static UpdatePublishBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishBatchResponse self = new UpdatePublishBatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublishBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublishBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublishBatchResponse setBody(UpdatePublishBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublishBatchResponseBody getBody() {
        return this.body;
    }

}
