// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModuleConfigResponseBody body;

    public static DescribeModuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleConfigResponse self = new DescribeModuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModuleConfigResponse setBody(DescribeModuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModuleConfigResponseBody getBody() {
        return this.body;
    }

}
