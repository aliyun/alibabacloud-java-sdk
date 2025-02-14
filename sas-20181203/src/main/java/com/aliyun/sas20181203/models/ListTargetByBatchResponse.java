// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListTargetByBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTargetByBatchResponseBody body;

    public static ListTargetByBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTargetByBatchResponse self = new ListTargetByBatchResponse();
        return TeaModel.build(map, self);
    }

    public ListTargetByBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTargetByBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTargetByBatchResponse setBody(ListTargetByBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTargetByBatchResponseBody getBody() {
        return this.body;
    }

}
