// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppGroupMetricsResponseBody body;

    public static ListAppGroupMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupMetricsResponse self = new ListAppGroupMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupMetricsResponse setBody(ListAppGroupMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupMetricsResponseBody getBody() {
        return this.body;
    }

}
