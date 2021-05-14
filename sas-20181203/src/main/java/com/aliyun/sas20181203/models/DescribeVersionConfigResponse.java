// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVersionConfigResponseBody body;

    public static DescribeVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigResponse self = new DescribeVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVersionConfigResponse setBody(DescribeVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVersionConfigResponseBody getBody() {
        return this.body;
    }

}
