// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpireCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExpireCachesResponseBody body;

    public static DescribeExpireCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpireCachesResponse self = new DescribeExpireCachesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpireCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpireCachesResponse setBody(DescribeExpireCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpireCachesResponseBody getBody() {
        return this.body;
    }

}
