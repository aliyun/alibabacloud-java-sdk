// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTopNMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTTopNMetricsResponseBody body;

    public static ListDSTTopNMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTopNMetricsResponse self = new ListDSTTopNMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTTopNMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTTopNMetricsResponse setBody(ListDSTTopNMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTTopNMetricsResponseBody getBody() {
        return this.body;
    }

}
