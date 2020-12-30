// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeChangesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangesResponseBody body;

    public static DescribeChangesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangesResponse self = new DescribeChangesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangesResponse setBody(DescribeChangesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangesResponseBody getBody() {
        return this.body;
    }

}
