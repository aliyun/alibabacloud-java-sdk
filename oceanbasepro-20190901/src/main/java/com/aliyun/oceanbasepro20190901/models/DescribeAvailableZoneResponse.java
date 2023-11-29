// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableZoneResponseBody body;

    public static DescribeAvailableZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZoneResponse self = new DescribeAvailableZoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableZoneResponse setBody(DescribeAvailableZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableZoneResponseBody getBody() {
        return this.body;
    }

}
