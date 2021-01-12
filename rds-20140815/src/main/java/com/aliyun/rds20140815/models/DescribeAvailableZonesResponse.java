// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableZonesResponseBody body;

    public static DescribeAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesResponse self = new DescribeAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableZonesResponse setBody(DescribeAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
