// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackGroupOperationResultsResponseBody body;

    public static ListStackGroupOperationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationResultsResponse self = new ListStackGroupOperationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackGroupOperationResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackGroupOperationResultsResponse setBody(ListStackGroupOperationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupOperationResultsResponseBody getBody() {
        return this.body;
    }

}
