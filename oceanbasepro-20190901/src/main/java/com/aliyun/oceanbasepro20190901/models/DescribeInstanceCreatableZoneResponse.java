// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCreatableZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceCreatableZoneResponseBody body;

    public static DescribeInstanceCreatableZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCreatableZoneResponse self = new DescribeInstanceCreatableZoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCreatableZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceCreatableZoneResponse setBody(DescribeInstanceCreatableZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceCreatableZoneResponseBody getBody() {
        return this.body;
    }

}
