// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestFixedFlowDividersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListABTestFixedFlowDividersResponseBody body;

    public static ListABTestFixedFlowDividersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABTestFixedFlowDividersResponse self = new ListABTestFixedFlowDividersResponse();
        return TeaModel.build(map, self);
    }

    public ListABTestFixedFlowDividersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABTestFixedFlowDividersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListABTestFixedFlowDividersResponse setBody(ListABTestFixedFlowDividersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestFixedFlowDividersResponseBody getBody() {
        return this.body;
    }

}
