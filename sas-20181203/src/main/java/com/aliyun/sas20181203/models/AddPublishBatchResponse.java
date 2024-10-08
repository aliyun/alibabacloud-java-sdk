// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPublishBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPublishBatchResponseBody body;

    public static AddPublishBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPublishBatchResponse self = new AddPublishBatchResponse();
        return TeaModel.build(map, self);
    }

    public AddPublishBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPublishBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPublishBatchResponse setBody(AddPublishBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPublishBatchResponseBody getBody() {
        return this.body;
    }

}
