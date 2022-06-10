// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowLogsResponseBody body;

    public static DescribeFlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsResponse self = new DescribeFlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowLogsResponse setBody(DescribeFlowLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowLogsResponseBody getBody() {
        return this.body;
    }

}
