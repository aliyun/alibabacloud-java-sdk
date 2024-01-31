// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixCycleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageFixCycleConfigResponseBody body;

    public static DescribeImageFixCycleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixCycleConfigResponse self = new DescribeImageFixCycleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixCycleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFixCycleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageFixCycleConfigResponse setBody(DescribeImageFixCycleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFixCycleConfigResponseBody getBody() {
        return this.body;
    }

}
