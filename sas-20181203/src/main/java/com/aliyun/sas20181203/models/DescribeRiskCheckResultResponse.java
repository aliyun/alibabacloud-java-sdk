// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskCheckResultResponseBody body;

    public static DescribeRiskCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckResultResponse self = new DescribeRiskCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskCheckResultResponse setBody(DescribeRiskCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskCheckResultResponseBody getBody() {
        return this.body;
    }

}
