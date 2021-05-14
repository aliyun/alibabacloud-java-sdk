// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskListCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskListCheckResultResponseBody body;

    public static DescribeRiskListCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskListCheckResultResponse self = new DescribeRiskListCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskListCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskListCheckResultResponse setBody(DescribeRiskListCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskListCheckResultResponseBody getBody() {
        return this.body;
    }

}
