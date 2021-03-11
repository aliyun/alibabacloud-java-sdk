// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePresetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePresetsResponseBody body;

    public static DescribePresetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePresetsResponse self = new DescribePresetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePresetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePresetsResponse setBody(DescribePresetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePresetsResponseBody getBody() {
        return this.body;
    }

}
