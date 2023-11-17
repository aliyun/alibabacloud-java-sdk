// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentsJsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComponentsJsResponseBody body;

    public static DescribeComponentsJsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsJsResponse self = new DescribeComponentsJsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsJsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentsJsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentsJsResponse setBody(DescribeComponentsJsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentsJsResponseBody getBody() {
        return this.body;
    }

}
