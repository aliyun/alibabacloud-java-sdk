// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeZonesResponseBody body;

    public static DescribeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponse self = new DescribeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZonesResponse setBody(DescribeZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZonesResponseBody getBody() {
        return this.body;
    }

}
