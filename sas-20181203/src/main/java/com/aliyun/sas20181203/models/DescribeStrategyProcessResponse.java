// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStrategyProcessResponseBody body;

    public static DescribeStrategyProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyProcessResponse self = new DescribeStrategyProcessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrategyProcessResponse setBody(DescribeStrategyProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrategyProcessResponseBody getBody() {
        return this.body;
    }

}
