// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSlsUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsUrlConfigResponseBody body;

    public static DescribeSlsUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsUrlConfigResponse self = new DescribeSlsUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsUrlConfigResponse setBody(DescribeSlsUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsUrlConfigResponseBody getBody() {
        return this.body;
    }

}
