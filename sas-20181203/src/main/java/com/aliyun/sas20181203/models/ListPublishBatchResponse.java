// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPublishBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishBatchResponseBody body;

    public static ListPublishBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishBatchResponse self = new ListPublishBatchResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishBatchResponse setBody(ListPublishBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishBatchResponseBody getBody() {
        return this.body;
    }

}
