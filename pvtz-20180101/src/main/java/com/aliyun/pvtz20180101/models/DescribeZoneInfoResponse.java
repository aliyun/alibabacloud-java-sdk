// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeZoneInfoResponseBody body;

    public static DescribeZoneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneInfoResponse self = new DescribeZoneInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZoneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZoneInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZoneInfoResponse setBody(DescribeZoneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZoneInfoResponseBody getBody() {
        return this.body;
    }

}
