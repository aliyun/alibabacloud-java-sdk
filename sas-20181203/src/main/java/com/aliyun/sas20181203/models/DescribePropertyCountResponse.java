// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyCountResponseBody body;

    public static DescribePropertyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountResponse self = new DescribePropertyCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyCountResponse setBody(DescribePropertyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyCountResponseBody getBody() {
        return this.body;
    }

}
