// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeFlowLogSagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeFlowLogSagsResponse setBody(DescribeFlowLogSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowLogSagsResponseBody getBody() {
        return this.body;
    }

}
