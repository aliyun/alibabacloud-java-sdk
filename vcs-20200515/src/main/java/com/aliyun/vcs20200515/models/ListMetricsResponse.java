// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetricsResponseBody body;

    public static ListMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponse self = new ListMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetricsResponse setBody(ListMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetricsResponseBody getBody() {
        return this.body;
    }

}
