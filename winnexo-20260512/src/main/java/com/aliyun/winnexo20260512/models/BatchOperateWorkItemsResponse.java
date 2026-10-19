// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchOperateWorkItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchOperateWorkItemsResponseBody body;

    public static BatchOperateWorkItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateWorkItemsResponse self = new BatchOperateWorkItemsResponse();
        return TeaModel.build(map, self);
    }

    public BatchOperateWorkItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchOperateWorkItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchOperateWorkItemsResponse setBody(BatchOperateWorkItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchOperateWorkItemsResponseBody getBody() {
        return this.body;
    }

}
