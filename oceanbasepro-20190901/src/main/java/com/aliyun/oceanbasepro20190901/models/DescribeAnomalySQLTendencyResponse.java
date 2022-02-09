// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLTendencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnomalySQLTendencyResponseBody body;

    public static DescribeAnomalySQLTendencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLTendencyResponse self = new DescribeAnomalySQLTendencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLTendencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnomalySQLTendencyResponse setBody(DescribeAnomalySQLTendencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnomalySQLTendencyResponseBody getBody() {
        return this.body;
    }

}
