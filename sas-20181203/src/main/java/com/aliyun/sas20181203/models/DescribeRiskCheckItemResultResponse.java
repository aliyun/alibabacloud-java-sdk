// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckItemResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskCheckItemResultResponseBody body;

    public static DescribeRiskCheckItemResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckItemResultResponse self = new DescribeRiskCheckItemResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckItemResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskCheckItemResultResponse setBody(DescribeRiskCheckItemResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskCheckItemResultResponseBody getBody() {
        return this.body;
    }

}
