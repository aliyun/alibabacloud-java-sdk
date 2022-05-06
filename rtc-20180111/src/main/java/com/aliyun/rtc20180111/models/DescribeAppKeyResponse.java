// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppKeyResponseBody body;

    public static DescribeAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyResponse self = new DescribeAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppKeyResponse setBody(DescribeAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppKeyResponseBody getBody() {
        return this.body;
    }

}
