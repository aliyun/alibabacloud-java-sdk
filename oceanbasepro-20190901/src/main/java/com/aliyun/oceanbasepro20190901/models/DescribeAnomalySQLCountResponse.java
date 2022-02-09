// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnomalySQLCountResponseBody body;

    public static DescribeAnomalySQLCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLCountResponse self = new DescribeAnomalySQLCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnomalySQLCountResponse setBody(DescribeAnomalySQLCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnomalySQLCountResponseBody getBody() {
        return this.body;
    }

}
