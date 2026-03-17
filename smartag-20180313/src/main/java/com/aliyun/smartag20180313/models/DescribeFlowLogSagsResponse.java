// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeFlowLogSagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowLogSagsResponseBody body;

    public static DescribeFlowLogSagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogSagsResponse self = new DescribeFlowLogSagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogSagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowLogSagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowLogSagsResponse setBody(DescribeFlowLogSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowLogSagsResponseBody getBody() {
        return this.body;
    }

}
