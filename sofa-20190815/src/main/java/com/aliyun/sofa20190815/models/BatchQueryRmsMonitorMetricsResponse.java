// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchQueryRmsMonitorMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryRmsMonitorMetricsResponseBody body;

    public static BatchQueryRmsMonitorMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryRmsMonitorMetricsResponse self = new BatchQueryRmsMonitorMetricsResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryRmsMonitorMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryRmsMonitorMetricsResponse setBody(BatchQueryRmsMonitorMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryRmsMonitorMetricsResponseBody getBody() {
        return this.body;
    }

}
