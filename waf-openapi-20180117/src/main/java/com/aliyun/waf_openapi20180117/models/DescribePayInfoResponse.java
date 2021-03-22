// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribePayInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePayInfoResponseBody body;

    public static DescribePayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePayInfoResponse self = new DescribePayInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePayInfoResponse setBody(DescribePayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePayInfoResponseBody getBody() {
        return this.body;
    }

}
