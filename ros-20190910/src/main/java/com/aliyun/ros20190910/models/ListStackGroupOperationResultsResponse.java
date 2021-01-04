// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListStackGroupOperationResultsResponse setBody(ListStackGroupOperationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupOperationResultsResponseBody getBody() {
        return this.body;
    }

}
