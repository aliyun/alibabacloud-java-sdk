// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeStandbyCreateModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStandbyCreateModeResponseBody body;

    public static DescribeStandbyCreateModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStandbyCreateModeResponse self = new DescribeStandbyCreateModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStandbyCreateModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStandbyCreateModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStandbyCreateModeResponse setBody(DescribeStandbyCreateModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStandbyCreateModeResponseBody getBody() {
        return this.body;
    }

}
