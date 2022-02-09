// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsVersionResponseBody body;

    public static DescribeOmsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsVersionResponse self = new DescribeOmsVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsVersionResponse setBody(DescribeOmsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsVersionResponseBody getBody() {
        return this.body;
    }

}
