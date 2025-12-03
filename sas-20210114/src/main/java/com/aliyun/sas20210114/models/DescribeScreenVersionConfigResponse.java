// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenVersionConfigResponseBody body;

    public static DescribeScreenVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenVersionConfigResponse self = new DescribeScreenVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenVersionConfigResponse setBody(DescribeScreenVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenVersionConfigResponseBody getBody() {
        return this.body;
    }

}
