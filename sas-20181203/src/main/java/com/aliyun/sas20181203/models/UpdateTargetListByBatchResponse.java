// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateTargetListByBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTargetListByBatchResponseBody body;

    public static UpdateTargetListByBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTargetListByBatchResponse self = new UpdateTargetListByBatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTargetListByBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTargetListByBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTargetListByBatchResponse setBody(UpdateTargetListByBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTargetListByBatchResponseBody getBody() {
        return this.body;
    }

}
