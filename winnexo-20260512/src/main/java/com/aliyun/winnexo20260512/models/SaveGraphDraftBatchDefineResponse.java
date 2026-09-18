// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftBatchDefineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveGraphDraftBatchDefineResponseBody body;

    public static SaveGraphDraftBatchDefineResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftBatchDefineResponse self = new SaveGraphDraftBatchDefineResponse();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftBatchDefineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveGraphDraftBatchDefineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveGraphDraftBatchDefineResponse setBody(SaveGraphDraftBatchDefineResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveGraphDraftBatchDefineResponseBody getBody() {
        return this.body;
    }

}
