// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeFlowLogsResponse setBody(DescribeFlowLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowLogsResponseBody getBody() {
        return this.body;
    }

}
