// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppConfigResponseBody body;

    public static DescribeAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConfigResponse self = new DescribeAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppConfigResponse setBody(DescribeAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppConfigResponseBody getBody() {
        return this.body;
    }

}
