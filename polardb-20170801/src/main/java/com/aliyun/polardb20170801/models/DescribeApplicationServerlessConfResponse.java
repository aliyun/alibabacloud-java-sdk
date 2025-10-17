// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationServerlessConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationServerlessConfResponseBody body;

    public static DescribeApplicationServerlessConfResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationServerlessConfResponse self = new DescribeApplicationServerlessConfResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationServerlessConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationServerlessConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationServerlessConfResponse setBody(DescribeApplicationServerlessConfResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationServerlessConfResponseBody getBody() {
        return this.body;
    }

}
