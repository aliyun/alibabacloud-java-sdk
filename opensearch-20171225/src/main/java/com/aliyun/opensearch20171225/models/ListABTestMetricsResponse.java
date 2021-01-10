// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListABTestMetricsResponseBody body;

    public static ListABTestMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABTestMetricsResponse self = new ListABTestMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListABTestMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABTestMetricsResponse setBody(ListABTestMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestMetricsResponseBody getBody() {
        return this.body;
    }

}
