// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoScalingMetricsResponseBody body;

    public static ListAutoScalingMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingMetricsResponse self = new ListAutoScalingMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingMetricsResponse setBody(ListAutoScalingMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingMetricsResponseBody getBody() {
        return this.body;
    }

}
