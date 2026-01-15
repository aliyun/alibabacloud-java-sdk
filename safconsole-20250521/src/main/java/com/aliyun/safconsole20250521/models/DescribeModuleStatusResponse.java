// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModuleStatusResponseBody body;

    public static DescribeModuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleStatusResponse self = new DescribeModuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModuleStatusResponse setBody(DescribeModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModuleStatusResponseBody getBody() {
        return this.body;
    }

}
