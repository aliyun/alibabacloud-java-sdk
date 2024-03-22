// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeUsedInfosResponseBody body;

    public static DescribeNodeUsedInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeUsedInfosResponse self = new DescribeNodeUsedInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeUsedInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeUsedInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeUsedInfosResponse setBody(DescribeNodeUsedInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeUsedInfosResponseBody getBody() {
        return this.body;
    }

}
