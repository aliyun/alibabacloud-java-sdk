// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCommandsResponseBody body;

    public static DescribeCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponse self = new DescribeCommandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommandsResponse setBody(DescribeCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommandsResponseBody getBody() {
        return this.body;
    }

}
