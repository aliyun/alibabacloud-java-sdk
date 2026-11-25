// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListLLMGatewayMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLLMGatewayMetricsResponseBody body;

    public static ListLLMGatewayMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLLMGatewayMetricsResponse self = new ListLLMGatewayMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListLLMGatewayMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLLMGatewayMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLLMGatewayMetricsResponse setBody(ListLLMGatewayMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLLMGatewayMetricsResponseBody getBody() {
        return this.body;
    }

}
