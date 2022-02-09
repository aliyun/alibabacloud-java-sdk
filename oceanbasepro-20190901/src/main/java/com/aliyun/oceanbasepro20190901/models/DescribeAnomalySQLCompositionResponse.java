// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLCompositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnomalySQLCompositionResponseBody body;

    public static DescribeAnomalySQLCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLCompositionResponse self = new DescribeAnomalySQLCompositionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLCompositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnomalySQLCompositionResponse setBody(DescribeAnomalySQLCompositionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnomalySQLCompositionResponseBody getBody() {
        return this.body;
    }

}
